package com.devexpress.demos.stepdefinitions;

import com.devexpress.demos.questions.ErrorMessage;
import com.devexpress.demos.tasks.LoginUser;
import com.devexpress.demos.tasks.NavigateToWebSite;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {string} has opened hotel homepage")
    public void givenThatHasOpenedTheStore(String actorName) {
        OnStage.theActorCalled(actorName).wasAbleTo(NavigateToWebSite.theUrl());
    }

    @When("he enters email {string} and password {string} and invalid reCAPTCHA code {string}")
    public void heLoginWithInvalidCaptcha(String email, String password, String recaptcha) {
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUser(email, password, recaptcha));
    }

/*    @Then("an error message should be displayed saying {string}")
    public void verifyErrorMessage(String expectedMessage) {
        theActorInTheSpotlight().should(seeThat(ErrorMessage.incorrectCode(), equalTo("The submitted code is incorrect")));
    }*/

}
