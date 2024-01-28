import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ecos.logic.serenity_intro.page.LoginPage;
import org.ecos.logic.serenity_intro.page.ProductPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class AppTest
{
    @Managed
    LoginPage loginPage;
    @Managed
    ProductPage productPage;

    @Test
    void checkTheStandardLoginAction(){
        WebElementFacade productTitle = productPage.getProductTitle();
        loginPage.open();

        loginPage.getUserName().sendKeys("performance_glitch_user");
        loginPage.getPassword().sendKeys("secret_sauce");

        productTitle.shouldNotBeVisible();

        loginPage.getLoginButton().click();

        productTitle.shouldBeVisible();

        assertThat(productTitle.getText()).isEqualTo("Products");
    }
}
