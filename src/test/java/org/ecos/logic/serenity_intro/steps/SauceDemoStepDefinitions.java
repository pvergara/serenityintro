package org.ecos.logic.serenity_intro.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import org.ecos.logic.serenity_intro.action.LoginAction;
import org.ecos.logic.serenity_intro.action.ProductDetailAction;
import org.ecos.logic.serenity_intro.data.User;
import org.ecos.logic.serenity_intro.page.ProductDetailPage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenity_intro.utils.Constant.BACK_TO_PRODUCTS;
import static org.ecos.logic.serenity_intro.utils.Constant.PRODUCTS;

public class SauceDemoStepDefinitions {
    @Steps
    LoginAction loginAction;
    @Steps
    private ProductDetailAction productPageAction;
    @Managed
    private ProductDetailPage productDetailPage;

    @Given("I access to the sauce demo user")
    public void iAccessToTheSauceDemoUser() {
        loginAction.openThePage();
    }


    @When("I login with {user} user")
    public void loginAsStandardUser(User user){
        loginAction.as(user);
    }

    @Then("I can verify I'm on the product list")
    public void iCanVerifyIMOnTheProductList() {
        String productTitle = this.productPageAction.getProductTitleText();
        assertThat(productTitle).isEqualTo(PRODUCTS);

    }

    @When("I select a given product")
    public void iSelectAGivenProduct() {
        this.productPageAction.clickOnTheItem(0);
    }

    @Then("I'll be on the product detail page")
    public void iLlBeOnTheProductDetailPage() {
        assertThat(this.productDetailPage.getTitleItem().shouldBeVisible().getText()).isEqualTo(BACK_TO_PRODUCTS);
    }
}
