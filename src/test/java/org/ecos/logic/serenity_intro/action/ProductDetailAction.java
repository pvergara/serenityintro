package org.ecos.logic.serenity_intro.action;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.ecos.logic.serenity_intro.page.ProductPage;

public class ProductDetailAction extends UIInteractions {
    @Managed
    ProductPage productPage;

    @Step("Then Get the product title and I validate it is visible")
    public String getProductTitleText() {
        return this.productPage.getProductTitle().shouldBeVisible().getText();
    }

    @Step("Then Select the item number {0} of the product list")
    public void clickOnTheItem(int index) {
        this.productPage.getItemList().get(index).click();
    }
}
