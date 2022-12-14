import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;


public class SecondSeleniumPage {


    private final By ACCEPT_COOKIES = By.id("onetrust-accept-btn-handler");
    private WebDriver browser;
    private WebDriverWait wait;

    @Test

    public void openSecondHomePage() {


        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");

//        WebDriver browser = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser = new ChromeDriver();
        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/en/search/8b2f643a-fa92-4ac3-8557-08e6d2eda7dc");


        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES));
        highLight(browser, browser.findElement(ACCEPT_COOKIES));
        browser.findElement(ACCEPT_COOKIES).click();


        //highLight(browser, browser.findElement(By.xpath(".//a[@class = 'btn btn-book submit click-on-car selected-car prevent-loading instant']")));
        browser.findElement(By.xpath(".//label[@data-event-action = 'Number of seats']")).click();
        selectCar();




    }

    private void selectCar() {
        List<WebElement> allCars = browser.findElements(By.xpath(".//label[@data-event-action = 'Number of seats']"));
        for (int i = 0; i < allCars.size(); i++) {
           // highLight(browser, browser.findElement(By.xpath(".//label[@data-event-action = 'Number of seats']")));
            highLight(browser, allCars.get(i));
            allCars.get(i).click();
        }

    }





    public void highLight(WebDriver browser, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 5px solid blue;');", element);
    }


}

