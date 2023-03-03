package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import myPageObject.BasicFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class TicketsBuyStepDefs {
    BasicFunctions bf = new BasicFunctions();

    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GOGOGO = By.xpath(".//span[@class = 'gogogo']");

    @Given("Homepage")
    public void homepage() {

    }

    @When("User is opening homepage {word}")
    public void open_homepage(String url) {
        bf.openUrl(url);
    }

    @When("User is choosing start location {string} and destination {string}")
    public void userIsChoosingStartLocationAndDestination(String flyFrom, String flyTo) {
        bf.select(FROM,flyFrom);
        bf.select(TO,flyTo);
    }

    @And("click on button GO GO GO!")
    public void clickOnButtonGOGOGO() {
        bf.click(GOGOGO);
    }



}
