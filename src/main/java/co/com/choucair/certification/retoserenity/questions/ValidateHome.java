package co.com.choucair.certification.retoserenity.questions;

import co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.H1_DASHBOARD;


public class ValidateHome implements Question<Boolean> {


    public ValidateHome(){
    }

    public static ValidateHome validateHome() {
        return new ValidateHome();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String actual = H1_DASHBOARD.getText();
        System.out.println(actual);
        return actual.contains("Dashboard");
    }
}
