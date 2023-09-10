package co.com.choucair.certification.retoserenity.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class ProductInterface {

    //home products
    public static final Target BTN_NEW_PRODUCTS = Target.the("presiona el boton nuevo producto")
            .located(cssSelector("div.tool-button.add-button.icon-tool-button > div > span.button-inner"));

    //General
    public static final Target TXT_NAME_PRODUCT = Target
            .the("ingresar nombre del producto")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_ProductName"));

    //TODO: 9/09/2023 ➡️ Falta mapear la imagen del producto

    public static final Target CHECK_DISCONTINUE = Target
            .the("click en el check discontinue")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_Discontinued"));
    public static final Target INPUT_SUPPLIER = Target
            .the("iseleccionar supplier ")
            .located(cssSelector("#s2id_Serenity_Demo_Northwind_ProductDialog9_SupplierID > a > span.select2-arrow"));
    public static final Target TXT_SUPPLIER = Target
            .the("ingresar supplier ")
            .located(cssSelector("#s2id_autogen4_search.select2-input"));


    //Pricing
    public static final Target TXT_QUANTITY = Target
            .the("ingresar quantity per unit")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_QuantityPerUnit"));
    public static final Target TXT_UNIT_PRICE = Target
            .the("ingresar per unit")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_UnitPrice"));


    //Status
    public static final Target UNITS_IN_STATUS = Target
            .the("Units In Stock")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_UnitsInStock"));

    public static final Target UNITS_ON_ORDER = Target
            .the("Units on order")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_UnitsOnOrder"));

    public static final Target ORDER_LEVEL = Target
            .the("order level")
            .located(id("Serenity_Demo_Northwind_ProductDialog9_ReorderLevel"));

    //buton save
    public static final Target BTN_SAVE = Target
            .the("save")
            .located(cssSelector("div.tool-button.save-and-close-button[data-action=\"save-and-close\"]"));


    /**
     *  localizador de boton guardar en CCS

     * div > div.tool-button.save-and-close-button.icon-tool-button > div > span
     */






}