package co.com.choucair.certification.retoserenity.stepdefinitions;

import co.com.choucair.certification.retoserenity.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UserLoginStepDefinition {



    @When("enter the userName: {string} and the password: {string}")
    public void enter_the_user_name_and_the_password(String userName, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo();
    }

    @And("click button Sign Up")
    public void click_button_sign_up() {
        OnStage.theActorInTheSpotlight().attemptsTo();
    }

    @Then("the Dashboard page will be displayed")
    public void the_dashboard_page_will_be_displayed() {
        OnStage.theActorInTheSpotlight().should();
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
