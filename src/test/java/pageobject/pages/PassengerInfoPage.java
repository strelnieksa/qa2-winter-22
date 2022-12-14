package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;
import pageobject.model.Passenger;

public class PassengerInfoPage {

    private final  By NAME = By.id("name");
    private final  By SURNAME = By.id("surname");
    private final  By DISCOUNT = By.id("discount");
    private final  By ADULTS = By.id("adults");
    private final  By CHILDREN = By.id("children");
    private final  By BUGS = By.id("bugs");
    private final  By FLIGHT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");

    private final By RESERVATION_INFO = By.xpath(".//span[@class = 'bTxt']");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc){
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(Passenger passenger){
        baseFunc.fillReservationForm(NAME, passenger.getFirstName());
        baseFunc.fillReservationForm(SURNAME, passenger.getLastName());
        baseFunc.fillReservationForm(DISCOUNT, passenger.getDiscount());
        baseFunc.fillReservationForm(ADULTS, passenger.getPeopleCount());
        baseFunc.fillReservationForm(CHILDREN, passenger.getChildCount());
        baseFunc.fillReservationForm(BUGS, passenger.getBagCount());
        baseFunc.fillReservationForm(FLIGHT, passenger.getDate());

        baseFunc.click(GET_PRICE_LINK);

    }
}
