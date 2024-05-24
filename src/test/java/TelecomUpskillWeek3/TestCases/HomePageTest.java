package TelecomUpskillWeek3.TestCases;

import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Setup;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends Setup {
    private Homepage homepage;

    @BeforeClass
    public void setUpPage() {
         homepage = new Homepage(driver); // Pass the driver from the Setup class
    }

    @Test
    public void ValidateHomePage() {
        boolean is_displayed = homepage.ValidateHomePage();
        Assert.assertTrue(is_displayed, "Page is not visible");
    }
}
