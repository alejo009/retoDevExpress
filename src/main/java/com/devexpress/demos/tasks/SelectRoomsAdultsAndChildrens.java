package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static com.devexpress.demos.ui.SearchHotel.*;

public class SelectRoomsAdultsAndChildrens implements Task {
    private final String rooms;
    private final String adults;
    private final String children;

    public SelectRoomsAdultsAndChildrens(String rooms, String adults, String children) {
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Target roomOptions = ROOM_OPTIONS.of(rooms);
        actor.attemptsTo(
                //actions filed rooms
                Click.on(FIELD_ROOMS),
                Click.on(roomOptions),
                //actions field adults
                Click.on(FIELD_ADULTS),
                Enter.theValue(Keys.CONTROL + "a").into(FIELD_ADULTS),
                Enter.theValue(Keys.BACK_SPACE).into(FIELD_ADULTS),// Elimina el texto seleccionado
                Enter.theValue(adults).into(FIELD_ADULTS),
                //actions field children
                Click.on(FIELD_CHILDRENS),
                Enter.theValue(Keys.CONTROL + "a").into(FIELD_CHILDRENS),
                Enter.theValue(Keys.BACK_SPACE).into(FIELD_CHILDRENS),  // Elimina el texto seleccionado
                Enter.theValue(children).into(FIELD_CHILDRENS),
                Click.on(BUTTON_SEARCH_HOTEL)
        );
    }

    public static SelectRoomsAdultsAndChildrens selectRoomsAdultsAndChildrens(String rooms, String adults, String children) {
        return Tasks.instrumented(SelectRoomsAdultsAndChildrens.class, rooms, adults, children);
    }
}