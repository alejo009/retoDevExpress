package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.devexpress.demos.ui.HomePage.LOGIN_BUTTON_ON_HOMEPAGE;
import static com.devexpress.demos.ui.LoginPage.*;

public class LoginUser implements Task {
    private final String email;
    private final String password;
    private final String recaptcha;

    public LoginUser(String email, String password, String recaptcha) {
        this.email = email;
        this.password = password;
        this.recaptcha = recaptcha;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LOGIN_BUTTON_ON_HOMEPAGE),
                Enter.theValue(email).into(FIELD_EMAIL),
                SetValue.on(FIELD_PASSWORD, password),
                Enter.theValue(recaptcha).into(FIELD_CAPTCHA_CODE),
                Click.on(LOGIN_BUTTON_ON_FORM)
        );
    }

    public static LoginUser loginUser(String email, String password, String recaptcha) {
        return Tasks.instrumented(LoginUser.class, email, password, recaptcha);
    }
}