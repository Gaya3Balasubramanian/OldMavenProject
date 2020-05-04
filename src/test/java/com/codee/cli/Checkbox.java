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

public class Checkbox {
	
	WebDriver driver;
	String url;
	ExtentReports reports;
	ExtentTest test;

  @BeforeClass
  @ Given("^User is on Home page$")
  public void beforeClass() throws InterruptedException {
	  url="https://letskodeit.teachable.com/p/practice";
	 reports=new ExtentReports("C:\\user\\extent reports\\Screen Shots\\Radiobutton.html");
	 test=reports.startTest("Verify Checkbox");
	 driver=new FirefoxDriver();
	 test.log(LogStatus.INFO, "Browser Initiated");
	 Thread.sleep(3000);
	 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.get(url);
	 test.log(LogStatus.INFO, "Browser logged successfully");
  }
  
  @When("^User should be able to see the checkbox$")
  @Test(priority=0)
  public void Checkbox1() {
	  WebElement checkbox=driver.findElement(By.id("bmwcheck"));
	  checkbox.click();
	  test.log(LogStatus.INFO, "Check box checked successfully");
	  
  }
  @Then("^User should be able to Click the radio$")
  @Test(priority=0)
  public void radio() throws InterruptedException {
	  WebElement radio=driver.findElement(By.id("bmwradio"));
	  radio.click();
	  test.log(LogStatus.INFO, "radio box checked successfully");
	  
	  }
	  
  
  @Then("^browser should be closed successfully$")
  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
	  reports.endTest(test);
	  reports.flush();
  }

}
