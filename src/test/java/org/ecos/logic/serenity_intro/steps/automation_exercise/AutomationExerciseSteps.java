package org.ecos.logic.serenity_intro.steps.automation_exercise;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import org.ecos.logic.serenity_intro.action.automation_exercise.InitialAction;
import org.ecos.logic.serenity_intro.action.automation_exercise.LoginAction;
import org.ecos.logic.serenity_intro.page.automation_exercise.SignUpPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AutomationExerciseSteps {
    @Managed
    private InitialAction initialAction;
    @Managed
    private LoginAction loginAction;
    @Managed
    private SignUpPage signUpPage;

    @Given("I access to the main page")
    public void iAccessToTheMainPage() {
        initialAction.openTheWeb();
    }

    @And("Click on sign-up button")
    public void clickOnSignUpButton() {
        initialAction.accessToSignUp();
    }
    @When("I fill the name and email and click on submit")
    public void fillNameEmailAndSubmit() {
        loginAction.establishNameEmailAndSignup();
    }

    @Then("I'm on the SignUp page")
    public void assertSignupPage(){
        assertThat(this.signUpPage.getTheTitle().getText()).isEqualToIgnoringCase("Enter Account Information");
    }
}
