package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.openqa.selenium.By;

public class MySeatPage {
    private final By LOAD_SEATS = By.xpath(".//div[@class = 'seat']");
    private final int ALL_SEATS = 32;
    private BasicFunctions basicFunctions;

    public MySeatPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public void chooseSeatNumber(int seatNumber){
       basicFunctions.loadElements(LOAD_SEATS, ALL_SEATS);
       basicFunctions.chooseWebElement(LOAD_SEATS, String.valueOf(seatNumber));
    }

}
