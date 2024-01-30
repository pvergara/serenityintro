import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ecos.logic.serenity_intro.data.User;
import org.ecos.logic.serenity_intro.page.LoginPage;
import org.ecos.logic.serenity_intro.page.ProductPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenity_intro.data.Users.PERFORMANCE_GLITCH;
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

        loginAction(STANDARD);


        WebElementFacade productTitle = productPage.getProductTitle();
        productTitle.shouldBeVisible();

        assertThat(productTitle.getText()).isEqualTo("Products");
    }

    @Test
    void checkThePerformanceGlitchLoginAction(){
        loginPage.open();

        loginAction(PERFORMANCE_GLITCH);


        WebElementFacade productTitle = productPage.getProductTitle();
        productTitle.shouldBeVisible();

        assertThat(productTitle.getText()).isEqualTo("Products");
    }

    private void loginAction(User user) {
        loginPage.getUserName().sendKeys(user.getUsername());
        loginPage.getPassword().sendKeys(user.getPassword());
        loginPage.getLoginButton().click();
    }
}
