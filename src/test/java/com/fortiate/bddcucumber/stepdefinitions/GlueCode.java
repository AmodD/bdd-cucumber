package com.fortiate.bddcucumber.stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java8.En;

public class GlueCode implements En {

	private WebDriver driver;

	public GlueCode() {
		
		Given("I am on a browser", () -> {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
		});

		When("I type http:\\/\\/localhost:{int} in the address bar", (Integer int1) -> {
		    // Write code here that turns the phrase above into concrete actions
		    driver.navigate().to("http://localhost:48000");

		});

		Then("I should see the home login page", () -> {
		    // Write code here that turns the phrase above into concrete actions
			
			try {
			WebElement pageContent = driver.findElement(By.xpath("//*[text()='This site can’t be reached']"));
			
			//WebDriverWait wait = new WebDriverWait(driver, 60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id<locator>));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='This site can’t be reached']")));
			
			if(pageContent.isDisplayed()) fail("The Application Was Not Accessible ! ");
			
			}
			catch(NoSuchElementException e) {
				assertTrue("Site was reachable",true);
			}
		    
		});
		
	}
}
