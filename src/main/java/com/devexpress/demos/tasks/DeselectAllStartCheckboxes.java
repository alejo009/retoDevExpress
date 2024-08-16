package com.devexpress.demos.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.devexpress.demos.ui.FilterHotelPage.ALL_STAR_CHECKBOXES;

public class DeselectAllStartCheckboxes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        // Uncheck all spans if selected (based on CSS class)
        for (WebElementFacade checkbox : ALL_STAR_CHECKBOXES.resolveAllFor(actor)) {
            if (checkbox.getAttribute("class").contains("dxWeb_edtCheckBoxChecked_Metropolis")) {
                actor.attemptsTo(
                        Click.on(checkbox)
                );
            }
        }

    }

    public static DeselectAllStartCheckboxes deselect() {
        return Tasks.instrumented(DeselectAllStartCheckboxes.class);
    }
}
