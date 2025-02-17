package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    private By signInLink = By
            .xpath("//a[normalize-space()='Masuk']");
    private By emailField = By.xpath("//input[@id='email']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By signInButton = By.cssSelector("button[type='submit']");
    private By homePageElement = By.xpath("//img[@alt='Photo URL']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Methods
    public void navigateToLoginPage() {
        wait.until(ExpectedConditions.elementToBeClickable(signInLink)).click();
    }

    public void enterEmail(String email) {
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public boolean isHomePageDisplayed() {
        try {
            WebElement homeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(homePageElement));
            return homeElement.isDisplayed();
        } catch (Exception e) {
            System.out.println("Home page element not found: " + e.getMessage());
            return false;
        }
    }
}
