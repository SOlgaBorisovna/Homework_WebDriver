package main;

import factory.WebDriverFactory;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

public class MainPage_Test extends BaseSuite{

//    @Test
//    public void checkClickOpeningEventsViewAllButton() {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.open();
//        mainPage.clickAllEventsButton();
//    }

    @Test
    public void checkInputTextLabel() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.inputTextLabel();
    }

    @Test
    public void checkOpeningModalWindow() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.openingModalWindow();
    }

    @Test
    public void checkSubmitSampleForm() {
        MainPage mainPage = new MainPage(driver);
        mainPage.open();
        mainPage.submitSampleForm();
    }
}


//Ресурс для тестов: https://otus.home.kartushin.su/training.html
//
//Открыть Chrome в headless режиме
//Перейти на ресурс
//В поле ввода текста ввести ОТУС
//Проверить, что текст соответствует введенному
//2)
//
//Открыть Chrome в режиме киоска
//Перейти на ресурс
//Нажать на «Открыть модальное окно»
//Проверить, что открылось модальное окно
//3)
//
//Открыть Chrome в режиме полного экрана
//Перейти на ресурс
//В форму ввести имя и почту, нажать «Отправить»
//В поле динамическое сообщение (на зеленом фоне) появится сообщение в формате: «Форма отправлена с именем: фыв и email: asdf@sdfg.rt».

