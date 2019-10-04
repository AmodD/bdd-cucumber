package com.fortiate.bddcucumber.stepdefinitions;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

import io.cucumber.java8.En;

public class GlueCode implements En {

	private WebDriver driver;

	public GlueCode() {
		
		

		Given("I am on a browser", () -> {
		    // Write code here that turns the phrase above into concrete actions
			//System.setProperty("webdriver.chrome.driver", "chromedriver");
			//driver = new ChromeDriver();
			System.setProperty("webdriver.gecko.driver","geckodriver");
			driver =new FirefoxDriver();
			
			//throw new cucumber.api.PendingException();
		});

		When("I type http:\\/\\/localhost:{int} in the address bar", (Integer int1) -> {
		    // Write code here that turns the phrase above into concrete actions
		    driver.navigate().to("http://localhost:48000");

		});

		Then("I should see the home login page", () -> {
		    // Write code here that turns the phrase above into concrete actions
			WebElement pageContent = driver.findElement(By.xpath("//*[text()='This site can’t be reached']"));
			
			if(pageContent.isDisplayed()) fail("The Application Was Not Accessible ! ");

			
		    
		});

		Given("I have hungry snake", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		When("When I feed my snake", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		Then("I receive snek snek", () -> {
		    // Write code here that turns the phrase above into concrete actions
		    throw new cucumber.api.PendingException();
		});

		
	}
}
