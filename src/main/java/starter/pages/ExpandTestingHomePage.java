package starter.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://practice.expandtesting.com/")
public class ExpandTestingHomePage extends PageObject{
    public static final Target WEB_INPUTS_LINK =  Target.the("Web Inputs Card").locatedBy("//a[@href='/inputs']");
}
