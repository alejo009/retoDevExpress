package com.devexpress.demos.stepdefinitions;

import com.devexpress.demos.tasks.NavigateToWebSite;
import com.devexpress.demos.tasks.SelectCity;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


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
}