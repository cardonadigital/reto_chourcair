package co.com.choucair.certification.retoserenity.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class ProductInterface {

    public static final Target BTN_NEW_PRODUCTS = Target.the("to create a new product")
            .located(xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div[1]/div[1]/div/span"));

    public static final Target TXT_NAME_PRODUCT = Target
            .the("enter the products name")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));

    public static final Target IMG_PRODUCT = Target
            .the("to save the image of the product")
            .located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_ProductDialog9_ProductImage\"]/div/div[2]/div/div/div[1]/input"));

    public static final Target CHECK_DISCONTINUE = Target
            .the("click en el check discontinue")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_Discontinued"));
    public static final Target INPUT_PROVIDER = Target
            .the("select supplier ")
            .located(By.id("s2id_Serenity_Demo_Northwind_ProductDialog9_SupplierID"));
    public static final Target INPUT_CATEGORY = Target
            .the("select supplier")
            .located(By.id("s2id_Serenity_Demo_Northwind_ProductDialog9_CategoryID"));

    public static final Target INPUT_UNIT_AMOUNT = Target
            .the("enter quantity per unit")
            .located(By.xpath("//input[contains(@id, 'QuantityPerUnit') and contains(text(),'')]"));
    public static final Target INPUT_UNIT_PRICE = Target
            .the("enter per unit")
            .located(By.xpath("//input[contains(@id, 'UnitPrice') and contains(text(),'')]"));

    public static final Target INPUT_STOCK_UNITS = Target
            .the("enter units In Stock")
            .located(By.xpath("//input[contains(@id, 'UnitsInStock') and contains(text(),'')]"));

    public static final Target INPUT_ORDERED_UNITS = Target
            .the("enter units on order")
            .located(By.xpath("//input[contains(@id, 'UnitsOnOrder') and contains(text(),'')]"));

    public static final Target INPUT_ORDER_LEVEL = Target
            .the("order level")
            .located(By.xpath("//input[contains(@id, 'ReorderLevel') and contains(text(),'')]"));


    public static final Target BTN_SAVE = Target
            .the("save")
            .located(cssSelector("div.tool-button.save-and-close-button[data-action=\"save-and-close\"]"));

    public static final Target ALERT_MISSING_PRODUCT_FIELDS = Target
            .the("alert when there are some missing fields")
            .located(By.className("toast-message"));


}