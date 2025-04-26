package main;

import factory.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BaseSuite {

    protected WebDriver driver = null;

    @BeforeEach
    public void init() {
        driver = new WebDriverFactory().getDriver();
    }

    @AfterEach
    public void close() {
        if(driver != null)
            driver.quit();
    }
}
