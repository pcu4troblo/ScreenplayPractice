package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.pages.WebInputsPage;

public class OutputNumber implements Question<String>{
    public static Question<String> displayed(){
        return new OutputNumber();
    }
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(WebInputsPage.OUTPUT_NUMBER).answeredBy(actor);
    }
}
