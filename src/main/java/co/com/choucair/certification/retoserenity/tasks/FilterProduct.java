package co.com.choucair.certification.retoserenity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.retoserenity.userinterfaces.HomeInterface.FILTER_ID;

public class FilterProduct implements Task {





    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FILTER_ID)
        );
    }

    public static FilterProduct filterProduct() {
        return Tasks.instrumented(FilterProduct.class);
    }
}
