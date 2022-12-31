package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

public class MyChoosenSeatPage {
    private final By SEAT_CHECK = By.xpath(".//div[@class = 'line']");
    private BasicFunctions basicFunctions;

    public MyChoosenSeatPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public void assertSeat(String seat){
        basicFunctions.assertEquals(seat,StringUtils.getDigits(basicFunctions.getWebElementText(SEAT_CHECK)));
        System.out.println("Izvēlētā vieta: " + seat + "\n" + "Rezervētā vieta: " + StringUtils.getDigits(basicFunctions.getWebElementText(SEAT_CHECK)));
        basicFunctions.click(By.id("book3"));
    }

}
