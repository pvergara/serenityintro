package org.ecos.logic.serenity_intro.page.automation_exercise;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SignUpPage extends PageObject {
    @FindBy(css = "div > h2 > b")
    private WebElementFacade title;

    public WebElementFacade getTheTitle() {
        return title;
    }
}
