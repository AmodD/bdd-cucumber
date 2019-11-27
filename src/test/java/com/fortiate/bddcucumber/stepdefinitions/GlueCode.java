package com.fortiate.bddcucumber.stepdefinitions;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java8.En;
import junit.framework.Assert;
import io.cucumber.java.en.Given;

public class GlueCode implements En {

	private WebDriver driver;

	public GlueCode() {
		 
		/*Given("I am on a Chrome browser", () -> {
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
		});

		When("I type http:\\/\\/localhost:{int} in the address bar", (Integer int1) -> {
		    driver.navigate().to("http://localhost:48000");
		});

		Then("I should see the product login page", () -> {
			assertEquals("Fortiate Data Solutions",driver.getTitle());
		});*/
		
		
		Given("I have entered http://localhost:48000", () -> {
			
			
			System.setProperty("webdriver.gecko.driver", "/home/amit/FORTIATE/BUILD/WORKSPACES/JAVA/bdd-cucumber/geckodriver-v0.26.0-linux64/geckodriver");
			driver =new FirefoxDriver();
			
			
		    
			//throw new cucumber.api.PendingException();
			
			});
		And("I see the login page",() -> {
			driver.navigate().to("http://localhost:48000");
		});
		/*Given("I am on a Safari browser", () -> {
			driver =new SafariDriver();
		});*/
		

/*Given("I have entered http:\\/\\/localhost:{int}", (Integer int1) -> {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	driver = new ChromeDriver();
    driver.navigate().to("http://localhost:48000");

});*/

/*Given("I see the login page", () -> {
	if (!(driver.findElement(By.id("login_page"))).isDisplayed()) fail("Login Page Not Displayed");
});*/

When("I enter valid user ID and Password", () -> 
{
	
	driver.findElement(By.name("email")).sendKeys("amit@fortiate.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.name("password")).sendKeys("abcdef12");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //throw new cucumber.api.PendingException();
	
	});

Then("I should see the dashboard page", () -> {
    
	
	driver.findElement(By.name("button")).click();
    //throw new cucumber.api.PendingException();
});

When("I enter invalid user ID and valid Password", () -> {
	driver.findElement(By.name("email")).sendKeys("amit123@fortiate.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.name("password")).sendKeys("abcdef12");
    //driver.findElement(By.name("button")).click();
});

Then("I should see an error message ", () -> {
	 
	 WebElement actualmsg = driver.findElement(By.id("emailerror"));
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String errormsg="invalid login id";
	
	if(errormsg.equalsIgnoreCase((actualmsg).getText()))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}
	

   
});

When("I enter Valid user ID and Invalid Password", () -> {
	driver.findElement(By.name("email")).sendKeys("amit@fortiate.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.name("password")).sendKeys("abcdef12345");
    //driver.findElement(By.name("button")).click();
    //throw new cucumber.api.PendingException();
});

Then("I should see an error message", () -> {
	WebElement actualmsg = driver.findElement(By.id("passworderror"));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	String errormsg="invalid password";
	
	if(errormsg.equalsIgnoreCase((actualmsg).getText()))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}

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

