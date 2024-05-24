package TelecomUpskillWeek3.Pages;

import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModelsPage extends Setup {
    @FindBy(id = "simpleModal")
    private WebElement simpleModel;
    @FindBy(id = "popmake-1318")
    private WebElement popUpModel;
    @FindBy(css = "div[id='popmake-1318'] button[aria-label='Close']")
    private WebElement closeBtn;
    @FindBy(id = "formModal")
    private WebElement formModel;
    @FindBy(id = "popmake-674")
    private WebElement modelForm;
    @FindBy(id = "g1051-name")
    private WebElement nameField;
    @FindBy(id = "g1051-email")
    private WebElement emailField;
    @FindBy(id = "contact-form-comment-g1051-message")
    private WebElement messageField;
    @FindBy(css = "button[class='pushbutton-wide']")
    private WebElement submitBtn;

    public ModelsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void simpleModel() throws InterruptedException {
        simpleModel.click();
        modelVisible();
        Thread.sleep(3000);
        closeBtn.click();

    }

    public boolean modelVisible(){
        return popUpModel.isDisplayed();

    }

    public void formModel(String name, String email, String message){
        formModel.click();
        nameField.sendKeys(name);
        emailField.sendKeys(email);
        messageField.sendKeys(message);
    }

    public void submit(){
        submitBtn.click();
    }

}
