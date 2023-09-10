package co.com.choucair.certification.retoserenity.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.certification.retoserenity.questions.ValidateMessage.validateMessage;
import static co.com.choucair.certification.retoserenity.tasks.Login.login;

public class UserLoginStepDefinition {



    @When("enter the userName: {string} and the password: {string} and then click button Sign Up")
    public void enter_the_user_name_and_the_password(String userName, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                login().whithUser(userName).whithPassword(password)
        );
    }


    @Then("the Dashboard page will be displayed")
    public void the_dashboard_page_will_be_displayed() {
        OnStage.theActorInTheSpotlight().should();
    }


    @When("enter the userName: {string} enter the password: {string} and then click button Sign Up")
    public void enterTheUserName(String userName, String password) throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(
                login().whithUser(userName).whithPassword(password)
        );
    }


    @Then("the site will display the following alert: {string}")
    public void theSiteWillDisplayTheFollowingAlert(String expectedAlert) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                validateMessage(expectedAlert)
        ));
    }


}
