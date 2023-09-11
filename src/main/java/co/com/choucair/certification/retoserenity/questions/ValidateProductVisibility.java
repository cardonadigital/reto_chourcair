package co.com.choucair.certification.retoserenity.questions;


import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.List;

import static co.com.choucair.certification.retoserenity.interactions.ScrollToElement.scrollToElement;

public class ValidateProductVisibility implements Question<Boolean> {
    private WebDriver driver = Serenity.getDriver();

    private String productName;


    public ValidateProductVisibility(String productName) {
        this.productName = productName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String xpath = String.format("//a[contains(text(), '%s')]", productName);
        List<WebElementFacade> elements = Target.the("").located(By.xpath(xpath)).resolveAllFor(actor);
        scrollToElement(elements.get(0).getElement());
        Integer matchedObjects = elements.size();
        System.out.println(matchedObjects + xpath + elements);
        return matchedObjects != 0;
    }

    public static ValidateProductVisibility validateProductVisibility(String productName) {
        return new ValidateProductVisibility(productName);
    }
}
