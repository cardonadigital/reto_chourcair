package co.com.choucair.certification.retoserenity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class HomeInterface {

    public static final Target BTN_NORTHWIND = Target.the("presiona opcion Northwind")
            .located(cssSelector("#nav_menu1_2 > li:nth-child(1) > a > span"));

    public static final Target BTN_PRODUCTS = Target.the("presiona opcion productos")
            .located(cssSelector("#nav_menu1_2_1 > li.s-sidebar-item.active > a > span"));
}
