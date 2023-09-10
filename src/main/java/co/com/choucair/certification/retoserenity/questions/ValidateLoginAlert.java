package co.com.choucair.certification.retoserenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retoserenity.userinterfaces.LoginInterface.ALERT;

public class ValidateLoginAlert implements Question<Boolean> {
    private final String expected;

    public ValidateLoginAlert(String expected){
        this.expected = expected;
    }

    public static ValidateLoginAlert validateMessage(String expected){
        return new ValidateLoginAlert(expected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actual = Text.of(ALERT).answeredBy(actor).toString();
        return expected.contains(actual);
    }
}
