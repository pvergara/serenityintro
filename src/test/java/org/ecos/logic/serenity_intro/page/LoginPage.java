package org.ecos.logic.serenity_intro.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    private static final By USERNAME_INPUT = By.id("user-name");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");

    public WebElementFacade getUserName(){
        return this.find(USERNAME_INPUT);
    }

    public WebElementFacade getPassword(){
        return this.find(PASSWORD_INPUT);
    }

    public WebElementFacade getLoginButton(){
        return this.find(LOGIN_BUTTON);
    }
}
