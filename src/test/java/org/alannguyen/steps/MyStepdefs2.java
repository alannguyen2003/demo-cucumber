package org.alannguyen.steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs2 {
    @Given("User enter log out button")
    public void userEnterLogOutButton() {
        System.out.println("You are logged out!");
    }

    @Then("User is navigated to login page")
    public void userIsNavigatedToLoginPage() {
        System.out.println("Bạn đang ở trang log in, vui lòng log in lại!");
    }
}
