package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.pages.WebInputsPage;

public class OutputPassword implements Question<String> {
    public static Question<String> displayed(){
        return new OutputPassword();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(WebInputsPage.OUTPUT_PASSWORD).answeredBy(actor);
    }
}
