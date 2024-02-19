package org.ecos.logic.serenity_intro.page.automation_exercise;

import lombok.Getter;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@DefaultUrl("https://automationexercise.com/")
public class InitialPage extends PageObject {
    @FindBy(css = "a[href='/login']")
    private WebElementFacade signUp;


}
