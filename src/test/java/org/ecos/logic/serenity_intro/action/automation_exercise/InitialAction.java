package org.ecos.logic.serenity_intro.action.automation_exercise;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.ecos.logic.serenity_intro.page.automation_exercise.InitialPage;

@DefaultUrl("https://automationexercise.com/")
public class InitialAction extends UIInteractions {

    @Managed
    private InitialPage initialPage;

    @Step("Access to sign-up")
    public void openTheWeb(){
        this.initialPage.open();
    }

    @Step("Go to signup")
    public void accessToSignUp() {
        this.initialPage.getSignUp().click();
    }
}
