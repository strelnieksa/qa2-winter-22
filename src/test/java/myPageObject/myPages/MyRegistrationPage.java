package myPageObject.myPages;

import myPageObject.BasicFunctions;
import myPageObject.myModel.MyFlightInfo;
import org.openqa.selenium.By;

public class MyRegistrationPage {
    private final By NAME = By.id("name");
    private final By SURNAME = By.id("surname");
    private final By DISCOUNT = By.id("discount");
    private final By ADULTS = By.id("adults");
    private final By CHILDREN = By.id("children");
    private final By BAGS = By.id("bugs");
    private final By FLIGHT = By.id("flight");
    private final By AFTER_GETTING_PRICE = By.xpath(".//span[@class = 'bTxt']");
    private final By GET_PRICE = By.xpath(".//span[@onclick = 'setLang();']");

    private BasicFunctions basicFunctions;

    public MyRegistrationPage(BasicFunctions basicFunctions) {
        this.basicFunctions = basicFunctions;
    }

    public  void fillRegistrationData(MyFlightInfo info){
        basicFunctions.type(NAME, info.getPassenger().getFirstName());
        basicFunctions.type(SURNAME,info.getPassenger().getLastName());
        basicFunctions.type(DISCOUNT, info.getDiscount());
        basicFunctions.type(ADULTS, info.getAdultsCount());
        basicFunctions.type(CHILDREN, info.getChildCount());
        basicFunctions.type(BAGS, info.getBagsCount());
        basicFunctions.selectByText(FLIGHT, info.getFlightDate());

    }

    public void getPrice(){
        basicFunctions.click(GET_PRICE);
    }

    public void airportCheckOnRegistrationPage(String from, String to){
        basicFunctions.assertEquals(from, basicFunctions.getListWebElementText(AFTER_GETTING_PRICE,
                0, 0));
        basicFunctions.assertEquals(to, basicFunctions.getListWebElementText(AFTER_GETTING_PRICE,
                0, 1));
    }

}
