package co.com.choucair.certification.retoserenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static co.com.choucair.certification.retoserenity.interactions.ClickElement.clickOn;
import static co.com.choucair.certification.retoserenity.interactions.ScrollToElement.scrollToElement;
import static co.com.choucair.certification.retoserenity.interactions.SelectRandomListElement.selectRandomListElement;
import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.*;

public class FilterProduct implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                clickOn(FILTER_ID),
                clickOn(FILTER_ID),
                clickOn(BTN_DISCONTINUED),
                selectRandomListElement(),
                clickOn(BTN_SUPPLIER),
                selectRandomListElement()
        );
    }

    public static FilterProduct filterProduct() {
        return Tasks.instrumented(FilterProduct.class);
    }
}
