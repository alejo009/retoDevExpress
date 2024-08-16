package com.devexpress.demos.tasks;

import com.devexpress.demos.ui.SearchHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


import java.time.LocalDate;


public class SelectDayInCalendar implements Task {
    private final LocalDate date;
    private final Target calendarField;

    public SelectDayInCalendar(LocalDate date, Target calendarField) {
        this.date = date;
        this.calendarField = calendarField;
    }

    public <T extends Actor> void performAs(T actor) {
        String day = String.valueOf(date.getDayOfMonth());
        Target dateSelector = SearchHotel.DATE_SELECTOR.of(day);
        actor.attemptsTo(
                Click.on(calendarField),
                Click.on(dateSelector)
        );
    }

    public static SelectDayInCalendar on(LocalDate date, Target calendarField) {
        return Tasks.instrumented(SelectDayInCalendar.class, date, calendarField);
    }
}