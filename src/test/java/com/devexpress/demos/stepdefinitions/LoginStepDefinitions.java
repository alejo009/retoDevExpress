package com.devexpress.demos.stepdefinitions;

import com.devexpress.demos.tasks.LoginUser;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("he enters email {string} and password {string} and invalid reCAPTCHA code {string}")
    public void heLoginWithInvalidCaptcha(String email, String password, String recaptcha){
        theActorInTheSpotlight().attemptsTo(LoginUser.loginUser(email, password, recaptcha));
    }

}
