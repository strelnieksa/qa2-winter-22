package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.HomePage;

public class TicketsTestOnPages {
    private final String URL = "http://www.qaguru.lv:8089/tickets/";
    private BaseFunc baseFunc = new BaseFunc();
    private final String FROM_AIRPORT = "EZE";
    private final String TO_AIRPORT = "SVO";

    @Test
    public void successfulRegistrationTest() {
        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

    }


}
