package co.com.choucair.certification.retoserenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

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

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_LOGIN),
                Enter.theValue(userName).into(TXT_USER),
                Enter.theValue(password).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Login login() {
        return new Login();
    }
}
