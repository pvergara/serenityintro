package org.ecos.logic.serenity_intro.page.automation_exercise;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@DefaultUrl("https://automationexercise.com/")
public class InitialPage extends PageObject {
    @FindBy(css = "a[href='/login']")
    private WebElementFacade signUp;

    public WebElementFacade getSignUp() {
        return signUp;
    }
}
