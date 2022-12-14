import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AmazonHomeWork {

    private WebDriver browser;
    private WebDriverWait wait;

    final By ACCEPT_COOKIES_BTN = By.id("sp-cc-accept");
    final By AMAZON_CONTINUE_BTN = By.xpath(".//input[@data-action-type='DISMISS']");
    final By MAIN_MENU_ITEMS = By.xpath(".//div[@id = 'nav-xshop']//a");
    final By BEST_SELLER_SIDE_MENU = By.xpath(".//div[@role = 'group']//a");
    final By CHOOSE_BOOK = By.xpath(".//span[@class = 'zg-bdg-text']");
    final By STARS_COUNT = By.xpath(".//span[@class = 'a-icon-alt']");
    String menuItemToSelect = "Best Sellers";
    String bestSellerSideMenuItem = "Books";
    int chooseBook = 31;

    @Test

    public void openAndOperateWithSectionInAmazon() {

        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        browser.get("http://www.amazon.de/");

        wait.until(ExpectedConditions.elementToBeClickable(ACCEPT_COOKIES_BTN)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AMAZON_CONTINUE_BTN)).click();

        List<WebElement> menuItems = browser.findElements(MAIN_MENU_ITEMS);
        for (WebElement we : menuItems) {
            if (we.getText().equals(menuItemToSelect)) {
                highLight(browser, we);
                we.click();
                break;
            }
        }

        List<WebElement> sideMenuItem = browser.findElements(BEST_SELLER_SIDE_MENU);
        for (WebElement we : sideMenuItem) {
            if (we.getText().equals(bestSellerSideMenuItem)) {
                highLight(browser, we);
                we.click();
                break;
            }
        }
        //browser.findElement(By.xpath(".//body")).sendKeys(Keys.CONTROL, Keys.END);
        scrollDown();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("gridItemRoot"), 30));
        scrollDown();
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("gridItemRoot"), 40));
        scrollDown();
        wait.until(ExpectedConditions.numberOfElementsToBe(By.id("gridItemRoot"), 50));
        List<WebElement> book = browser.findElements(By.xpath(".//div[@id = 'gridItemRoot']"));
        highLight(browser, book.get(chooseBook - 1));
        book.get(chooseBook - 1).click();

        String oneBook = browser.findElement(By.xpath(".//span[@class = 'author notFaded']")).getText();
        //browser.navigate().to("http://www.delfi.lv");
        System.out.println("Tālāk");
        System.out.println(oneBook);
        System.out.println("-----------------------------------------------------------------");

        List<WebElement> allauthor = browser.findElements(By.xpath(".//span[@class = 'author notFaded']"));
        for (WebElement author : allauthor){
            System.out.println(author.getText());
        }
        System.out.println(allauthor.size());
    }

    public void scrollDown() {
        JavascriptExecutor scroll = (JavascriptExecutor) browser;
        scroll.executeScript("scroll(0, 30000);");
    }

    public void highLight(WebDriver browser, WebElement element) {
        JavascriptExecutor lightup = (JavascriptExecutor) browser;
        lightup.executeScript("arguments[0].setAttribute('style', 'background: red; border: 5px solid blue;');", element);
    }
}
