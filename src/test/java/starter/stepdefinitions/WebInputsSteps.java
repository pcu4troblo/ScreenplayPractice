package starter.stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.pages.WebInputsPage;
import starter.questions.OutputDate;
import starter.questions.OutputNumber;
import starter.questions.OutputPassword;
import starter.questions.OutputText;
import starter.tasks.FillOutThe;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.waits.WaitUntil.the;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class WebInputsSteps {
    private String text, number, password, date;
    private Faker faker = new Faker();

    @Given("{string} opens the automation practice web site")
    public void theUserOpensTheAutomationPracticeWebSite(String actor) {
        theActorCalled(actor).wasAbleTo(NavigateTo.theExpandTestingPage());
    }

    @When("he tests the web inputs")
    public void heTestsTheWebInputs() {
        text = faker.name().firstName();
        number = String.valueOf(faker.number().numberBetween(1000, 9999));
        password = faker.name().firstName();
        date = String.valueOf((int) Math.floor(Math.random() * (12 - 1 + 1) + 1)).concat("092024");
        theActorInTheSpotlight().attemptsTo(NavigateTo.theWebInputsPage());
        theActorInTheSpotlight().attemptsTo(FillOutThe.webInputsForm(number, text, password, date));
    }

    @Then("the test inputs work as expected")
    public void theTestInputsWorkAsExpected() {
        /*theActorInTheSpotlight().attemptsTo(Ensure.that(OutputNumber.displayed()).isEqualTo(number));
        theActorInTheSpotlight().attemptsTo(Ensure.that(OutputText.displayed()).isEqualTo(text));
        theActorInTheSpotlight().attemptsTo(Ensure.that(OutputPassword.displayed()).isEqualTo(password));
        /*theActorInTheSpotlight().attemptsTo(Ensure.that(OutputDate.displayed()).containsIgnoringCase(date));*/
        theActorInTheSpotlight().should(seeThat(OutputNumber.displayed(), is(equalTo(number))),
                                        seeThat(OutputText.displayed(), is(equalTo(text))),
                                        seeThat(OutputPassword.displayed(), is(equalTo(password))));
        //theActorInTheSpotlight().should(seeThat(OutputText.displayed(), is(equalTo(text))));
        //theActorInTheSpotlight().should(seeThat(OutputPassword.displayed(), is(equalTo(password))));*/
    }
}
