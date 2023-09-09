package co.com.choucair.certification.retoserenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    private final String url;

    public OpenUp(String url) {
        this.url = url;
    }

    public static Performable thePage(String url) {
        return Tasks.instrumented(OpenUp.class,url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));
    }
}