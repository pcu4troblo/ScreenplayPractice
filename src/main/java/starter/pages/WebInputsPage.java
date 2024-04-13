package starter.pages;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class WebInputsPage extends PageObject {
    public static final Target INPUT_NUMBER = Target.the("Input number").locatedBy("#input-number");
    public static final Target INPUT_TEXT = Target.the("Input text").locatedBy("#input-text");
    public static final Target INPUT_PASSWORD = Target.the("Input password").locatedBy("#input-password");
    public static final Target INPUT_DATE = Target.the("Input date").locatedBy("#input-date");
    public static final Target INPUT_DISPLAY_INPUTS = Target.the("Input display inputs").locatedBy("#btn-display-inputs");
    public static final Target INPUT_CLEAR_INPUTS = Target.the("Input clear inputs").locatedBy("#btn-clear-inputs");



}
