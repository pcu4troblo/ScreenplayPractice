package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.tasks.FillOutThe;
import starter.tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class WebInputsSteps {
    @Given("{string} opens the automation practice web site")
    public void theUserOpensTheAutomationPracticeWebSite(String actor) {
        theActorCalled(actor).wasAbleTo(NavigateTo.theExpandTestingPage());
    }

    @When("he tests the web inputs")
    public void heTestsTheWebInputs() {
        theActorInTheSpotlight().attemptsTo(NavigateTo.theWebInputsPage());
        theActorInTheSpotlight().attemptsTo(FillOutThe.webInputsForm());
    }

    @Then("the test inputs work as expected")
    public void theTestInputsWorkAsExpected() {
    }
}
