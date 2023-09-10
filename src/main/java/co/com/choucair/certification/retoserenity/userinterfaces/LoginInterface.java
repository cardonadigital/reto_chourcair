package co.com.choucair.certification.retoserenity.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.*;


public class LoginInterface {

    public static final Target TXT_USERNAME=Target
            .the("ingresar nombre de usuario")
            .located(id("LoginPanel0_Username"));

    public static final Target TXT_PASSWORD=Target
            .the("ingresar contraseña ")
            .located(id("LoginPanel0_Password"));

    public static final Target BTN_LOGIN=Target
            .the("inicia sesion")
            .located(id("LoginPanel0_LoginButton"));

    public static final Target ALERT=Target
            .the("alert")
            .located(className("toast-message"));
}
