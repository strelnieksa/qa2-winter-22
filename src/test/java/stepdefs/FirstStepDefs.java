package stepdefs;

import io.cucumber.java.en.When;

public class FirstStepDefs {
    @When("We are printing welcome text")
    public void print_welcome_text(){
        System.out.println("Printed example text!");
    }
}
