package co.com.choucair.certification.retoserenity.userinterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class HomeInterface {

    private static WebDriver webDriver = Serenity.getDriver();

    public static final Target BTN_NORTHWIND = Target.the("presiona opcion Northwind")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[2]/ul/li[1]/a/span"));

    public static final Target BTN_PRODUCTS = Target.the("presiona opcion productos")
            .located(By.xpath("//*[@id=\"nav_menu1_2_1\"]/li[3]/a"));

    //public static final WebElement BTN_NORTHWIND = webDriver.findElement(xpath("//*[@id=\"nav_menu1_2\"]/li[1]/a/i"));

    /*public static final WebElement BTN_PRODUCTS = webDriver.
            findElement(xpath("//span[contains(text(),'Productos')]"));*/

    public static final WebElement H1_DASHBOARD = webDriver.findElement(By.xpath("//*[contains(@class, 'content-header')]//h1"));
}
