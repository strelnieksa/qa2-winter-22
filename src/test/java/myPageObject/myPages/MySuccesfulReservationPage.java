package myPageObject.myPages;

import myPageObject.BasicFunctions;
import org.openqa.selenium.By;

public class MySuccesfulReservationPage {
    private BasicFunctions basicFunctions;
    private final By TNX_TEST = By.xpath(".//div[@class = 'finalTxt']");
    private String TEXT = "Thank You for flying with us!";

    public MySuccesfulReservationPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public boolean isSuccesfulEndingCheck() {
       String textOnPage = basicFunctions.getWebElementText(TNX_TEST);
       return textOnPage.equals(TEXT);
    }

}
