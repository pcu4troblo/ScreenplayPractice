package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.pages.WebInputsPage;

public class OutputText implements Question<String> {

    public static Question<String> displayed(){
        return new OutputText();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(WebInputsPage.OUTPUT_TEXT).answeredBy(actor);
    }


}
