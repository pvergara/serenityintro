import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ecos.logic.serenity_intro.action.LoginAction;
import org.ecos.logic.serenity_intro.page.ProductDetailPage;
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
    LoginAction login;
    @Managed
    ProductPage productPage;
    @Managed
    private ProductDetailPage productDetailPage;

    @Test
    void checkTheStandardLoginAction(){
        //Arrange
        this.login.openThePage();

        //Act
        this.login.as(STANDARD);

        //Assertions
        WebElementFacade productTitle = productPage.getProductTitle();
        productTitle.shouldBeVisible();

        assertThat(productTitle.getText()).isEqualTo("Products");
    }

    @Test
    void checkThePerformanceGlitchLoginAction(){
        //Arrange
        this.login.openThePage();

        //Act
        this.login.as(PERFORMANCE_GLITCH);

        //Assertions
        WebElementFacade productTitle = productPage.getProductTitle();
        productTitle.shouldBeVisible();

        assertThat(productTitle.getText()).isEqualTo("Products");
    }

    @Test
    void accessingToAGivenProductDetail(){
        //Arrange
        this.login.
            openThePage().
            as(STANDARD);


        WebElementFacade productTitle = productPage.getProductTitle();
        productTitle.shouldBeVisible();

        //Act
        productPage.getItemList().get(0).click();

        //Assertions
        WebElementFacade title = productDetailPage.getTitleItem();
        assertThat(title.getText()).isEqualTo("Back to products");
    }

}
