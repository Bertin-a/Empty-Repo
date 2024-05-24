package TelecomUpskillWeek3.TestCases;

import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Pages.PopupPage;
import TelecomUpskillWeek3.Setup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PopupPageTest extends Setup {
    private PopupPage popupPage;
    private Homepage homepage;
    @BeforeClass
    public void setUpPage() {
        popupPage = new PopupPage(driver);
        homepage = new Homepage(driver);
        homepage.PopUps();
    }
    @Test
    public void interactWithPopUps() throws InterruptedException {
        popupPage.promptPopup();
        Thread.sleep(3000);
        popupPage.confirmPopup();
        Thread.sleep(3000);
        popupPage.clickOnAlert();
    }
    }
