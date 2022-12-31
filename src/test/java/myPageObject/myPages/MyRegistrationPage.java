package myPageObject.myPages;

import myPageObject.BasicFunctions;
import myPageObject.myModel.MyPassenger;
import org.openqa.selenium.By;

public class MyRegistrationPage {
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BUGS = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By GET_PRICE = By.xpath(".//span[@onclick = 'setLang();']");

    private BasicFunctions basicFunctions;

    public MyRegistrationPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public  void fillRegistrationData(MyPassenger myPassenger){
        basicFunctions.type(NAME, myPassenger.getFirstName());
        basicFunctions.type(SURNAME,myPassenger.getLastName());
        basicFunctions.type(DISCOUNT, myPassenger.getDiscount());
        basicFunctions.type(ADULTS, myPassenger.getPeopleCount());
        basicFunctions.type(CHILDREN, myPassenger.getChildCount());
        basicFunctions.type(BUGS, myPassenger.getBagCount());
        basicFunctions.selectByText(FLIGHT, myPassenger.getDate());
        basicFunctions.click(GET_PRICE);
    }

}
