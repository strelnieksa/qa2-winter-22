package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.openqa.selenium.By;

public class SeatPage {
    private final By LOAD_SEATS = By.xpath(".//div[@class = 'seat']");
    private final int ALL_SEATS = 32;
    private BasicFunctions basicFunctions;

    public SeatPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public void chooseSeatNumber(String seatNumber){
        basicFunctions.loadElements(LOAD_SEATS, ALL_SEATS);
        basicFunctions.chooseWebElement(LOAD_SEATS);

    }

}
