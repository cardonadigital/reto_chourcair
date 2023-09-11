package co.com.choucair.certification.retoserenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certification.retoserenity.userinterfaces.LoginInterface.ALERT_MISSING_LOGIN_FIELDS;

public class ValidateLoginFields implements Question<Boolean> {
    private final String expected;

    public ValidateLoginFields(String expected){
        this.expected = expected;
    }

    public static ValidateLoginFields validateLoginFields(String expected){
        return new ValidateLoginFields(expected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actual = Text.of(ALERT_MISSING_LOGIN_FIELDS).answeredBy(actor).toString();
        return expected.contains(actual);
    }
}
