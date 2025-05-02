package factory.settings;

import data.BrowserModeData;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class ChromeSettings implements IChromeSettings{

    @Override
    public AbstractDriverOptions settings(BrowserModeData browserMode) {
        ChromeOptions chromeOptions = new ChromeOptions();

        switch (browserMode) {
            case HEADLESSSCREEN:
                chromeOptions.addArguments("--headless");
                break;
            case KIOSKSCREEN:
                chromeOptions.addArguments("--kiosk");
                break;
            case FULLSCREEN:
                chromeOptions.addArguments("--start-fullscreen");
                break;
        }


        return chromeOptions;
    }
}
