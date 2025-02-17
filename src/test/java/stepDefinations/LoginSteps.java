package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.csite.Base;
import pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import java.time.Duration;

public class LoginSteps extends Base {
    LoginPage loginPage;
    WebDriver driver;

    @Given("I open the browser and website {string}")
    public void setup(String url) {
        Base.initializeDriver();
        driver = Base.driver;
        driver.get(url);

        new WebDriverWait(driver, Duration.ofSeconds(20)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState")
                        .equals("complete"));

        loginPage = new LoginPage(driver);
    }

    @When("I click on the login link")
    public void i_click_on_the_login_link() {
        if (loginPage == null) {
            throw new IllegalStateException("LoginPage is not initialized. Check setup method.");
        }
        loginPage.navigateToLoginPage();
    }

    @And("I enter {string} and {string}")
    public void i_enter_and(String email, String password) {
        if (loginPage == null) {
            throw new IllegalStateException("LoginPage is not initialized. Check setup method.");
        }

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSignIn();
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        Assertions.assertTrue(loginPage.isHomePageDisplayed(), "Home page is not displayed");
        Base.quitDriver();
    }
}
