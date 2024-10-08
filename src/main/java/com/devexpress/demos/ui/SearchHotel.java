package com.devexpress.demos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchHotel {
    public static final Target FIELD_LOCATION = Target.the("location field").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_LocationComboBox_I']");
    public static final Target CITY_CELL = Target.the("select city").locatedBy("//td[contains(text(), '{0}')]");
    public static final Target FIELD_CHECKIN = Target.the("check-in field").locatedBy("//td[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_CheckInDateEdit_B-1']");
    public static final Target DATE_SELECTOR = Target.the("day of calendar").locatedBy("//td[contains(@class, 'dxeCalendarDay_Metropolis') and text()='{0}']");
    public static final Target FIELD_ROOMS = Target.the("rooms field").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_RoomsComboBox_I']");
    public static final Target ROOM_OPTIONS = Target.the("room options").locatedBy("//td[contains(@class, 'dxeListBoxItem_Metropolis') and text()='{0}']");
    public static final Target FIELD_ADULTS = Target.the("adults field").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_AdultsSpinEdit_I']");
    public static final Target FIELD_CHILDRENS = Target.the("childrens field").locatedBy("//input[@id='MainContentPlaceHolder_SearchPanel_SearchPanelLayout_ChildrenSpinEdit_I']");
    public static final Target BUTTON_SEARCH_HOTEL = Target.the("search hotel button").locatedBy("//span[contains(text(), 'SEARCH')]");
}
