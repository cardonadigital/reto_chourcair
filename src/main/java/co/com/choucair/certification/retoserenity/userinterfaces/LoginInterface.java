package co.com.choucair.certification.retoserenity.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class LoginInterface {

    public static final Target TXT_USERNAME = Target
            .the("where the user enter the username")
            .located(id("LoginPanel0_Username"));

    public static final Target TXT_PASSWORD = Target
            .the("where the user enter the password")
            .located(id("LoginPanel0_Password"));

    public static final Target BTN_LOGIN = Target
            .the("load seccion")
            .located(id("LoginPanel0_LoginButton"));

    public static final Target ALERT_MISSING_LOGIN_FIELDS = Target
            .the("alert when there are some missing fields")
            .located(className("toast-message"));
}
