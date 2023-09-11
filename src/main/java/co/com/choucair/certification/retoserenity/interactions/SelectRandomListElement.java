package co.com.choucair.certification.retoserenity.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static co.com.choucair.certification.retoserenity.interactions.WaitElement.nodeIsAvailable;

public class SelectRandomListElement implements Interaction {
    private static ArrayList<String> storeData = new ArrayList<>();


    public SelectRandomListElement() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> elements = Target.the("provider").located(By.xpath("//div[contains(@id, 'select2-result-label')]")).resolveAllFor(actor);
        int maxElements = elements.size();
        Random random = new Random();
        int randomIdElement = random.nextInt(maxElements);
        WebElement randomElement = elements.get(randomIdElement).waitUntilClickable();
        String eo = randomElement.getText();
        storeData.add(eo);
        randomElement.click();
    }

    public static SelectRandomListElement selectRandomListElement() {
        return new SelectRandomListElement();
    }

    public ArrayList<String> getTextValue() {
        System.out.println(storeData);
        return storeData;
    }


}
