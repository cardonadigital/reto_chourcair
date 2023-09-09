package co.com.choucair.certification.retoserenity.stepdefinitions;

import co.com.choucair.certification.retoserenity.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UserLoginStepDefinition {

    @Before
    public void setup() throws InterruptedException {
        OnStage.setTheStage(new OnlineCast());
        Thread.sleep(5000);
    }

    @Given("the user TestingUser opens the browser")
    public void the_user_testing_user_opens_the_browser() {
        
        OnStage.theActorCalled("ejemplo").wasAbleTo(OpenUp.thePage("https://demo.serenity.is"));
    }

    @When("enter the userName: {string} and the password: {string}")
    public void enter_the_user_name_and_the_password(String string, String string2) {
    }

    @And("click button Sign Up")
    public void click_button_sign_up() {
    }

    @Then("the Dashboard page will be displayed")
    public void the_dashboard_page_will_be_displayed() {
    }


    @When("enter the userName: {string}")
    public void enterTheUserName(String string) {

    }

    @When("enter the password: {string}")
    public void enterThePassword(String string) {

    }

    @Then("the site will display the following alert: {string}")
    public void theSiteWillDisplayTheFollowingAlert(String string) {

    }


}
