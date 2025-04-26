package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends AbsBasePage {

    public MainPage(WebDriver driver) {
        super(driver, "/");
    }

    public void clickAllEventsButton() {
        WebElement button = driver.findElement(By.cssSelector("h2-a[href*=''events/near]"));
        button.click();
    }
}


//public void pageTitleShouldBeSameAs(String title) {
//    WebElement titleElement = driver.findElement(By.cssSelector(""));
//
//    assertThat(titleElement.getText())
//            .as("Title of page should be {}", title)
//            .isEqualto(title);
//}