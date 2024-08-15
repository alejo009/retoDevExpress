package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import static com.devexpress.demos.ui.FilterHotelPage.*;

public class SelectStarRating implements Task {

    private final int stars;

    public SelectStarRating(int stars) {
        this.stars = stars;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target starCheckbox;

        switch (stars) {
            case 3:
                starCheckbox = STAR_3_CHECKBOX;
                break;
            case 4:
                starCheckbox = STAR_4_CHECKBOX;
                break;
            case 5:
                starCheckbox = STAR_5_CHECKBOX;
                break;

            default:
                throw new IllegalArgumentException("invalid star rating" + stars);
        }

        //verifica si ya esta seleccionado
        WebElement checkBoxElement = starCheckbox.resolveFor(actor);
        String classAttribute = checkBoxElement.getAttribute("class");

        if (classAttribute != null && classAttribute.contains("dxWeb_edtCheckBoxChecked_Metropolis")) {
            actor.attemptsTo(
                    Click.on(starCheckbox)
            );
        }

        actor.attemptsTo(
                Click.on(starCheckbox)
        );
    }

    public static SelectStarRating forStarts(int stars) {
        return Tasks.instrumented(SelectStarRating.class, stars);
    }
}
