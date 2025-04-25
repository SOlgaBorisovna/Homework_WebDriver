package main;

import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage_Test {

    private WebDriver driver = null;

    @BeforeEach
    public void init() {
        driver = new ChromeDriver();
    }

    @Test
    public void checkClickOpeningEventsViewAllButton() {

    }
}
