import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstseleniumTest {

    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("http://www.discovercars.com/");
    }

}
