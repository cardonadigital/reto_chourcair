package co.com.choucair.certification.retoserenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class ClickElement implements Interaction {
    private Target element;

    private ClickElement(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(element);
    }

    public static ClickElement clickOn(Target element){
        return new ClickElement(element);
    }
}
