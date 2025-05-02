package factory.settings;

import data.BrowserModeData;
import org.openqa.selenium.remote.AbstractDriverOptions;

public interface IChromeSettings {

    AbstractDriverOptions settings(BrowserModeData browserMode);
}
