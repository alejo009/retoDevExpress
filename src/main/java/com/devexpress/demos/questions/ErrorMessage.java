package com.devexpress.demos.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static com.devexpress.demos.ui.LoginPage.ERROR_MESSAGE;

public class ErrorMessage implements Question<String> {

    @Override
    public String answeredBy(Actor actor){
        String currentErrorMessage = Text.of(ERROR_MESSAGE).answeredBy(actor);
        return currentErrorMessage;
    }

    public static ErrorMessage incorrectCode(){
        return new ErrorMessage();
    }
}