package com.devexpress.demos.stepdefinitions;

import com.devexpress.demos.tasks.NavigateToWebSite;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;

public class CommonStepDefinitions {
    @Given("that {string} has opened hotel homepage")
    public void givenThatHasOpenedTheStore(String actorName) {
        OnStage.theActorCalled(actorName).wasAbleTo(NavigateToWebSite.theUrl());
    }
}
