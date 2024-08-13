package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateToWebSite implements Task {
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Open.url("https://demos.devexpress.com/rwa/dxhotels/")
        );
    }

    public static NavigateToWebSite theUrl(){
        return Tasks.instrumented(NavigateToWebSite.class);
    }
}