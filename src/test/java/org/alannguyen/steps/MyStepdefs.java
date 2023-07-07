package org.alannguyen.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {

    private WebDriver webDriver;

    @Given("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("http://localhost:8080/vsos/");
        webDriver.manage().window().maximize();
        Thread.sleep(4000);
        WebElement signInLink = webDriver.findElement(new By.ByXPath("//nav[@class='main-menu clearfix']//a[normalize-space()='Sign In']"));
        signInLink.click();
        Thread.sleep(4000);
    }

    @When("User hit login button")
    public void userHitLoginButton() {
    }

    @Then("User is navigated to home page")
    public void userIsNavigatedToHomePage() {
        webDriver.close();
    }
}
