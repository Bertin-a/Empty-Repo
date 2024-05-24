package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage extends Setup {
    @FindBy(id = "alert")
    private WebElement alertPop;
    @FindBy(id = "confirm")
    private WebElement confirmPopup;
    @FindBy(id = "prompt")
    private WebElement promptPopup;
    @FindBy(className= "tooltip_1")
    private WebElement toolTip;
    @FindBy(id = "confirmResult")
    private WebElement confirmResults;
    private WebDriver driver;
    public void alertInteraction(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public PopupPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickOnAlert() throws InterruptedException {
        alertPop.click();
        Thread.sleep(3000);
        alertInteraction();


    }
    public void confirmPopup() throws InterruptedException {
        confirmPopup.click();
        Thread.sleep(3000);
        alertInteraction();

    }
    public void promptPopup() throws InterruptedException {
        promptPopup.click();
        Thread.sleep(3000);
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Ayuure Bertina");
        prompt.accept();
    }
    public void tootTip(){
        toolTip.click();
    }

}
