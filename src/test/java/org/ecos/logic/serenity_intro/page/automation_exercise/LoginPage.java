package org.ecos.logic.serenity_intro.page.automation_exercise;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(css = "[data-qa='signup-name']")
    private WebElementFacade signupName;
    @FindBy(css = "[data-qa='signup-email']")
    private WebElementFacade signupEmail;
    @FindBy(css = "[data-qa='signup-button']")
    private WebElementFacade signupButton;

    public WebElementFacade getSignupName() {
        return signupName;
    }

    public WebElementFacade getSignupEmail() {
        return signupEmail;
    }

    public WebElementFacade getSignupButton() {
        return signupButton;
    }
}
