package org.ecos.logic.serenity_intro.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductPage extends PageObject {
    private static final By PRODUCT_TITLE = By.className("title");

    public WebElement getProductTitle(){
        return this.find(PRODUCT_TITLE);
    }

}
