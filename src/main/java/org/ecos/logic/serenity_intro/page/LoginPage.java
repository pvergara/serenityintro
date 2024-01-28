package org.ecos.logic.serenity_intro.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    private static final By USERNAME_INPUT = By.id("user-name");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.id("login-button");

    public WebElement getUserName(){
        return this.find(USERNAME_INPUT);
    }

    public WebElement getPassword(){
        return this.find(PASSWORD_INPUT);
    }

    public WebElement getLoginButton(){
        return this.find(LOGIN_BUTTON);
    }
}
