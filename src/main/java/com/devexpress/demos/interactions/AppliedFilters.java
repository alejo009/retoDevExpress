package com.devexpress.demos.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.devexpress.demos.ui.HotelResultsPage.APPLY_FILTER_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AppliedFilters implements Interaction {

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(APPLY_FILTER_BUTTON)
        );
    }

    public static AppliedFilters appliedFiltersToHotel() {
        return instrumented(AppliedFilters.class);
    }
}
