package co.com.choucair.certification.retoserenity.questions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


import java.util.List;

public class ValidateProductVisibility implements Question<Boolean> {

    private String productName;


    public ValidateProductVisibility(String productName) {
        this.productName = productName;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String xpath = String.format("//a[contains(text(), '%s')]", productName);
        List<WebElementFacade> elements = Target.the("ss").located(By.xpath(xpath)).resolveAllFor(actor);
        Integer matchedObjects = elements.size();
        System.out.println(matchedObjects);
        return matchedObjects != 0;
    }

    public static ValidateProductVisibility validateProductVisibility(String productName) {
        return new ValidateProductVisibility(productName);
    }
}
