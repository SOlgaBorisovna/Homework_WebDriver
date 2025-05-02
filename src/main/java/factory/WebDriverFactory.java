package factory;

import data.BrowserModeData;
import exceptions.BrowserNotSupportedException;
import factory.settings.ChromeSettings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

    private String browserName = System.getProperty("browser");

    public WebDriver getDriver(BrowserModeData browserMode){
        switch(browserName.toLowerCase()) {
            case "chrome": {
                return new ChromeDriver((ChromeOptions) new ChromeSettings().settings(browserMode));
            }
        }

        throw new BrowserNotSupportedException(browserName);
    }
}
