package myPageObject;

import myPageObject.myModel.MyFlightInfo;
import myPageObject.myModel.MyPassenger;
import myPageObject.myPages.*;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsTestHomeworkByMyself {
    private final String URL = "www.qaguru.lv:8089/tickets";
    private final  int SEAT_NUMBER = RandomUtils.nextInt(1, 35);

    private MyPassenger pasazhieris = new MyPassenger("Alinax", "De May Day");

    MyFlightInfo info = new MyFlightInfo("SVO","RIX",
            "CFGKYU",2,3,
            2, "14-05-2018",SEAT_NUMBER );

    private String pr = "1055";


//    private MyPassenger pasazhieris2 = new MyPassenger("Kartula", "Apadigo",
//            "Strategija 888", 2, 2, 5,
//            "14-05-2018");



    private BasicFunctions basicFunctions = new BasicFunctions();

    @Test
    public void mySuccesfullRegistrationTest() {

        info.setPassenger(pasazhieris);

        basicFunctions.openUrl(URL);
        MyHomePage myHomePage = new MyHomePage(basicFunctions);
        myHomePage.selectAirports(info.getDeparture(), info.getDestination());

        MyRegistrationPage registration = new MyRegistrationPage(basicFunctions);
        registration.airportCheckOnRegistrationPage(info.getDeparture(), info.getDestination());
        registration.fillRegistrationData(info);
        registration.getPrice();

        MyPricePage myPricePage = new MyPricePage(basicFunctions);
        myPricePage.assertGetAirportAndNameData(pasazhieris.getFirstName());
        myPricePage.priceAvailabilityCheck();
        myPricePage.priceCheckEuro(pr);
        myPricePage.bookPrice();

        MySeatPage seatPage = new MySeatPage(basicFunctions);
        seatPage.chooseSeatNumber(SEAT_NUMBER);

        MyChoosenSeatPage myChoosenSeatPage = new MyChoosenSeatPage(basicFunctions);
        myChoosenSeatPage.assertSeat(SEAT_NUMBER);
        myChoosenSeatPage.bookSeat();

        MySuccesfulReservationPage end = new MySuccesfulReservationPage(basicFunctions);
        Assertions.assertTrue(end.isSuccesfulEndingCheck(), "Error - Teksts nesakrīt!!!");


    }
}
