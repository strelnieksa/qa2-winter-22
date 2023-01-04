package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MySeatPage {
    private final By LOAD_SEATS = By.xpath(".//div[@class = 'seat']");
    private final int ALL_SEATS = 32;
    private BasicFunctions basicFunctions;

    public MySeatPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public void chooseSeatNumber(int seatNumber) {
        basicFunctions.loadElements(LOAD_SEATS, ALL_SEATS);
       // basicFunctions.chooseWebElement(LOAD_SEATS, String.valueOf(seatNumber));




        List<WebElement> allSeats = basicFunctions.findElemets(LOAD_SEATS);
        boolean isSeatFound = false;
        for (WebElement seat : allSeats) {
            if (seat.getText().equals(String.valueOf(seatNumber))) {
                isSeatFound = true;
                basicFunctions.click(seat);
                break;
            }
        }
        Assertions.assertTrue(isSeatFound, "Seat is not found!");
    }


}
