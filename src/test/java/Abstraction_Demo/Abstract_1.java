package Abstraction_Demo;

import org.openqa.selenium.WebDriver;

public abstract class Abstract_1 {
	WebDriver driver;
	
	public Abstract_1(WebDriver driver){
		this.driver=driver;
	}
	
	
	public abstract void Radiobutton();
	public abstract void checkbox();
	
	
	

}
