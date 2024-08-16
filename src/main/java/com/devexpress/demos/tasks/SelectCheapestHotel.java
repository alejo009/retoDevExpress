package com.devexpress.demos.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import static com.devexpress.demos.ui.HotelResultsPage.*;

public class SelectCheapestHotel implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        //capture all hotel blocks that contain the price and the reservation button
        List<WebElementFacade> hotelBlocks = HOTEL_BLOCKS.resolveAllFor(actor);

        //variable to store the index and the lowest price
        int minPriceIndex = -1;
        double minPrice = Double.MAX_VALUE;
        //Iterate over each hotel block to extract prices
        for (int i = 0; i < hotelBlocks.size(); i++) {
            WebElementFacade block = hotelBlocks.get(i);

            //Extract block price
            String priceText = block.findBy(".price").getText().replace("$", "").replace(",", "").trim();
            double price;
            try {
                price = Double.parseDouble(priceText);
            } catch (NumberFormatException e) {
                continue;  // Si no se puede convertir, continuar con el siguiente bloque
            }
            //Compare to find the lowest price
            if (price < minPrice) {
                minPrice = price;
                minPriceIndex = i;
            }
        }

        //If we find a block with the lowest price, we click its "Book It" button
        if (minPriceIndex != -1) {
            WebElementFacade cheapestHotelBlock = hotelBlocks.get(minPriceIndex);
            cheapestHotelBlock.findBy(".dx-vam").click();  //Click the "Book It" button"
        }

    }

    public static SelectCheapestHotel select() {
        return Tasks.instrumented(SelectCheapestHotel.class);
    }
}
