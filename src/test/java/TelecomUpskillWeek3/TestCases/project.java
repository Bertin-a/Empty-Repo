package TelecomUpskillWeek3.TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class project {
   public WebDriver driver;
    @BeforeMethod
    public void initializeDriver(){
        driver = WebDriverManager.edgedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice-automation.com/");
    }
    @Test
    public void doSomething(){
        WebElement Elemnet = driver.findElement(By.xpath("//strong[contains(text(),'Welcome to your software automation practice websi')]"));
        System.out.println(Elemnet.isDisplayed());
    }


}
