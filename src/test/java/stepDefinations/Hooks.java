package stepDefinations;

//Import the Base class for WebDriver management

// import com.csite.Base;
import io.cucumber.java.After;

public class Hooks {

    // Hook to execute after each scenario
    @After
    public void tearDown() {
        // Quit the WebDriver instance to clean up resources
        // Base.quitDriver();
    }
}
