package org.alannguyen.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;


public class MyStepdefs {

    private WebDriver webDriver = new ChromeDriver();

    @Given("^User enters \"(.*)\" and \"(.*)\"$")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {
        webDriver.get("https://demo.guru99.com/v4/");
        webDriver.manage().window().maximize();
        Thread.sleep(4000);
        webDriver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
        webDriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    @When("User hit login button")
    public void userHitLoginButton() {
        webDriver.findElement(By.xpath("//input[@name='btnLogin']")).click();
    }

    @Then("^User is navigated to home page and equals \"(.*)\"$")
    public void userIsNavigatedToHomePage(String username) throws InterruptedException {
        Thread.sleep(4000);
        WebElement welcomeLine = webDriver.findElement(By.cssSelector("tr[class='heading3'] td"));
        assertEquals(welcomeLine.getText(), "Manger Id : " + username);
        webDriver.close();
    }
}
