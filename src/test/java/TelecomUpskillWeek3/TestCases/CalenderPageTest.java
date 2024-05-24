package TelecomUpskillWeek3.TestCases;

import TelecomUpskillWeek3.Pages.CalendarPage;
import TelecomUpskillWeek3.Pages.Homepage;
import TelecomUpskillWeek3.Setup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalenderPageTest extends Setup {
    private CalendarPage calendarPage;
    private Homepage homepage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        calendarPage = new CalendarPage(driver);
        homepage = new Homepage(driver);
        homepage.Calender();
    }
    @Test
    public void pickDate(){
        calendarPage.pickDate("2000-11-07");
    }
}
