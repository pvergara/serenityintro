package org.ecos.logic.serenity_intro.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

@SuppressWarnings("unused")
@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class ProductPage extends PageObject {
    private static final By PRODUCT_TITLE = By.className("title");
    private static final By PRODUCT_FIRST_ITEM =By.cssSelector("#item_4_title_link > div:nth-child(1)") ;
    private static final By PRODUCT_ITEM_LIST =By.cssSelector("#item_4_title_link > div") ;

    public WebElementFacade getProductTitle(){
        return this.find(PRODUCT_TITLE);
    }

    public WebElementFacade getFirstItem() {
        return this.find(PRODUCT_FIRST_ITEM);
    }
    public List<WebElementFacade> getItemList() {
        return this.findAll(PRODUCT_ITEM_LIST);
    }
}
