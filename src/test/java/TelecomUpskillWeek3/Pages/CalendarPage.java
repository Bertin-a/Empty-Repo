package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage extends Setup {
    @FindBy(id = "g1065-selectorenteradate")
    private WebElement field;
    @FindBy(css = "div[class='entry-content'] button[type='submit']")
    private WebElement submitBtn;
    @FindBy(className = "field-value")
    private WebElement dateField;
    public CalendarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void pickDate(String date){
        field.sendKeys(date);
    }
    public void clickOnSubmit() throws InterruptedException {
        submitBtn.click();
        Thread.sleep(3000);

    }
    public boolean isDateDisplayed(){

        return dateField.isDisplayed();
    }
    public String displayedDate(){
        return dateField.getText();
    }

}
