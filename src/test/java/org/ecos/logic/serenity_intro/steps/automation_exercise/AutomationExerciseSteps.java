package org.ecos.logic.serenity_intro.steps.automation_exercise;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import org.ecos.logic.serenity_intro.action.automation_exercise.InitialAction;
import org.ecos.logic.serenity_intro.action.automation_exercise.LoginAction;
import org.ecos.logic.serenity_intro.page.automation_exercise.AccountCreatedPage;
import org.ecos.logic.serenity_intro.page.automation_exercise.SignUpPage;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AutomationExerciseSteps {
    @Managed
    private InitialAction initialAction;
    @Managed
    private LoginAction loginAction;
    @Managed
    private SignUpPage signUpPage;
    @Managed
    private AccountCreatedPage accountCreatedPage;

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
        assertThat(this.signUpPage.getPageTitle().getText()).isEqualToIgnoringCase("Enter Account Information");
    }

    @When("I fill expected data to create a user")
    public void createAnUser() {
        this.signUpPage.getPassword().sendKeys("lerele");
        this.signUpPage.getFirstName().sendKeys("lerele");
        this.signUpPage.getLastName().sendKeys("lerele");
        this.signUpPage.getAddressOne().sendKeys("lerele");
        this.signUpPage.getCountry().selectByValue("Australia");
        this.signUpPage.getState().sendKeys("lerele");
        this.signUpPage.getCity().sendKeys("lerele");
        this.signUpPage.getZipCode().sendKeys("lerele");
        this.signUpPage.getMobileNumber().sendKeys("lerele");
        Action action = new Actions(getDriver()).
            moveToElement(this.signUpPage.getSubmitButton()).
            click().
            build();
        action.perform();
    }

    @Then("I create a user")
    public void iCreateAUser() {
        assertThat(this.accountCreatedPage.getPageTitle().getText()).isEqualToIgnoringCase("Account Created!");
    }
}
