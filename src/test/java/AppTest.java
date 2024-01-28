import net.serenitybdd.annotations.Managed;
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
        loginPage.open();

        loginPage.getUserName().sendKeys("standard_user");
        loginPage.getPassword().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();

        String getProductTitle = productPage.getProductTitle().getText();

        assertThat(getProductTitle).isEqualTo("Products");
    }
}
