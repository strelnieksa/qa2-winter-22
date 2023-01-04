import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
//        browser.findElement(By.xpath(".//body")).sendKeys(Keys.CONTROL, Keys.END);
//        scrollDown();
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("gridItemRoot"), 30));
//        scrollDown();
//        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("gridItemRoot"), 40));
//        scrollDown();
//        wait.until(ExpectedConditions.numberOfElementsToBe(By.id("gridItemRoot"), 50));
//        List<WebElement> book = browser.findElements(By.xpath(".//div[@id = 'gridItemRoot']"));
//        highLight(browser, book.get(chooseBook - 1));
//        book.get(chooseBook - 1).click();
//
//        String oneBook = browser.findElement(By.xpath(".//span[@class = 'author notFaded']")).getText();
//        //browser.navigate().to("http://www.delfi.lv");
//        System.out.println("Tālāk");
//        System.out.println(oneBook);
//        System.out.println("-----------------------------------------------------------------");
//
//        List<WebElement> allauthor = browser.findElements(By.xpath(".//span[@class = 'author notFaded']"));
//        for (WebElement author : allauthor){
//            System.out.println(author.getText());
//        }
//        System.out.println(allauthor.size());

        //WebElement footer = browser.findElement(By.id("icp-nav-flyout"));
        //int deltaY = footer.getRect().y;
//        new Actions(browser).scrollByAmount(0, 99999999).perform();


        //------------------------nestraaadaaa..........................................
//        int x;
//        int i = 18;
//        do {
//            new Actions(browser).scrollByAmount(0, 20000).perform();
//            wait.until(ExpectedConditions.or(
//                    ExpectedConditions.numberOfElementsToBe(By.id("gridItemRoot"), i),
//                    ExpectedConditions.numberOfElementsToBeMoreThan(By.id("gridItemRoot"), i),
//                    ExpectedConditions.numberOfElementsToBeLessThan(By.id("gridItemRoot"),i)));
//            i = i + 2;
//            x = i;
//        } while (i == x);
  //      int x;
/*        int i = 0;
        do {
            new Actions(browser).scrollByAmount(0, 2000).perform();
                wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("gridItemRoot"), i));
            i = i + 1 ;
  //          x=i;
        } while (i < 50);*/

//        while(browser.findElement(By.id("rhf-container")).()){
//            JavascriptExecutor jse = (JavascriptExecutor) browser;
//            jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
//        }
//        JavascriptExecutor js = (JavascriptExecutor) browser;
//
//        long intialLength = (long) js.executeScript("return document.body.scrollHeight");
//
//        while (true) {
//            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
//            if (intialLength == currentLength) {
//                break;
//            }
//            intialLength = currentLength;
//
//        }

        String wert = browser.findElement(By.xpath(".//span[@class = 'a-icon-alt']")).getText();
        System.out.println(wert);





        By SCROLL = By.id("rhf-container");

        List<WebElement> allBooks = browser.findElements(By.xpath(".//div[@id = 'gridItemRoot']//div[@class = 'a-icon-row']//a"));
        WebElement hover = allBooks.get(1);

        String teksts = hover.getAttribute("title");
        System.out.println(teksts);
        String qwerty = StringUtils.substringBetween(teksts, ""," out");
        System.out.println(qwerty);



    }



//    public void scrollDown() {
//        JavascriptExecutor scroll = (JavascriptExecutor) browser;
//        scroll.executeScript("scroll(0, 30000);");
//    }

    public void highLight(WebDriver browser, WebElement element) {
        JavascriptExecutor lightup = (JavascriptExecutor) browser;
        lightup.executeScript("arguments[0].setAttribute('style', 'background: red; border: 5px solid blue;');", element);
    }


}
