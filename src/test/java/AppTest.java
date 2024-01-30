import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ecos.logic.serenity_intro.page.LoginPage;
import org.ecos.logic.serenity_intro.page.ProductPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenity_intro.data.Users.STANDARD;

@ExtendWith(SerenityJUnit5Extension.class)
class AppTest
{
    @Managed
    LoginPage loginPage;
    @Managed
    ProductPage productPage;

    @Test
    void checkTheStandardLoginAction(){
        loginPage.open();

        loginPage.getUserName().sendKeys(STANDARD.getUsername());
        loginPage.getPassword().sendKeys(STANDARD.getPassword());

        loginPage.getLoginButton().click();

        WebElementFacade productTitle = productPage.getProductTitle();
        productTitle.shouldBeVisible();

        assertThat(productTitle.getText()).isEqualTo("Products");
    }
}
