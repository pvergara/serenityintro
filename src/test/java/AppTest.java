import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ecos.logic.serenity_intro.action.LoginAction;
import org.ecos.logic.serenity_intro.action.ProductDetailAction;
import org.ecos.logic.serenity_intro.page.ProductDetailPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenity_intro.data.Users.PERFORMANCE_GLITCH;
import static org.ecos.logic.serenity_intro.data.Users.STANDARD;

@ExtendWith(SerenityJUnit5Extension.class)
class AppTest
{
    @Managed
    LoginAction loginAction;
    @Managed
    ProductDetailAction productPageAction;
    @Managed
    private ProductDetailPage productDetailPage;

    @Test
    void checkTheStandardLoginAction(){
        //Arrange
        this.loginAction.openThePage();

        //Act
        this.loginAction.as(STANDARD);

        //Assertions
        String productTitle = this.productPageAction.getProductTitleText();

        Serenity.reportThat("Then I validate I'm on the product page",()->assertThat(productTitle).isEqualTo("Products"));
    }

    @Test
    void checkThePerformanceGlitchLoginAction(){
        //Arrange
        this.loginAction.openThePage();

        //Act
        this.loginAction.as(PERFORMANCE_GLITCH);

        //Assertions
        String productTitle = this.productPageAction.getProductTitleText();

        Serenity.reportThat("Then I validate I'm on the product page",()->assertThat(productTitle).isEqualTo("Products"));
    }

    @Test
    void accessingToAGivenProductDetail(){
        //Arrange
        this.loginAction.
            openThePage().
            as(STANDARD);


        this.productPageAction.getProductTitleText();

        //Act
        productPageAction.clickOnTheItem(0);

        //Assertions
        Serenity.reportThat("Then I validate I can ensure I'm on the detail page",()->assertThat(productDetailPage.getTitleItem().shouldBeVisible().getText()).isEqualTo("Back to products"));
    }

}
