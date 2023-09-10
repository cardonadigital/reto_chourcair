package co.com.choucair.certification.retoserenity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.retoserenity.userinterfaces.LoginInterface.ALERT;

public class ValidateMessage implements Question<Boolean> {
    private final String expected;

    public ValidateMessage(String expected){
        this.expected = expected;
    }

    public static ValidateMessage validateMessage(String expected){
        return new ValidateMessage(expected);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actual = Text.of(ALERT).answeredBy(actor).toString();
        return expected.contains(actual);
    }
}
