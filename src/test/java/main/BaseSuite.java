package main;

import factory.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public abstract class BaseSuite {

    protected WebDriver driver = null;


    @BeforeEach
    public void init() {
        driver = new WebDriverFactory().getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void close() {
        if(driver != null)
            driver.quit();
    }
}
