package main;

import data.BrowserModeData;
import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BaseSuite {

    private BrowserModeData mode = null;
    protected WebDriver driver = null;

    BaseSuite(BrowserModeData mode)
    {
        this.mode = mode;
    }

    @BeforeEach
    public void init() {
        driver = new WebDriverFactory().getDriver(mode);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void close() {
        if(driver != null)
            driver.quit();
    }
}
