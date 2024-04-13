package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.pages.WebInputsPage;

public class OutputDate implements Question<String> {

    public static Question<String> displayed(){
        return new OutputDate();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(WebInputsPage.OUTPUT_DATE).answeredBy(actor);
    }
}
