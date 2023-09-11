package co.com.choucair.certification.retoserenity.tasks;

import co.com.choucair.certification.retoserenity.interactions.SelectRandomListElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.File;

import static co.com.choucair.certification.retoserenity.interactions.ClickElement.clickOn;
import static co.com.choucair.certification.retoserenity.interactions.FillOutField.fillOutField;
import static co.com.choucair.certification.retoserenity.interactions.SelectRandomListElement.selectRandomListElement;
import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.BTN_NORTHWIND;
import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.BTN_PRODUCTS;
import static co.com.choucair.certification.retoserenity.userinterfaces.ProductInterface.*;


public class CreateProduct implements Task {
    private String productName;
    private Integer units;


    public CreateProduct withInfo(String productName, Integer units) {
        this.productName = productName;
        this.units = units;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String filePath = new File("").getAbsolutePath();
        String imagePath = filePath + "\\src\\main\\resources\\img\\linkedin (1).png";
        actor.attemptsTo(
                clickOn(BTN_NORTHWIND),
                clickOn(BTN_PRODUCTS),
                clickOn(BTN_NEW_PRODUCTS),
                fillOutField(TXT_NAME_PRODUCT, productName),
                fillOutField(IMG_PRODUCT, imagePath),
                clickOn(CHECK_DISCONTINUE),
                clickOn(INPUT_PROVIDER),
                SelectRandomListElement.selectRandomListElement(),
                clickOn(INPUT_CATEGORY),
                SelectRandomListElement.selectRandomListElement(),
                fillOutField(INPUT_UNIT_AMOUNT, units),
                fillOutField(INPUT_UNIT_PRICE, units),
                fillOutField(INPUT_STOCK_UNITS, units),
                fillOutField(INPUT_ORDERED_UNITS, units),
                fillOutField(INPUT_ORDER_LEVEL, units),
                Click.on(BTN_SAVE)
        );


    }

    public static CreateProduct createProduct() {
        return Tasks.instrumented(CreateProduct.class);
    }
}
