package co.com.choucair.certification.retoserenity.stepdefinitions;

import co.com.choucair.certification.retoserenity.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Transversal {
    @Before
    public void setup() throws InterruptedException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user TestingUser opens the browser")
    public void the_user_testing_user_opens_the_browser() {
        OnStage.theActorCalled("TestingUser").wasAbleTo(OpenUp.thePage("https://demo.serenity.is"));
    }
}
