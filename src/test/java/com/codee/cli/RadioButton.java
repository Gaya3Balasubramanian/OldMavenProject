package com.codee.cli;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RadioButton {
	
	WebDriver driver;
	String url;
	ExtentReports reports;
	ExtentTest test;
	
	

  @BeforeClass
  @Given("^User is on Home page$") 
  public void beforeClass() throws InterruptedException {
	  reports= new ExtentReports("C:\\user\\extent reports\\Screen Shots\\Radiobutton.html");
	  test=reports.startTest("Verify RadioVutton");
	   driver=new FirefoxDriver();
	   test.log(LogStatus.INFO, "Browser initiated");
	   Thread.sleep(3000);
	   url="https://letskodeit.teachable.com/p/practice";
	   driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   test.log(LogStatus.INFO, "Browser Page got maximised");
	   driver.get(url);
	   test.log(LogStatus.INFO, "Url got opened");
	   
  }

  @Test(enabled=false)
  @When("^User should be able to see RadioButton$" ) 
  public void RadioButton1() {
	  WebElement Radio=driver.findElement(By.id("bmwradio"));
	  Radio.click();
	  test.log(LogStatus.INFO, "One Radio Button got selected");
	  System.out.println("Radio Button Clicked Successfully");
	  
	  
	  
	  
  }
  
  
  @Test(enabled=false)
  @Then("^User should be able to Click RadioButton$")
  public void RadioButton2() {
	  List<WebElement> RadioList=driver.findElements(By.xpath("//div[@id='radio-btn-example']//input[@type='radio']"));
		int size=RadioList.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			RadioList.get(i).click();
			test.log(LogStatus.INFO, "All Radio button got selected");
			System.out.println("All Radio Button got selected successfully");
		
	}
	  
	  
  }
  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
	  reports.endTest(test);
	  reports.flush();
  }

}
