package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import TelecomUpskillWeek3.TestCases.HomePageTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Calendar;

public class Homepage extends Setup {
    @FindBy(xpath = "//strong[contains(text(),'Welcome to your software automation practice websi')]")
    public WebElement header;
    @FindBy(xpath = "(//a[normalize-space()='Form Fields'])[1]")
    private WebElement formsField;
    @FindBy(xpath = "//a[normalize-space()='Calendars']")
    private WebElement calenders;
    @FindBy(xpath = "//a[normalize-space()='Popups']" )
    private WebElement popups;
    @FindBy(xpath = "//a[normalize-space()='Tables']")
    private WebElement tables;
    @FindBy(xpath = "//a[normalize-space()='Window Operations']")
    private WebElement windowsOperators;
    @FindBy(xpath = "//a[normalize-space()='Modals']")
    private WebElement models;
    @FindBy(xpath = "//a[normalize-space()='File Download']")
    private WebElement fileDownloads;
    @FindBy (xpath = "//a[normalize-space()='File Upload']")
    private WebElement fileUploads;
    @FindBy (xpath = "//a[normalize-space()='Iframes']")
    private WebElement iframes;
    @FindBy (xpath = "//a[normalize-space()='Sliders']")
    private WebElement sliders;

        private WebDriver driver;

        // Constructor to initialize WebDriver and WebElements
        public Homepage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public boolean ValidateHomePage() {
            return header.isDisplayed();
        }
    public FormPage clickOnForms(){
        formsField.click();
        return new FormPage(driver);

    }
    public PopupPage PopUps(){
            popups.click();
            return new PopupPage(driver);

    }

    public CalendarPage Calender() throws InterruptedException {
            FormPage formPage;
            formPage = new FormPage(driver);
            formPage.scrollIntoView(calenders);
            Thread.sleep(3000);
            calenders.click();
            return new CalendarPage(driver);

    }

    public ModelsPage Models(){
            models.click();
            return new ModelsPage(driver);

    }

    public TablesPage Tables(){
            tables.click();
            return new TablesPage(driver);

    }

    public WindowsOperationsPage WindowsOperations(){
            windowsOperators.click();
            return new WindowsOperationsPage(driver);

    }
    public FileUploadsPage FileUploads(){
            fileDownloads.click();
            return new FileUploadsPage(driver);

    }
    public DownloadsPage Downloads(){
            fileDownloads.click();
            return new DownloadsPage(driver);
    }
    public void Iframes(){

    }
    public void Slider(){

    }
}
