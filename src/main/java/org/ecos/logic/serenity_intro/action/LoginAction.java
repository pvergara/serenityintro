package org.ecos.logic.serenity_intro.action;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.ecos.logic.serenity_intro.data.User;
import org.ecos.logic.serenity_intro.page.LoginPage;

public class LoginAction extends UIInteractions {
    @Managed
    LoginPage loginPage;
    @Step("Given I open the login page")
    public LoginAction openThePage()
    {
        this.loginPage.open();
        return this;
    }

    @Step("When I login with {0}")
    public LoginAction as(User user) {
        loginPage.getUserName().sendKeys(user.getUsername());
        loginPage.getPassword().sendKeys(user.getPassword());
        loginPage.getLoginButton().click();

        return this;
    }

}
