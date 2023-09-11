package co.com.choucair.certification.retoserenity.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.certification.retoserenity.questions.ValidateLoginAlert.validateMessage;
import static co.com.choucair.certification.retoserenity.questions.ValidateProductVisibility.validateProductVisibility;
import static co.com.choucair.certification.retoserenity.tasks.CreateProduct.createProduct;
import static co.com.choucair.certification.retoserenity.tasks.FilterProduct.filterProduct;

public class ProductsStepDefinition {


    @When("fill the form wit the following information")
    public void fillTheFormWitTheFollowingInformation(DataTable dataTable) throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(
            createProduct().withInfo("aas", "Cooperativa de Quesos 'Las Cabras'", "Produce", 12)
        );
    }


    @And("filter the products by ID")
    public void filterTheProductsByID() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                filterProduct()
        );
    }


    @Then("the product {string} must be displayed")
    public void theProductMustBeDisplayed(String productName) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                validateProductVisibility(productName)
        ));
    }

    /*@When("tries to create a product with no info")
    public void triesToCreateAProductWithNoInfo() {
        OnStage.theActorInTheSpotlight().attemptsTo(

        );
    }*/



    /*@Then("the site will display the following alert:  {string}")
    public void theSiteWillDisplayTheFollowingAlert(String arg0) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                asa
        ));
    }*/
}
