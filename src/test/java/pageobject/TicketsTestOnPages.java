package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;

public class TicketsTestOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private BaseFunc baseFunc = new BaseFunc();
    private final String FROM_AIRPORT = "EZE";
    private final String TO_AIRPORT = "SVO";

    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("testname", "Lastname", "dic10off",
        2, 1, 4, "16-05-2018");

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);

    }


}
