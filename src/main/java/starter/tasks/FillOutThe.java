package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pages.WebInputsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutThe implements Task {
    public static FillOutThe webInputsForm() {
        return instrumented(FillOutThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1343").into(WebInputsPage.INPUT_NUMBER),
                Enter.theValue("abcd").into(WebInputsPage.INPUT_TEXT),
                Enter.theValue("password").into(WebInputsPage.INPUT_PASSWORD),
                Enter.theValue("12122024").into(WebInputsPage.INPUT_DATE),
                Click.on(WebInputsPage.INPUT_DISPLAY_INPUTS),
                Click.on(WebInputsPage.INPUT_CLEAR_INPUTS)
        );
    }


}
