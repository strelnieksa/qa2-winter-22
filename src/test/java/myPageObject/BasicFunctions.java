package myPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {
    private WebDriver browser;

    public BasicFunctions(){
        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();

    }
}
