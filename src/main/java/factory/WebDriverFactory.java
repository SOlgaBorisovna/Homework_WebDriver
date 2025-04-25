package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {

    private String browserName = System.getProperty("browser");

    public WebDriver getDriver(){
        switch(browserName.toLowerCase()) {
            case "chrome": {
                return new ChromeDriver();
            }
        }
    }
}
