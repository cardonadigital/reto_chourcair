package co.com.choucair.certification.retoserenity.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import java.time.Duration;


public class WaitElement implements Interaction {
    private Target node;
    private long noMoreThanSeconds;

    public WaitElement(Target node, long noMoreThanSeconds) {
        this.node = node;
        this.noMoreThanSeconds = noMoreThanSeconds;
    }

    @Step("Waiting for delayed item")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Ensure.that(node.waitingForNoMoreThan(Duration.ofSeconds(noMoreThanSeconds))).isDisplayed());
    }

    public static WaitElement nodeIsAvailable(Target node, long noMoreThanSeconds){
        return Tasks.instrumented(WaitElement.class, node, noMoreThanSeconds);
    }
}
