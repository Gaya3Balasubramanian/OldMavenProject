package Abstraction_Demo;

import org.openqa.selenium.WebDriver;

public class Abstract_3 {
	
	static WebDriver driver;

public static void main(String[] args) {
	Abstract_2 abst= new Abstract_2(driver);
	abst.Radiobutton();
	abst.checkbox();
	
	
}
}
