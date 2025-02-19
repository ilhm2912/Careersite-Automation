package stepDefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;
import pages.RegisterPage;
import com.csite.Base;

public class RegisterSteps extends Base {

    private RegisterPage registerPage;
    private WebDriver driver;

    public RegisterSteps() {
        this.driver = Base.driver;
        if (this.driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Ensure setup method is executed.");
        }
        this.registerPage = new RegisterPage(driver);
    }

    @When("I click on the register link")
    public void i_click_on_the_register_link() {
        Assertions.assertNotNull(registerPage, "RegisterPage is not initialized.");
        System.out.println("Navigating to register page...");

        registerPage.navigateToRegisterPage();
    }

    @Then("I should see the register page")
    public void i_should_see_the_register_page() {
        Assertions.assertTrue(registerPage.isRegisterPageDisplayed(), "Register page is not displayed");
        System.out.println("Register page is displayed successfully.");

        // Close browser after verification (optional)
        // Base.quitDriver();
    }

    // @When("I upload profile photo {string}")
    // public void i_upload_profile_photo(String photoPath) {
    // Assertions.assertNotNull(registerPage, "RegisterPage is not initialized.");
    // System.out.println("Uploading profile photo...");

    // registerPage.uploadPhoto(photoPath);
    // }

    // @Then("I upload CV {string}")
    // public void i_upload_cv(String cvPath) {
    // Assertions.assertNotNull(registerPage, "RegisterPage is not initialized.");
    // System.out.println("Uploading CV...");

    // registerPage.uploadCV(cvPath);
    // }

}
