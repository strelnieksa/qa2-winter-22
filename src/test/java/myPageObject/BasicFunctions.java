package myPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {
    private WebDriver browser;

    public BasicFunctions() {
        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    public void openUrl(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "http://" + url;
        }
        browser.get(url);
    }
}
