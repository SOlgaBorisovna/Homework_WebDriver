package main;

import data.BrowserModeData;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class TestSuite extends BaseSuite{

    @ParameterizedTest
    @EnumSource(value = BrowserModeData.class, names = {"HEADLESSSCREEN"})
    public void checkInputTextLabel(BrowserModeData mode) {
        WebDriver driver = createDriver(mode);
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.inputTextLabel();
        driver.quit();
    }

    @ParameterizedTest
    @EnumSource(value = BrowserModeData.class, names = {"KIOSKSCREEN"})
    public void checkOpeningModalWindow(BrowserModeData mode) {
        WebDriver driver = createDriver(mode);
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openingModalWindow();
        driver.quit();
    }

    @ParameterizedTest
    @EnumSource(value = BrowserModeData.class, names = {"FULLSCREEN"})
    public void checkSubmitSampleForm(BrowserModeData mode) {
        WebDriver driver = createDriver(mode);
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.submitSampleForm();
        driver.quit();
    }
}

