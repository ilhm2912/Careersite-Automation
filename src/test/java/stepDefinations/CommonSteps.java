package stepDefinations;

import io.cucumber.java.en.Given;
import com.csite.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import pages.RegisterPage;
import java.time.Duration;

public class CommonSteps extends Base {
    WebDriver driver;
    LoginPage loginPage;
    RegisterPage registerPage;

    @Given("I open the browser and website {string}")
    public void setup(String url) {
        Base.initializeDriver();
        driver = Base.driver;
        driver.get(url);

        // Wait for the page to fully load
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                        .equals("complete"));

        // Initialize pages if needed
        if (url.contains("/login")) {
            loginPage = new LoginPage(driver);
        } else if (url.contains("/register")) {
            registerPage = new RegisterPage(driver);
        }
    }
}
