package co.com.choucair.certification.retoserenity.userinterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class HomeInterface {

    private static WebDriver webDriver = Serenity.getDriver();

    public static final Target BTN_NORTHWIND = Target.the("presiona opcion Northwind")
            .located(cssSelector("#nav_menu1_2 > li:nth-child(1) > a > span"));

    public static final Target BTN_PRODUCTS = Target.the("presiona opcion productos")
            .located(cssSelector("#nav_menu1_2_1 > li.s-sidebar-item.active > a > span"));

    public static final WebElement H1_DASHBOARD = webDriver.findElement(By.xpath("//*[contains(@class, 'content-header')]//h1"));
}
