import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AppTest
{
    @Managed
    WebDriver driver;

    @Test
    public void accessWikipedia(){
        driver.get("https://en.wikipedia.com");
    }
}
