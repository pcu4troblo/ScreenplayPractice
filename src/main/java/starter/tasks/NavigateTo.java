package starter.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import starter.pages.ExpandTestingHomePage;

public class NavigateTo {
    public static Performable theExpandTestingPage() {
        return Task.where("{0} opens the ExpandTesting home page",
                Open.browserOn().the(ExpandTestingHomePage.class));
    }

    public static Performable theWebInputsPage() {
        return Task.where("{0} goes to the web inputs page",
                Click.on(ExpandTestingHomePage.WEB_INPUTS_LINK));
    }

}
