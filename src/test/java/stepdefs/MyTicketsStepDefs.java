package stepdefs;

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myPageObject.BasicFunctions;
import myPageObject.myModel.MyFlightInfo;
import myPageObject.myModel.MyPassenger;
import myPageObject.myModel.MyReservation;
import myPageObject.myPages.*;
import org.apache.commons.lang3.RandomUtils;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import requesters.TicketsRequester;

import java.util.List;
import java.util.Map;

public class MyTicketsStepDefs {
    private MyFlightInfo myFlightInfo;
    private MyHomePage myHomePage;
    private MyRegistrationPage myRegistrationPage;
    private MyPricePage myPricePage;
    private MySeatPage mySeatPage;
    private MyChoosenSeatPage myChoosenSeatPage;
    private MySuccesfulReservationPage mySuccesfulReservationPage;
    private List<MyReservation> reservations;
    private MyReservation reservationfromapi;
    private final int SEAT_NUMBER = RandomUtils.nextInt(1, 35);
    private BasicFunctions bf = new BasicFunctions();

    private final String URL = "www.qaguru.lv:8089/tickets";


    //    ----------------------------------------------------
    private final By BOOK_PRICE = By.id("book2");

    @Given("flight info:")
    public void set_flight_info(Map<String, String> params) {
        myFlightInfo = new MyFlightInfo(params.get("destination"), params.get("departure"),
                params.get("discount"), Integer.parseInt(params.get("adults")),
                Integer.parseInt(params.get("kids")), Integer.parseInt(params.get("bags")),
                params.get("flight_date"), Integer.parseInt(params.get("seat")));
    }

    @Given("passenger info is:")
    public void set_passenger_info(Map<String, String> params) {
        MyPassenger pasazhieriiitis = new MyPassenger(params.get("first_name"), params.get("last_name"));
        myFlightInfo.setPassenger(pasazhieriiitis);
    }

    @Given("home page opened")
    public void open_home_page() {
        bf.openUrl(URL);
        myHomePage = new MyHomePage(bf);
    }

    @When("we are selecting airports")
    public void select_airports() {
        myHomePage.selectAirports(myFlightInfo.getDeparture(), myFlightInfo.getDestination());
        myRegistrationPage = new MyRegistrationPage(bf);
    }

    @Then("selected airports appears on the next page")
    public void check_airports() {
        myRegistrationPage.airportCheckOnRegistrationPage(myFlightInfo.getDeparture(), myFlightInfo.getDestination());
    }

    @When("we are filling in passenger registration form")
    public void fill_passanger_data() {
        myRegistrationPage.fillRegistrationData(myFlightInfo);
        System.out.println(myFlightInfo.getPassenger().getFirstName());

    }

    @When("requesting price")
    public void push_get_price_btn() {
        myRegistrationPage.getPrice();
        myPricePage = new MyPricePage(bf);
    }


    @Then("passenger name and airports appears")
    public void check_passenger_name_and_airports() {
        myPricePage.assertGetAirportAndNameData(myFlightInfo.getPassenger().getFirstName());
    }

    @Then("price is {word} EUR")
    public void price_Availability_Check(String pricex) {
        myPricePage.priceCheckEuro(pricex);
    }

    @When("We are pressing Book button")
    public void pressing_book_button() {
        myPricePage.bookPrice();
        mySeatPage = new MySeatPage(bf);
    }

    @When("selecting seat")
    public void selecting_seat() {
        //      mySeatPage.chooseSeatNumber(SEAT_NUMBER);
        mySeatPage.chooseSeatNumber(SEAT_NUMBER);
        myChoosenSeatPage = new MyChoosenSeatPage(bf);

    }

    @Then("correct seat number appears")
    public void check_seat_number() {
        myChoosenSeatPage.assertSeat(SEAT_NUMBER);
    }

    @When("we are booking selected ticket")
    public void booking_seat() {
        myChoosenSeatPage.bookSeat();
        mySuccesfulReservationPage = new MySuccesfulReservationPage(bf);
    }

    @Then("succesful registration message appears")
    public void registration_message() {
        Assertions.assertTrue
                (mySuccesfulReservationPage.isSuccesfulEndingCheck(), "Error - Teksts nesakrīt!!!");
    }


    @When("we are requesting reservations date")
    public void request_reservations() throws JsonProcessingException {
        TicketsRequester requester = new TicketsRequester();
        reservations = requester.getReservations();
    }

    @Then("current reservation is in the list")
    public void find_reservation() {
        for (MyReservation r : reservations) {
            if (r.getName().equals(myFlightInfo.getPassenger().getFirstName())) {
                reservationfromapi = r;
                break;
            }
        }
        System.out.println(reservationfromapi.getId());
        System.out.println(reservationfromapi.getName());
        System.out.println(reservationfromapi.getSurname());
        Assertions.assertNotNull(reservationfromapi, "Reservation not found");
    }


    @Then("all reservation data is correct")
    public void check_reservation_data() {
        //reservationFromApi is used here for assertions
        Assertions.assertEquals(myFlightInfo, reservationfromapi);

    }

}
