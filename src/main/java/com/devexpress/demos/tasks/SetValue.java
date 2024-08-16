package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;

public class SetValue implements Task {
    private final Target target;
    private final String value;

    public SetValue(Target target, String value) {
        this.target = target;
        this.value = value;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        js.executeScript("arguments[0].value = arguments[1];", target.resolveFor(actor), value);
    }

    public static SetValue on(Target target, String value) {
        return Tasks.instrumented(SetValue.class, target, value);
    }
}
