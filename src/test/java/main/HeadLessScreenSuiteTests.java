package main;

import data.BrowserModeData;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class HeadLessScreenSuiteTests extends BaseSuite{

    HeadLessScreenSuiteTests()
    {
        super(BrowserModeData.HEADLESSSCREEN);
    }

    @Test
    public void checkInputTextLabel() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.inputTextLabel();
    }
}

