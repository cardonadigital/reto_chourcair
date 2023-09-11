package co.com.choucair.certification.retoserenity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollToElement implements Interaction {
    private static WebElement node;

    private static WebDriver driver = Serenity.getDriver();

    public ScrollToElement(WebElement node) {
        this.node = node;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement webElement = node;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", webElement);
    }

    public static ScrollToElement scrollToElement(WebElement node) {
        return new ScrollToElement(node);
    }

}
