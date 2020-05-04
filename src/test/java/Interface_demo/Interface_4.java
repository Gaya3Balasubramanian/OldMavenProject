package Interface_demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Interface_4 {
	
	private static WebDriver driver;
	private static String url;
	
public static void main(String[] args) {
	Interface_3 inter= new Interface_3();
	inter.write();
    url="https://learn.letskodeit.com/p/practice";
	driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get(url);
	inter.RadioButton();
	inter.Checkbox();
	inter.dropdown();
	
	
	
}

}
