package co.com.choucair.certification.retoserenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retoserenity.userinterfaces.ProductInterface.ALERT_MISSING_PRODUCT_FIELDS;

public class ValidateProductFields implements Question<Boolean> {


    private final String expected;

    public ValidateProductFields(String expected) {
        this.expected = expected;
    }

    public static ValidateProductFields validateProductFields(String expected) {
        return new ValidateProductFields(expected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actual = Text.of(ALERT_MISSING_PRODUCT_FIELDS).answeredBy(actor).toString();
        System.out.println(actual + expected);
        return actual.contains(expected);
    }
}
