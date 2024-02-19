package org.ecos.logic.serenity_intro.page.automation_exercise;

import lombok.Getter;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

@Getter
@DefaultUrl("https://automationexercise.com/signup")
public class SignUpPage extends PageObject {
    @FindBy(css = "div > h2 > b")
    private WebElementFacade pageTitle;
    @FindBy(id = "password")
    private WebElementFacade password;
    @FindBy(id = "first_name")
    private WebElementFacade firstName;
    @FindBy(id = "last_name")
    private WebElementFacade lastName;
    @FindBy(id = "address1")
    private WebElementFacade addressOne;
    @FindBy(id = "country")
    private WebElementFacade country;
    @FindBy(id = "state")
    private WebElementFacade state;
    @FindBy(id = "city")
    private WebElementFacade city;
    @FindBy(id = "zipcode")
    private WebElementFacade zipCode;
    @FindBy(id = "mobile_number")
    private WebElementFacade mobileNumber;
    @FindBy(css = "[data-qa='create-account']")
    private WebElementFacade submitButton;
}
