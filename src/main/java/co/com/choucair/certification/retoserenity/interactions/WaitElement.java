package co.com.choucair.certification.retoserenity.interactions;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static co.com.choucair.certification.retoserenity.userinterfaces.ProductInterface.TXT_NAME_PRODUCT;


public class WaitElement implements Interaction {
    WebDriver driver = Serenity.getDriver();
    private Target node;
    private long noMoreThanSeconds;

    public WaitElement() {

    }

    @Step("Waiting for delayed item")
    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static WaitElement nodeIsAvailable() {
        return new WaitElement();
    }
}
