package co.com.choucair.certification.retoserenity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.mockito.internal.matchers.Any;

import static co.com.choucair.certification.retoserenity.userinterfaces.ProductInterface.TXT_NAME_PRODUCT;

public class FillOutField implements Interaction {

    private static Target target;
    private static String data;
    private static Integer number;


    public FillOutField(Target target, String data) {
        this.target = target;
        this.data = data;
    }

    public FillOutField(Target target, Integer number) {
        this.target = target;
        this.data = String.valueOf(number);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Clear.field(target).performAs(actor);
        Enter.theValue(data).into(target).performAs(actor);
    }

    public static FillOutField fillOutField(Target target, String data) {
        return new FillOutField(target, data);
    }

    public static FillOutField fillOutField(Target target, Integer number) {
        return new FillOutField(target, number);
    }
}
