package main;

import factory.WebDriverFactory;
import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class MainPage_Test extends BaseSuite{

    @Test
    public void checkClickOpeningEventsViewAllButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.clickAllEventsButton();
    }
}
