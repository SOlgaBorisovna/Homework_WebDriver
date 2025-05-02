package main;

import data.BrowserModeData;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class KioskScreenSuiteTests extends BaseSuite{

    KioskScreenSuiteTests()
    {
        super(BrowserModeData.KIOSKSCREEN);
    }

    @Test
    public void checkOpeningModalWindow() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openingModalWindow();
    }
}