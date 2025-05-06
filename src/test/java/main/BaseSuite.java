package main;

import data.BrowserModeData;
import factory.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseSuite {
    protected static final Logger logger = LogManager.getLogger("Suite Logger");
    protected WebDriver driver = null;

    protected void createDriver(BrowserModeData mode){
        driver = new WebDriverFactory().getDriver(mode);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    protected void afterTest()
    {
        if (driver != null) {
            driver.quit();
        }
    }
}
