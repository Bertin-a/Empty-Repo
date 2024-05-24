package TelecomUpskillWeek3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Setup {
    public WebDriver driver;

    @BeforeSuite
    public void initializeDriver() {
        // Ensure the WebDriver executable (e.g., chromedriver) is set up correctly

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/");
    }

    /*@AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();  // Ensure the browser is closed after all tests
        }
    }

     */
}
