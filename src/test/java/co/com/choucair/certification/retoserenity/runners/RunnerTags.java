package co.com.choucair.certification.retoserenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features",
        glue = "co.com.choucair.certification.retoserenity.stepdefinitions",
        tags = "@PRODUCTS",
        plugin = {"pretty"}
)

public class RunnerTags {
}
