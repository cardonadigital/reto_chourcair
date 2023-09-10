package co.com.choucair.certification.retoserenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.retoserenity.interactions.FillOutField.fillOutField;
import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.BTN_NORTHWIND;
import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.BTN_PRODUCTS;
import static co.com.choucair.certification.retoserenity.userinterfaces.ProductInterface.*;


public class CreateProduct implements Task {
    private String productName;
    private String vendor;
    private String category;
    private Integer units;

    private long tiempo = 1;


    public CreateProduct withInfo(String productName, String vendor, String category, Integer units) {
        this.productName = productName;
        this.vendor = vendor;
        this.category = category;
        this.units = units;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NORTHWIND),
                Click.on(BTN_PRODUCTS),
                Click.on(BTN_NEW_PRODUCTS),
                Enter.theValue("eo").into(TXT_NAME_PRODUCT),
                fillOutField(IMG_PRODUCT, ""),
                Click.on(CHECK_DISCONTINUE),
                fillOutField(TXT_SUPPLIER, vendor),
                fillOutField(TXT_QUANTITY, units),
                fillOutField(TXT_UNIT_PRICE, units),
                fillOutField(UNITS_IN_STATUS, units),
                fillOutField(UNITS_ON_ORDER, units),
                fillOutField(ORDER_LEVEL, units),
                Click.on(BTN_SAVE)
        );
    }

    public static CreateProduct createProduct(){
        return Tasks.instrumented(CreateProduct.class);
    }
}
