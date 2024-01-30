package org.ecos.logic.serenity_intro.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductPage extends PageObject {
    private static final By PRODUCT_TITLE = By.className("title");
    private static final By PRODUCT_FIRST_ITEM =By.cssSelector("#item_4_title_link > div:nth-child(1)") ;

    public WebElementFacade getProductTitle(){
        return this.find(PRODUCT_TITLE);
    }

    public WebElementFacade getFirstItem() {
        return this.find(PRODUCT_FIRST_ITEM);
    }
}
