package Pageobjectmodel_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class FrameWorkTestcases {
	
	WebDriver driver;
	String url;
	SearchPageFactory search;
  
	@BeforeClass
	public void beforeClass() {
		url="https://letskodeit.teachable.com/p/practice";
		driver= new FirefoxDriver();
		search= new SearchPageFactory(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get(url);	
	}

	@Test
	public void f() {
		search.ClickRadioButton();
		search.ClickCheckbox();
		search.SendName("Gayathri");
		search.selectMultiple();
		search.Selectdropdown();
	}

	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
	}

}
