package Interview_Practice;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import Pageobjectmodel_demo.SearchPageFactory;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class FrameWorkTestcases1 {
	
	WebDriver driver;
	String url;
	SearchPageFactory1 search;
	ExtentReports reports;
	ExtentTest test;

  @BeforeMethod
  public void beforeMethod() {
	  url="https://letskodeit.teachable.com/p/practice";
	 driver= new FirefoxDriver();
		search= new SearchPageFactory1(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get(url);
		 
  }
  
  @Test
  public void f() {
	 
	//search.ClickRadioButton();
	//search.ClickRadioButtonList();
	//search.ClickCheckbox();
	//search.ClickCheckboxList();
	//search.dropdownsingle();
	//search.Dropdown();
	search.switchtowindowdemo();
	
  }
  


  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(2000);
		driver.quit();
  }

}
