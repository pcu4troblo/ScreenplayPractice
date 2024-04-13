package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.pages.WebInputsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillOutThe implements Task {
    private final String number, text, password, date;

    public FillOutThe(String number, String text, String password, String date){
        this.number = number;
        this.text = text;
        this.password = password;
        this.date = date;
    }
    public static FillOutThe webInputsForm(String number, String text, String password, String date) {
        return instrumented(FillOutThe.class, number, text, password, date);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(number).into(WebInputsPage.INPUT_NUMBER),
                Enter.theValue(text).into(WebInputsPage.INPUT_TEXT),
                Enter.theValue(password).into(WebInputsPage.INPUT_PASSWORD),
                Enter.theValue(date).into(WebInputsPage.INPUT_DATE),
                Click.on(WebInputsPage.INPUT_DISPLAY_INPUTS)
        );
    }


}
