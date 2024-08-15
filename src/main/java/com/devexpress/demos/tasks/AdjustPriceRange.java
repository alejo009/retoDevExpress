package com.devexpress.demos.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
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
        Actions actions = new Actions(BrowseTheWeb.as(actor).getDriver());
        WebElement slider = Target.the("Price range slider")
                .locatedBy("//a[@id='MainContentPlaceHolder_FilterFormLayout_NightlyRateTrackBar_MD']//a[@id='MainContentPlaceHolder_FilterFormLayout_NightlyRateTrackBar_MD'] ")
                .resolveFor(actor);
        actions.clickAndHold(slider)
                .moveByOffset(offset,0)
                .release()
                .perform();
    }

    public static AdjustPriceRange to(int offset){
        return Tasks.instrumented(AdjustPriceRange.class,offset);
    }
}
