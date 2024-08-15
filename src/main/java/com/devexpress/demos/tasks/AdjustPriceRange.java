package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.devexpress.demos.ui.HotelResultsPage.PRICE_RANGE;

public class AdjustPriceRange implements Task {
    private final int offset;

    public AdjustPriceRange(int offset){
        this.offset = offset;
    }

    @Override
    public <T extends Actor>void performAs(T actor){
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        WebElement slider = PRICE_RANGE.resolveFor(actor);

        Actions actions = new Actions(driver);
        actions.clickAndHold(slider)
                .moveByOffset(offset, 0)  // Mueve el slider horizontalmente
                .release()
                .perform();  // Ejecuta la acción

    }

    public static AdjustPriceRange to(int offset){
        return Tasks.instrumented(AdjustPriceRange.class,offset);
    }
}
