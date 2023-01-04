package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

public class MyPricePage {
    private final By BOOK_PRICE = By.id("book2");
    private final By AFTER_GETTING_PRICE = By.xpath(".//span[@class = 'bTxt']");
    private BasicFunctions basicFunctions;

    public MyPricePage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;

    }

    public void bookPrice() {
        basicFunctions.click(BOOK_PRICE);
    }

    public void assertGetPriceData(String name, String from, String to) {
        basicFunctions.assertEquals(basicFunctions.getListWebElementText(AFTER_GETTING_PRICE, 3, 0),
                basicFunctions.getListWebElementText(AFTER_GETTING_PRICE, 3, 3));
        basicFunctions.assertEquals(basicFunctions.getListWebElementText(AFTER_GETTING_PRICE, 3, 1),
                basicFunctions.getListWebElementText(AFTER_GETTING_PRICE, 3, 4));
        basicFunctions.assertEquals(StringUtils.chop(basicFunctions.getListWebElementText(AFTER_GETTING_PRICE,
                3, 2)), name);
        basicFunctions.assertEquals(from, basicFunctions.getListWebElementText(AFTER_GETTING_PRICE,
                3, 0));
        basicFunctions.assertEquals(to, basicFunctions.getListWebElementText(AFTER_GETTING_PRICE,
                3, 1));
    }

    public void priceAvailabilityCheck() {
        if (!basicFunctions.getWebElementText(By.id("response")).contains("EUR")) {
            System.out.println("Cenas nav! :(");
        } else {
            System.out.println("CENA: " + StringUtils.substringBetween(
                    basicFunctions.getWebElementText(By.id("response"))," for ", " EUR ") + " EUR");
        }
    }


}
