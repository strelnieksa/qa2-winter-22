import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import java.util.List;

public class TicketsHomework {

    private WebDriver browser;
    private WebDriverWait wait;

    //------------------- Destination From -> To ----------------------
    final private By FROM = By.id("afrom");
    final private By TO = By.id("bfrom");
    final private String FROM_AIRPORT = "VVO";
    final private String TO_AIRPORT = "TNR";
    //-------------------Accept btn------------------------------------
    final private By GOGOGO = By.xpath(".//span[@class = 'gogogo']");
    //----------------Destination List To Check--------------------------
    final private By DESTINATION = By.xpath(".//span[@class = 'bTxt']");

    //------------------- Reservation Form ----------------------------
    final private By NAME = By.id("name");
    final private By SURNAME = By.id("surname");
    final private By DISCOUNT = By.id("discount");
    final private By ADULTS = By.id("adults");
    final private By CHILDREN = By.id("children");
    final private By BUGS = By.id("bugs");
    final private By FLIGHT = By.id("flight");
    //---------------------Get Price After Filling Reservation Form----------------
    final private By GET_PRICE = By.xpath(".//span[@onclick = 'setLang();']");
    //-------------------- Name After filling Form ------------------------
    final private String name = "Alinax Mayday";
    //---------------------------- Destination & Name Check --------------------------
    final private By DESTINATION_NAME = By.xpath(".//span[@class = 'bTxt']");
    //---------------------------- Book ID2 ----------------------------------------------
    final private By BOOK2 = By.id("book2");
    //----------------------------Text Check----------------------------------------------
    final private By TEXT_CHECK = By.name(" for 500 EUR Your reservation number is - !");
    //-------------------------- Seat Selection ------------------------------------------
    final private By ALL_SEATS = By.id("seats");
    final private String seat = "27";
    //------------------------- Final Book BTN3 ---------------------
    final private By BOOK3 = By.id("book3");

    @Test

    public void bookingQATest() {
        System.setProperty("webdriver.chrome.driver", "C:\\ideaProject\\chromedriver.exe");
        browser = new ChromeDriver();
        wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        browser.manage().window().maximize();
        browser.get("http://www.qaguru.lv:8089/tickets/");

        flightSelect(FROM, FROM_AIRPORT);
        flightSelect(TO, TO_AIRPORT);
        wait.until(ExpectedConditions.elementToBeClickable(GOGOGO)).click();

        List<WebElement> destination = browser.findElements(DESTINATION);
        String fromDestination = destination.get(0).getText();
        String toDestination = destination.get(1).getText();

        Assertions.assertEquals(FROM_AIRPORT, fromDestination, "ERROR IN START POINT");
        Assertions.assertEquals(TO_AIRPORT, toDestination, "ERROR IN END POINT");

        fillReservationForm(NAME, name);
        fillReservationForm(SURNAME, "Pretty");
        fillReservationForm(DISCOUNT, "HaPPy20");
        fillReservationForm(ADULTS, "2");
        fillReservationForm(CHILDREN, "1");
        fillReservationForm(BUGS, "2");
        flightSelect(FLIGHT, "14");

        wait.until(ExpectedConditions.elementToBeClickable(GET_PRICE)).click();

        List<WebElement> destination2 = wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(DESTINATION_NAME, 3));
        String nameAfterRegistration = destination2.get(2).getText();
        String fromDestinationSecond = destination2.get(3).getText();
        String toDestinationSecond = destination2.get(4).getText();

        nameAfterRegistration = StringUtils.chop(nameAfterRegistration);
        System.out.println(nameAfterRegistration);

        System.out.println("-------------------------------------");
        System.out.println(name + " " + " " + nameAfterRegistration + "\n" + fromDestination + " " + " " + fromDestinationSecond + "\n" + toDestination + " " + " " + toDestinationSecond);
        System.out.println("-------------------------------------");

        Assertions.assertEquals(fromDestination, fromDestinationSecond, "Kaut kas ne tā!");
        Assertions.assertEquals(toDestination, toDestinationSecond, "Kaut, kas ļoti ne tā!");
        Assertions.assertEquals(name, nameAfterRegistration, "Vārdi nesakŗīt!");

        String checkName = browser.findElement(By.xpath(".//div[@id = 'response']")).getText();
        if (checkName.contains("EUR")) {
            System.out.println("Price is available");
        } else {
            System.out.println("NO PRICE!!!");
        }
        String strPrice = StringUtils.substringBetween(checkName, " for ", " EUR ");
        int price = Integer.parseInt(strPrice);
        System.out.println("PRICE: " + price);

        wait.until(ExpectedConditions.elementToBeClickable(BOOK2)).click();

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(".//div[@class = 'seat']"), 32));
        List<WebElement> seats = browser.findElements(By.xpath(".//div[@class = 'seat']"));
        for (WebElement we : seats) {
            if (we.getText().equals(seat)) {
                we.click();
                break;
            }
        }

        String checkSeat = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class ='line']"))).getText();
        String compareSeatNumber = StringUtils.getDigits(checkSeat);

        Assertions.assertEquals(seat, compareSeatNumber, "Vietas nav vienādas!!!");

        wait.until(ExpectedConditions.elementToBeClickable(BOOK3)).click();

        String thankYou = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class = 'finalTxt']"))).getText();
        if (thankYou.contains("Thank")){
            System.out.println("Thank You Homework Done!");
        }
        else {
            System.out.println("Reservation failed!!!");
        }
//
//        //šis ir upload no Lenovo Pc !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



    }


    private void flightSelect(By locator, String infoData) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        Select selectairport = new Select(we);
        selectairport.selectByValue(infoData);
    }

    private void fillReservationForm(By locator, String inputData) {
        WebElement we = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        we.clear();
        we.sendKeys(inputData);
    }
}
