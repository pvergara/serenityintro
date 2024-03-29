import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.ecos.logic.serenity_intro.action.LoginAction;
import org.ecos.logic.serenity_intro.action.ProductDetailAction;
import org.ecos.logic.serenity_intro.page.ProductDetailPage;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.ecos.logic.serenity_intro.data.Users.PERFORMANCE_GLITCH;
import static org.ecos.logic.serenity_intro.data.Users.STANDARD;
import static org.ecos.logic.serenity_intro.utils.Constant.BACK_TO_PRODUCTS;

@ExtendWith(SerenityJUnit5Extension.class)
class AppTest
{
    public static final String PRODUCTS = "Products";
    @Managed
    LoginAction loginAction;
    @Managed
    ProductDetailAction productPageAction;
    @Managed
    private ProductDetailPage productDetailPage;

    @Test
    @Disabled("bye")
    void checkTheStandardLoginAction(){
        this.loginAction.
                openThePage().
                as(STANDARD);

        String productTitle = this.productPageAction.getProductTitleText();

        Serenity.reportThat("Then I validate I'm on the product page",()->
                assertThat(productTitle).isEqualTo(PRODUCTS));
    }

    @Test
    @Disabled("bye")
    void checkThePerformanceGlitchLoginAction(){
        this.loginAction.
                openThePage().
                as(PERFORMANCE_GLITCH);

        String productTitle = this.productPageAction.getProductTitleText();
        Serenity.reportThat("Then I validate I'm on the product page",()->
                assertThat(productTitle).isEqualTo(PRODUCTS));
    }

    @Test
    @Disabled("bye")
    void accessingToAGivenProductDetail(){
        this.loginAction.
                openThePage().
                as(STANDARD);
        this.productPageAction.getProductTitleText();

        productPageAction.clickOnTheItem(0);

        Serenity.reportThat("Then I validate I can ensure I'm on the detail page",()->
                assertThat(productDetailPage.getTitleItem().shouldBeVisible().getText()).isEqualTo(BACK_TO_PRODUCTS));
    }

}
