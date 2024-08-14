package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Sleep implements Task {
    private final int milisegundos;
    public Sleep(int milisegundos) {
        this.milisegundos = milisegundos;
    }

    public static Sleep por(int milisegundos) {
        return new Sleep(milisegundos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
