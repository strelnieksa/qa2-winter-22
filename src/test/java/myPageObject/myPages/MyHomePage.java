package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class MyHomePage {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GOGOGO = By.xpath(".//span[@class = 'gogogo']");

    private BasicFunctions basicFunctions;

    public MyHomePage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public void selectAirports(String from, String to) {
        basicFunctions.select(FROM, from);
        basicFunctions.select(TO, to);
        basicFunctions.click(GOGOGO);
    }
}
