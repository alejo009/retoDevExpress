package com.devexpress.demos.stepdefinitions;

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

    @And("he enters the check-in date as {string} and check-out data {string} as days from today")
    public void heEntersCheckInAndCheckOut(String checkInDay, String checkOutDays) {
        // Convertir valores
        int checkInDaysInt = Integer.parseInt(checkInDay);
        int checkOutDaysInt = Integer.parseInt(checkOutDays);

        // calcula las fechas
        LocalDate checkInDate = LocalDate.now().plusDays(checkInDaysInt);
        LocalDate checkOutDate = LocalDate.now().plusDays(checkOutDaysInt);
        theActorInTheSpotlight().attemptsTo(
                SelectDayInCalendar.on(checkInDate, FIELD_CHECKIN)
        );
    }

    @And("he selects rooms {string}  {string} adults and {string} children")
    public void heEntersRoomAdultsAndChildren(String rooms,String adults,String children){
        theActorInTheSpotlight().attemptsTo(
                SelectRoomsAdultsAndChildrens.selectRoomsAdultsAndChildrens(rooms,adults,children)
        );
    }

    @And("he filters by a price range greater than 200 USD")
    public void heFiltersByPriceRangeGreaterThan(String offSet){
        int convertedOffSet = Integer.parseInt(offSet);
        theActorInTheSpotlight().attemptsTo(
                AdjustPriceRange.to(convertedOffSet)
        );

    }
}