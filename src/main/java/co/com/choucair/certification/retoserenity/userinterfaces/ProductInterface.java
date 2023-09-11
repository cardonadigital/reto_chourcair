package co.com.choucair.certification.retoserenity.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class ProductInterface {

    //home products
    public static final Target BTN_NEW_PRODUCTS = Target.the("presiona el boton nuevo producto")
            .located(xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div[1]/div[1]/div/span"));

    //General
    public static final Target TXT_NAME_PRODUCT = Target
            .the("ingresar nombre del producto")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));

    public static final Target IMG_PRODUCT = Target
            .the("to save the image of the product")
            .located(By.xpath("//*[@id=\"Serenity_Demo_Northwind_ProductDialog9_ProductImage\"]/div/div[2]/div/div/div[1]/input"));

    //TODO: 9/09/2023 ➡️ Falta mapear la imagen del producto

    public static final Target CHECK_DISCONTINUE = Target
            .the("click en el check discontinue")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_Discontinued"));
    public static final Target INPUT_PROVIDER = Target
            .the("iseleccionar supplier ")
            .located(By.xpath("//*[@id=\"s2id_autogen6_search\"]"));
    public static final Target INPUT_CATEGORY = Target
            .the("ingresar supplier ")
            .located(By.xpath("//*[@id=\"s2id_autogen7_search\"]"));


    //Pricing
    public static final Target INPUT_UNIT_AMOUNT = Target
            .the("ingresar quantity per unit")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_QuantityPerUnit"));
    public static final Target INPUT_UNIT_PRICE = Target
            .the("ingresar per unit")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_UnitPrice"));


    //Status
    public static final Target INPUT_STOCK_UNITS = Target
            .the("Units In Stock")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_UnitsInStock"));

    public static final Target INPUT_ORDERED_UNITS = Target
            .the("Units on order")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder"));

    public static final Target INPUT_ORDER_LEVEL = Target
            .the("order level")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_ReorderLevel"));

    //buton save
    public static final Target BTN_SAVE = Target
            .the("save")
            .located(cssSelector("div.tool-button.save-and-close-button[data-action=\"save-and-close\"]"));


    public static final Target ALERT_MISSING_PRODUCT_FIELDS = Target.the("aa").located(By.className("toast-message"));
    /**
     *  localizador de boton guardar en CCS

     * div > div.tool-button.save-and-close-button.icon-tool-button > div > span
     */






}