package com.devexpress.demos.stepdefinitions;

import com.devexpress.demos.interactions.AppliedFilters;
import com.devexpress.demos.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.time.LocalDate;

import static com.devexpress.demos.ui.SearchHotel.FIELD_CHECKIN;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BookHotelStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened web hotel")
    public void givenThatHasOpenedTheHotel(String actorName) {
        OnStage.theActorCalled(actorName).wasAbleTo(NavigateToWebSite.theUrl());
    }

    @When("he selects {string} of location")
    public void hasSelectsCity(String city) {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.with(city)
        );
    }

    @And("he enters the check-in date as {string} as days from today")
    public void heEntersCheckInAndCheckOut(String checkInDay) {
        // Convert the valors
        int checkInDaysInt = Integer.parseInt(checkInDay);

        // calculate the dates
        LocalDate checkInDate = LocalDate.now().plusDays(checkInDaysInt);
        theActorInTheSpotlight().attemptsTo(
                SelectDayInCalendar.on(checkInDate, FIELD_CHECKIN)
        );
    }

    @And("he selects rooms {string}  {string} adults and {string} children")
    public void heEntersRoomAdultsAndChildren(String rooms, String adults, String children) {
        theActorInTheSpotlight().attemptsTo(
                SelectRoomsAdultsAndChildrens.selectRoomsAdultsAndChildrens(rooms, adults, children)
        );
    }

    @And("he filters by a price range greater than 200 USD {string}")
    public void heFiltersByPriceRangeGreaterThan(String offset) {
        //convert the offset to int
        int offsetConverted = Integer.parseInt(offset);
        theActorInTheSpotlight().attemptsTo(
                AdjustPriceRange.to(offsetConverted)
        );
    }

    @And("he filters by hotels with {string} stars or more")
    public void heFiltersByStarsOrMore(String stars) {
        //convert that starts to int
        int startsConverted = Integer.parseInt(stars);
        theActorInTheSpotlight().attemptsTo(
                DeselectAllStartCheckboxes.deselect(),
                SelectStarRating.forStarts(startsConverted)
        );
    }

    @And("he applies the selected filters")
    public void heAppliedFilters() {
        theActorInTheSpotlight().attemptsTo(
                AppliedFilters.appliedFiltersToHotel()
        );
    }

    @And("he select the cheapest available hotel")
    public void heSelectTheCheapestAvailableHotel(){
        theActorInTheSpotlight().attemptsTo(
                SelectCheapestHotel.select()
        );
    }
}