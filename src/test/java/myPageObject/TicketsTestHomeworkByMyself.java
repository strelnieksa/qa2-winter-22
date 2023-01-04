package myPageObject;

import myPageObject.myModel.MyPassenger;
import myPageObject.myPages.*;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsTestHomeworkByMyself {
    private final String URL = "www.qaguru.lv:8089/tickets";
    final private String FROM_AIRPORT = "VVO";
    final private String TO_AIRPORT = "TNR";
    final private int SEAT_NUMBER = RandomUtils.nextInt(1, 35);

    private MyPassenger pasazhieris = new MyPassenger("Alinax", "De May Day",
            "Start1", 1, 0, 3,
            "14-05-2018");
    private MyPassenger pasazhieris2 = new MyPassenger("Kartula", "Apadigo",
            "Strategija 888", 2, 2, 5,
            "14-05-2018");
    private BasicFunctions basicFunctions = new BasicFunctions();

    @Test
    public void mySuccesfullRegistrationTest() {


        basicFunctions.openUrl(URL);
        MyHomePage myHomePage = new MyHomePage(basicFunctions);
        myHomePage.selectAirports(FROM_AIRPORT, TO_AIRPORT);

        MyRegistrationPage registration = new MyRegistrationPage(basicFunctions);
        registration.fillRegistrationData(pasazhieris);

        MyPricePage myPricePage = new MyPricePage(basicFunctions);
        myPricePage.assertGetPriceData(pasazhieris.getFirstName(), FROM_AIRPORT, TO_AIRPORT);
        myPricePage.priceAvailabilityCheck();
        myPricePage.bookPrice();

        MySeatPage seatPage = new MySeatPage(basicFunctions);
        seatPage.chooseSeatNumber(SEAT_NUMBER);

        MyChoosenSeatPage myChoosenSeatPage = new MyChoosenSeatPage(basicFunctions);
        myChoosenSeatPage.assertSeat(SEAT_NUMBER);

        MySuccesfulReservationPage end = new MySuccesfulReservationPage(basicFunctions);
        Assertions.assertTrue(end.isSuccesfulEndingCheck(), "ERROR!");


    }
}
