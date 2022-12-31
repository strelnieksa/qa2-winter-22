package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.openqa.selenium.By;

public class MySuccesfulReservationPage {
    private BasicFunctions basicFunctions;
    private final By TNX_TEST = By.xpath(".//div[@class = 'finalTxt']");

    public MySuccesfulReservationPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public void succesfulEndingCheck() {
        basicFunctions.visibilityOfElementLocated(TNX_TEST);
        if (basicFunctions.getWebElementText(TNX_TEST).contains("Thank")) {
            System.out.println("Thank You Homework Done!");
        } else {
            System.out.println("Reservation failed!");
        }
    }

}
