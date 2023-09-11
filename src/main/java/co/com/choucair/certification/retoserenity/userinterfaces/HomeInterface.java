package co.com.choucair.certification.retoserenity.userinterfaces;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class HomeInterface {

    private static WebDriver webDriver = Serenity.getDriver();

    public static final Target BTN_NORTHWIND = Target
            .the("press the button Northwind")
            .located(By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[2]/ul/li[1]/a/span"));

    public static final Target BTN_PRODUCTS = Target
            .the("press the button products")
            .located(By.xpath("//*[@id=\"nav_menu1_2_1\"]/li[3]/a"));

    public static final WebElement H1_DASHBOARD = webDriver
            .findElement(By.xpath("//*[contains(@class, 'content-header')]//h1"));
    public static final Target FILTER_ID = Target
            .the("filter the product by Id").located(By.xpath("//span[contains(@class, 'slick-column-name') and contains(text(), 'ID')]"));
    public static final Target BTN_DISCONTINUED = Target
            .the("select the button").located(By.xpath("//*[@id=\"s2id_Serenity_Demo_Northwind_ProductGrid0_QuickFilter_Discontinued\"]"));
    public static final Target BTN_SUPPLIER = Target
            .the("select the button").located(By.xpath("//*[@id=\"s2id_Serenity_Demo_Northwind_ProductGrid0_QuickFilter_SupplierID\"]/a"));
}
