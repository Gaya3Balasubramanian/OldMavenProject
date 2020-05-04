package Abstraction_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Abstract_2 extends Abstract_1 {

	String url;
	
	public Abstract_2(WebDriver driver) {
		super(driver);
		url="https://learn.letskodeit.com/p/practice";
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.navigate().to(url);
		
	}

	@Override
	public void Radiobutton() {
		
		WebElement radio= driver.findElement(By.id("bmwradio"));
		radio.click();
		
		
	}

	@Override
	public void checkbox() {
		
		WebElement check= driver.findElement(By.id("bmwcheck"));
		check.click();
		
		
	}
	

}
