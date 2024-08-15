package com.devexpress.demos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HotelResultsPage {
    public static final Target PRICE_RANGE = Target.the("range of price").locatedBy("//a[@id='MainContentPlaceHolder_FilterFormLayout_NightlyRateTrackBar_MD']");
    public static final Target APPLY_FILTER_BUTTON = Target.the("apply filter button").locatedBy("//span[text()='APPLY']");
    public static final Target OUR_RATING_INPUT = Target.the("our rating input").locatedBy("//input[@id='MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_VI']");
    public static final Target PRICE_HOTEL = Target.the("price hotel").locatedBy("div.price");
    public static final Target HOTEL_LOWES_PRICE = Target.the("hotel lowest price").locatedBy("//span[text()='Book It']");

}
