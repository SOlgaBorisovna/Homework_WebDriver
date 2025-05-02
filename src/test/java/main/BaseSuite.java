package main;

import data.BrowserModeData;
import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseSuite {

    protected  WebDriver createDriver(BrowserModeData mode){
        WebDriver driver = new WebDriverFactory().getDriver(mode);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return driver;
    }
}
