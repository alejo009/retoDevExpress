package com.devexpress.demos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class FilterHotelPage {
    public static final Target STAR_3_CHECKBOX = Target.the("checkbox con 3 estrellas").locatedBy("#MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB2_I_D");
    public static final Target STAR_4_CHECKBOX = Target.the("checkbox con 4 estrellas").locatedBy("#MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB3_I_D");
    public static final Target STAR_5_CHECKBOX = Target.the("checkbox con 5 estrellas").locatedBy("#MainContentPlaceHolder_FilterFormLayout_OurRatingCheckBoxList_RB4_I_D");
    public static final Target ALL_STAR_CHECKBOXES = Target.the("localizador generico con todos los checkbox").locatedBy("//span[contains(@class, 'dxICheckBox_Metropolis')]");
}
