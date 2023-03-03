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

    public void assertSeat(int seat){
        int seatCheck = Integer.parseInt(StringUtils.getDigits(basicFunctions.getWebElementText(SEAT_CHECK)));
        basicFunctions.assertEquals(seat,seatCheck);
        System.out.println("Izvēlētā vieta: " + seat + "\n" + "Rezervētā vieta: " + seatCheck);

    }

    public void bookSeat(){
        basicFunctions.click(By.id("book3"));
    }

}
