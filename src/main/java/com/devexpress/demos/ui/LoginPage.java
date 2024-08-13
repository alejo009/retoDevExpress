package com.devexpress.demos.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target FIELD_EMAIL = Target.the("gmail field").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_txtEmail_I']");
    public static final Target FIELD_PASSWORD = Target.the("password field").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_txtPassword_I_CLND']");
    public static final Target FIELD_CAPTCHA_CODE = Target.the("captcha code field").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_Captcha_TB_I']");
    public static final Target LOGIN_BUTTON_ON_FORM = Target.the("login button in the form").locatedBy("div[id='HeaderControl_LogonControl_btnLoginNow_CD'] span");
}
