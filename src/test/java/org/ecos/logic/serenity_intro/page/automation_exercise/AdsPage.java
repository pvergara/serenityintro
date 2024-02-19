package org.ecos.logic.serenity_intro.page.automation_exercise;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class AdsPage extends PageObject {
    @FindAll({
            @FindBy(className = "adsbygoogle")
    })
    List<WebElementFacade> advertismentList;

    public void disablingAdvertisement() {
        List<WebElementFacade> advertismentList = this.getAdvertismentList();
        for (WebElementFacade item: advertismentList)
        {
            ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].remove();", item);
        }

    }
}
