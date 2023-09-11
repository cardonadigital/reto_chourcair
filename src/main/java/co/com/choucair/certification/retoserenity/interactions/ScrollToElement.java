package co.com.choucair.certification.retoserenity.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollToElement implements Interaction {
    private static Target node;

    private static WebDriver driver = Serenity.getDriver();

    public ScrollToElement(Target node) {
        this.node = node;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Scroll.to(node);
    }

    public static ScrollToElement nodeIsAvailable(Target node){
        return new ScrollToElement(node);
    }

    public static String getElements(){
        Target elements = Target.the("asa").located(By.xpath(""));
        return Text.of(node).toString();
    }
}
