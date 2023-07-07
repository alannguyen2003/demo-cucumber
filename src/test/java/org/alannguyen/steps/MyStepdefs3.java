package org.alannguyen.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class MyStepdefs3 {
    @Given("none given")
    public void noneGiven() {
    }

    @When("none when")
    public void noneWhen() {
    }

    @Then("none then")
    public void noneThen() {
        assertEquals(9, 9);
    }
}
