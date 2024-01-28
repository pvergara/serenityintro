import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class AppTest extends PageObject
{
    @Managed(options = "start-maximized")
    WebDriver driver;

    @Test
    void accessWikipedia(){
        openUrl("https://www.saucedemo.com/");

        WebElement userNameSelector = driver.findElement(By.id("user-name"));
        WebElement passwordSelector = driver.findElement(By.id("password"));
        WebElement loginButtonSelector = driver.findElement(By.id("login-button"));

        userNameSelector.sendKeys("performance_glitch_user");
        passwordSelector.sendKeys("secret_sauce");
        loginButtonSelector.click();

        WebElement productSelector = driver.findElement(By.className("title"));


        assertThat(productSelector.getText()).isEqualTo("Products");
    }
}
