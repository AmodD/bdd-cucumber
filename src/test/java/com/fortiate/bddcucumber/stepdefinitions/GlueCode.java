package com.fortiate.bddcucumber.stepdefinitions;



import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.cucumber.java8.En;


public class GlueCode implements En {

	private WebDriver driver;

	public GlueCode() {

		Given("I have entered http://localhost:48000", () -> {
			System.setProperty("webdriver.gecko.driver", "geckodriver");
			 driver = new FirefoxDriver();
			//driver.navigate().to("http://localhost:48000");
		
		});
		
		try {
		And("I see the login page",() -> {
			driver.navigate().to("http://localhost:48000");
		});
		}
		catch(Exception e)
		{
			
		}
	
		When("I enter valid user ID and Password", () -> {
	
			driver.findElement(By.name("email")).sendKeys("amit@fortiate.com");
			Thread.sleep(2000);	  
			driver.findElement(By.name("password")).sendKeys("abcdef12");
		  
			
			
		});	

		Then("I should see the dashboard page", () -> {
			driver.findElement(By.name("button")).click();
			Thread.sleep(2000);	  
			driver.close();
			});


	   When("I enter invalid user ID and valid Password", () -> {
			driver.findElement(By.name("email")).sendKeys("gfdgfdgdfgdfgfddfg");
			driver.findElement(By.name("password")).sendKeys("abcdef12");
			Thread.sleep(2000);	  
		
        });
	   
	   When("I enter valid user ID and invalid Password", () -> {
			driver.findElement(By.name("email")).sendKeys("amit@fortiate.com");
			driver.findElement(By.name("password")).sendKeys("hghghghjghjgjghg");
			Thread.sleep(2000);	  
		
		
       });
         

		Then("I should see an error message", () -> {
		
			
			 
			WebElement emailmsg = driver.findElement(By.id("emailerror"));
		    emailmsg.getText();
			Thread.sleep(2000);	   
			WebElement pwdmsg = driver.findElement(By.id("passworderror"));
			pwdmsg.getText();
			Thread.sleep(2000);
			driver.findElement(By.name("button")).click();
			driver.close();

					
});
	
		
	}
	
}
	

// CODE KEPT FOR REFERENCE		
		
//		Then("I should see the home login page", () -> {
//			try {
//			WebElement siteInAccessibleInChrome = driver.findElement(By.xpath("//*[text()='This site can’t be reached']"));
//			WebElement siteInAccessibleInFirefox = driver.findElement(By.xpath("//*[text()='Unable to connect']"));
//			
//			//WebDriverWait wait = new WebDriverWait(driver, 60);
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id<locator>));
//			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='This site can’t be reached']")));
//			
//			if(siteInAccessibleInChrome.isDisplayed()) fail("The Application Was Not Accessible In Chrome ! ");
//			if(siteInAccessibleInFirefox.isDisplayed()) fail("The Application Was Not Accessible In Firefox ! ");
//			
//			}
//			catch(NoSuchElementException e) {
//				assertTrue("Site was reachable",true);
//			}
//		    
//		});

