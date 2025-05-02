package main;

import data.BrowserModeData;
import factory.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseSuite {
    protected static final Logger logger = LogManager.getLogger("Suite Logger");

    protected  WebDriver createDriver(BrowserModeData mode){
        WebDriver driver = new WebDriverFactory().getDriver(mode);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        return driver;
    }
}
