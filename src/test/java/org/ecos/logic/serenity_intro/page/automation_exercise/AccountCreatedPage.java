package org.ecos.logic.serenity_intro.page.automation_exercise;

import lombok.Getter;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@DefaultUrl("https://automationexercise.com/account_created")
public class AccountCreatedPage extends PageObject {
    @FindBy(css = "div > h2 > b")
    private WebElementFacade pageTitle;

}
