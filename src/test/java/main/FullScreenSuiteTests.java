package main;

import data.BrowserModeData;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class FullScreenSuiteTests extends BaseSuite{

    FullScreenSuiteTests()
    {
        super(BrowserModeData.FULLSCREEN);
    }

    @Test
    public void checkSubmitSampleForm() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.submitSampleForm();
    }
}

