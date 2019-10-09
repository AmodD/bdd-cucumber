package com.fortiate.bddcucumber.stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java8.En;
import io.cucumber.java.en.Given;

public class GlueCode implements En {

	private WebDriver driver;

	public GlueCode() {
		 
		Given("I am on a Chrome browser", () -> {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
		});

		When("I type http:\\/\\/localhost:{int} in the address bar", (Integer int1) -> {
		    driver.navigate().to("http://localhost:48000");
		});

		Then("I should see the product login page", () -> {
			assertEquals("Fortiate Data Solutions",driver.getTitle());
		});
		
		
		Given("I am on a Firefox browser", () -> {
			System.setProperty("webdriver.gecko.driver","geckodriver");
			driver =new FirefoxDriver();
		});
		
		Given("I am on a Safari browser", () -> {
			driver =new SafariDriver();
		});
		
		
		
		
		
		
		
		
		
		Then("I should see the home login page", () -> {
			try {
			WebElement siteInAccessibleInChrome = driver.findElement(By.xpath("//*[text()='This site can’t be reached']"));
			WebElement siteInAccessibleInFirefox = driver.findElement(By.xpath("//*[text()='Unable to connect']"));
			
			//WebDriverWait wait = new WebDriverWait(driver, 60);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id<locator>));
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='This site can’t be reached']")));
			
			if(siteInAccessibleInChrome.isDisplayed()) fail("The Application Was Not Accessible In Chrome ! ");
			if(siteInAccessibleInFirefox.isDisplayed()) fail("The Application Was Not Accessible In Firefox ! ");
			
			}
			catch(NoSuchElementException e) {
				assertTrue("Site was reachable",true);
			}
		    
		});
		
		
	}
}
