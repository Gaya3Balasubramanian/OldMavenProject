package com.codee.cli;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SimpleLoginCode {
	
	WebDriver driver;
	String url;
	ExtentReports report;
	ExtentTest test;
 
	@BeforeClass
	@Given("^User is on Home page$") 
	public void beforeClass() {
       driver=new FirefoxDriver();
       report=new ExtentReports("C:\\user\\extent reports\\Screen Shots\\Login.html");
       test=report.startTest("Login Test");
       url="https://letskodeit.teachable.com/p/practice";
       driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
       test.log(LogStatus.INFO, "Browser ");
       driver.manage().window().maximize();
       driver.get(url);
		
	}
	
	

	

	
  @When("^User should be able to access the login button$" )	
  @Test(groups= {"Login"}, enabled=false)
	public void LoginMethod () throws InterruptedException{
	  driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
	  System.out.println("Login Button clicked successully");
	  driver.findElement(By.id("user_email")).sendKeys("Test@email.com");
	  System.out.println("Email Id placed successfully");
	  driver.findElement(By.id("user_password")).sendKeys("Test");
	  System.out.println("Password placed successfully");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  System.out.println("Login Button clicked successfully");
	 String error1=driver.findElement(By.xpath("//div[@class='content-box']//div[contains(text(),'Invalid email or password')]")).getText();
	 System.out.println(error1);
	 String Error=error1.substring(0, 25);
	 System.out.println(Error);

	}
  
  @When("^User should be able to access the Navigate through pages$" )	
  @Test(groups= {"Page"})
	public void PageNavigation1 () throws InterruptedException{
	  String currenturl=driver.getCurrentUrl();
	  System.out.println("Current url is:"+ currenturl );
	  Thread.sleep(2000);
	  
	   String forwardurl="https://sso.teachable.com/secure/42299/users/sign_up?reset_purchase_session=1"; 
	   driver.navigate().to(forwardurl);
	   System.out.println("Forward url is :"+ forwardurl);
	   Thread.sleep(2000);
	   
	   String title=driver.getTitle();
	   System.out.println("Title is:"+title);
	   Thread.sleep(2000);
	   
	   driver.navigate().back();
	   System.out.println("Navigate back to current url" );
	   Thread.sleep(2000);
	   
     

	}
  
  
	 
	@AfterClass
	@Then("^User should be able to close the browser$")
		public void AfterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		report.endTest(test);
		report.flush();
		
		
}


  
  }

