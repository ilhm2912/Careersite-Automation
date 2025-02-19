package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.csite.Base;
import pages.LoginPage;
import org.junit.jupiter.api.Assertions;

public class LoginSteps extends Base {
    private LoginPage loginPage;
    private WebDriver driver;

    public LoginSteps() {
        this.driver = Base.driver;
        if (this.driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Ensure setup method is called first.");
        }
        this.loginPage = new LoginPage(driver);
    }

    @When("I click on the login link")
    public void i_click_on_the_login_link() {
        Assertions.assertNotNull(loginPage, "LoginPage is not initialized.");
        System.out.println("Navigating to login page...");
        loginPage.navigateToLoginPage();
    }

    @And("I enter {string} and {string}")
    public void i_enter_and(String email, String password) {
        Assertions.assertNotNull(loginPage, "LoginPage is not initialized.");
        System.out.println("Entering login credentials...");

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickSignIn();
    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        Assertions.assertTrue(loginPage.isHomePageDisplayed(), "Home page is not displayed");
        System.out.println("Successfully logged in and home page is displayed.");

        Base.quitDriver();
    }
}
