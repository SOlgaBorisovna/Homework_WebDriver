package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainPage extends AbsBasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void inputTextLabel() {
        WebElement label = driver.findElement(By.id("textInput"));
        label.sendKeys("ОТУС");

        assertThat(label.getAttribute("value"))
                .as("Текст должен быть: ОТУС")
                .isEqualTo("ОТУС");
    }

    public void openingModalWindow() {
        WebElement button = driver.findElement(By.id("openModalBtn"));
        button.click();

        WebElement modalElement = driver.findElement(By.id("myModal"));

        assertThat(modalElement.getAttribute("style"))
                .as("Не найдено модальное окно")
                .isEqualTo("display: block;");
    }

    public void submitSampleForm() {
        WebElement labelName = driver.findElement(By.id("name"));
        labelName.sendKeys("Name");

        WebElement labelEmail = driver.findElement(By.id("email"));
        labelEmail.sendKeys("Name@domain.ru");

        WebElement buttonSubmit = driver.findElement(By.cssSelector("button[type='submit']"));
        buttonSubmit.click();

        WebElement messageBoxElement = driver.findElement(By.id("messageBox"));

        assertThat(messageBoxElement.getText())
                .as("Ошибка формы отправки")
                .isEqualTo("Форма отправлена с именем: Name и email: Name@domain.ru");


    }
}

