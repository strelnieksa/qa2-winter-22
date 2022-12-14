import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;



public class FirstseleniumTest {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By TOP_LOCATION_LINK = By.xpath(".//div[@class = 'tl-box']/a");
    private final By ALL_CURRENCIES = By.xpath(".//div[@class = 'all-currencies']/a/span");


    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void openHomePageCheck() {
        String country = "Latvia";
        String currency = "NOK";


        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        wait = new WebDriverWait(browser, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN));

        browser.findElement(ACCEPT_COOKIES_BTN).click();


        clickOnCountry(country);

        // START --------->                     HOMEWORK FROM WHATSAPP  - SEARCH LOCATORS

        browser.findElement(By.xpath(".//div[@class = 'logo']")).click();

        browser.findElement(By.id("currentCurrency")).click();
        // browser.findElement(By.xpath(".//div[@class = 'all-currencies']//a//span[text()='NOK']")).click();   //ZEMĀK IR UZTAISĪTS AR FOR CIKLU LAI NOMAINĪTU VALŪTU UZ NORVĒĢU KRONĀM

        clickOnCurrency(currency);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ALL_CURRENCIES));

        browser.findElement(By.xpath(".//a[@data-label = 'Navigation']")).click();
        // browser.findElement(By.xpath(".//a[@class = 'navigation-link action my-booking trigger-login-modal pointer']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//.//*[text() = 'Continue with Google' ]"))).click();
        //browser.findElement(By.xpath(".//.//*[text() = 'Continue with Google' ]")).click();

        browser.navigate().back();
        browser.findElement(By.xpath(".//div[@class = 'modal-close']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//div[@class = 'modal-content']")));

        //browser.findElement(By.id("review-arrow-right")).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("review-arrow-right")));
        //highLighterMethod(browser, browser.findElement(By.id("review-arrow-right")));
        //browser.findElement(By.xpath(".//div[@class = 'tp-widget-review']//*[text() = 'Keita TOYODA,']")).click();

        browser.findElement(By.xpath(".//span[@class = 'sb-residence-text']")).click();
        browser.findElement(By.xpath(".//li[@data-option-array-index and text() = 'Dominican Republic']")).click();

        WebElement lightInHouse = browser.findElement(By.xpath("//div[@id=\"main-wrapper-body\"]//h2"));
        highLighterMethod(browser, lightInHouse);

        browser.findElement(By.id("pick-up-location")).sendKeys("London");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='location-item railway tt-suggestion tt-selectable' and text() = ' Paddington Train Station ']"))).click();

        highLighterMethod(browser, browser.findElement(By.id("location-submit")));
        browser.findElement(By.id("location-submit")).click();

    }

    private void clickOnCountry(String country) {
        List<WebElement> links = browser.findElements(TOP_LOCATION_LINK);

        boolean isCountryFound = false;
        for (WebElement link : links) {
            if (link.getText().equals(country)) {
                isCountryFound = true;
                wait.until(ExpectedConditions.elementToBeClickable(link));
                link.click();
                break;
            }
        }

        Assertions.assertTrue(isCountryFound, "Country not found");


    }

    private void clickOnCurrency(String currency) {
        List<WebElement> links = browser.findElements(ALL_CURRENCIES);

        for (WebElement link : links) {
            if (link.getText().equals(currency)) {
                link.click();


            }
        }
    }




    public void highLighterMethod(WebDriver browser, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("arguments[0].setAttribute('style', 'background: red; border: 5px solid blue;');", element);
    }

}
