package myPageObject;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasicFunctions {
    private WebDriver browser;
    private WebDriverWait wait;

    public BasicFunctions() {
        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.ofSeconds(5));
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }

    public void select(By locator, String infoData) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByValue(infoData);
    }

    public void selectByText(By locator, String text) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select select = new Select(we);
        select.selectByVisibleText(text);

    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void type(By locator, String inputData) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        we.clear();
        we.sendKeys(inputData);
    }

//    public void type(By locator, int inputData) {
//        type(locator, String.valueOf(inputData));
    //  }

    public void type(By locator, int inputData) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        we.clear();
        we.sendKeys(String.valueOf(inputData));
    }

    public void chooseWebElement(By locator, String text) {
        List<WebElement> allElement = browser.findElements(locator);
        for (WebElement we : allElement) {
            if (we.getText().equals(text)) {
                we.click();
                break;
            }
        }
    }

    public String getListWebElementText(By locator, int elementsMoreThan, int index){
        List<WebElement> we = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator,elementsMoreThan));
        return we.get(index).getText();
    }
    public String getWebElementText(By locator){
        return browser.findElement(locator).getText();
    }

    public void loadElements(By locator, int number){
        wait.until(ExpectedConditions.numberOfElementsToBe(locator, number));
    }
    public void loadElementsMoreThan(By locator, int number){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, number));
    }

    public void assertEquals(String firstText, String secondText){
        Assertions.assertEquals(firstText, secondText, "Nav Vienādi!!!");
    }

    public void assertEquals(int firstInt, int secondInt){
        assertEquals(String.valueOf(firstInt), String.valueOf(secondInt));
    }

    public void visibilityOfElementLocated(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
