package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By registerLink = By
            .xpath("//a[normalize-space()='Daftar']");
    // private By uploadPhoto = By.xpath("//label[@for='input-image']");
    // private By uploadCV = By.xpath("//input[contains(@class,'absolute inset-0
    // opacity-0')]");

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // Methods
    // Navigate to the register page
    public void navigateToRegisterPage() {
        WebElement buttonRegister = wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink));
        buttonRegister.click();
    }

    public boolean isRegisterPageDisplayed() {
        try {
            WebElement registerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(registerLink));
            return registerElement.isDisplayed();
        } catch (Exception e) {
            System.out.println("Register page element not found: " + e.getMessage());
            return false;
        }
    }

    // fill personal information section in the registration form

    // public void uploadPhoto(String photoPath) {
    // WebElement photoInput =
    // wait.until(ExpectedConditions.visibilityOfElementLocated(uploadPhoto));
    // photoInput.sendKeys(photoPath);
    // }

    // public void uploadCV(String cvPath) {
    // WebElement cvInput =
    // wait.until(ExpectedConditions.visibilityOfElementLocated(uploadCV));
    // cvInput.sendKeys(cvPath);
    // }
}
