package co.com.choucair.certification.retoserenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.retoserenity.interactions.ClickElement.clickOn;
import static co.com.choucair.certification.retoserenity.interactions.FillOutField.fillOutField;
import static co.com.choucair.certification.retoserenity.userinterfaces.LoginInterface.*;


public class Login implements Task {

    private String userName;
    private String password;

    public Login whithUser(String userName) {
        this.userName = userName;
        return this;
    }

    public Login whithPassword(String password) {
        this.password = password;
        return this;
    }


    /*implementar interaction*/
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                fillOutField(TXT_USERNAME, userName),
                fillOutField(TXT_PASSWORD, password),
                clickOn(BTN_LOGIN)
        );
    }

    public static Login login() {
        return Tasks.instrumented(Login.class);
    }
}
