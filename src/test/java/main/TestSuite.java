package main;

import data.BrowserModeData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import pages.MainPage;

public class TestSuite extends BaseSuite{
    @ParameterizedTest
    @EnumSource(value = BrowserModeData.class, names = {"HEADLESSSCREEN"})
    public void checkInputTextLabel(BrowserModeData mode) {
        logger.info(String.format("Run test checkInputTextLabel with %s mode", mode));
        createDriver(mode);
        MainPage mainPage = new MainPage(driver);
        mainPage.open("");
        mainPage.inputTextLabel();
        logger.info("Finish test checkInputTextLabel");
    }

    @ParameterizedTest
    @EnumSource(value = BrowserModeData.class, names = {"KIOSKSCREEN"})
    public void checkOpeningModalWindow(BrowserModeData mode) {
        logger.info(String.format("Run test checkOpeningModalWindow with %s mode", mode));
        createDriver(mode);
        MainPage mainPage = new MainPage(driver);
        mainPage.open("");
        mainPage.openingModalWindow();
        logger.info("Finish test checkOpeningModalWindow");
    }

    @ParameterizedTest
    @EnumSource(value = BrowserModeData.class, names = {"FULLSCREEN"})
    public void checkSubmitSampleForm(BrowserModeData mode) {
        logger.info(String.format("Run test checkSubmitSampleForm with %s mode", mode));
        createDriver(mode);
        MainPage mainPage = new MainPage(driver);
        mainPage.open("");
        mainPage.submitSampleForm();
        logger.info("Finish test checkSubmitSampleForm");
    }
}

