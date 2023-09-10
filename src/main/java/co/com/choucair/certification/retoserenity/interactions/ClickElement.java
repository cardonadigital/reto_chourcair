package co.com.choucair.certification.retoserenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebElement;

public class ClickElement implements Interaction {
    private WebElement element;

    private ClickElement(WebElement element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).evaluateJavascript("arguments[0].click()", element);
    }

    public static ClickElement clickOn(WebElement element){
        return new ClickElement(element);
    }
}
