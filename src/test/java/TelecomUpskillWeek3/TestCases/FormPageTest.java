package TelecomUpskillWeek3.TestCases;

import TelecomUpskillWeek3.Pages.FormPage;
import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Setup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormPageTest extends Setup {
    private FormPage formPage;
    private Homepage homepage;
    @BeforeClass
    public void setUp(){
        formPage = new FormPage(driver);
        homepage = new Homepage(driver);
        homepage.clickOnForms();

    }

    @Test
    public void fillform() throws InterruptedException {
        formPage.fillNameField();
        formPage.pickCheckBox();
        formPage.pickColor();
        formPage.dropDown();
        formPage.fillEmail();
        formPage.fillMessage();
        formPage.clickOnSubmit();

    }
}
