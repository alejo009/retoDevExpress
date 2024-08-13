package com.devexpress.demos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LOGIN_BUTTON_ON_HOMEPAGE = Target.the("Login button in home page").locatedBy("div[id='HeaderControl_Login_CD'] span");
}
