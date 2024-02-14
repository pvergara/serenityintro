package org.ecos.logic.serenity_intro.action.automation_exercise;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.ecos.logic.serenity_intro.page.automation_exercise.LoginPage;

@DefaultUrl("https://automationexercise.com/login")
public class LoginAction extends UIInteractions {
    @Managed
    private LoginPage loginPage;

    @Step("When I put the name and email and click on SignUp")
    public void establishNameEmailAndSignup(){
        loginPage.getSignupName().sendKeys("lerele");
        loginPage.getSignupEmail().sendKeys("lerele@lolailo.com");
        loginPage.getSignupButton().click();
    }

}
