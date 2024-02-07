package org.ecos.logic.serenity_intro.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class ProductDetailPage extends PageObject {
    private static final By PAGE_TITLE = By.id("back-to-products");

    public WebElementFacade getTitleItem() {
        return this.find(PAGE_TITLE);
    }
}
