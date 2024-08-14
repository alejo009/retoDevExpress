package com.devexpress.demos.tasks;

import com.devexpress.demos.ui.SearchHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.devexpress.demos.ui.SearchHotel.FIELD_LOCATION;

public class SelectCity implements Task {
    private final String city;

    public SelectCity(String city){
        this.city = city;
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        Target cityCell = SearchHotel.CITY_CELL.of(city);

        actor.attemptsTo(
                Click.on(FIELD_LOCATION),
                Click.on(cityCell)
        );
    }

    public static SelectCity with(String city){
        return Tasks.instrumented(SelectCity.class, city);
    }

}
