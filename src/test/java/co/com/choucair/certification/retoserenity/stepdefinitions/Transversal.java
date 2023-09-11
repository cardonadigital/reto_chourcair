package co.com.choucair.certification.retoserenity.stepdefinitions;

import co.com.choucair.certification.retoserenity.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Transversal {

    @Managed
    WebDriver driver;

    @Given("the user TestingUser opens the browser")
    public void the_user_testing_user_opens_the_browser() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Daniel");
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demo.serenity.is"));
        driver.manage().window().maximize();
    }
    /*@Before
    public void setup() throws InterruptedException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user TestingUser opens the browser")
    public void the_user_testing_user_opens_the_browser() {
        OnStage.theActorCalled("TestingUser").wasAbleTo(OpenUp.thePage("https://demo.serenity.is"));
    }*/
}
