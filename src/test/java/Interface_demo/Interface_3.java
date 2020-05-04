package Interface_demo;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Interface_3 implements Interface_1, Interface_2{
	
	 WebDriver driver;

	public ArrayList<String> write() {
		ArrayList<String> write = new ArrayList<String>();
		write.add("bread");
		write.add("Cheese");
		return write;
		
		
	}

	
	public void RadioButton() {
	WebElement radio = driver.findElement(By.id("bmwradio"));
	radio.click();
		
	}

	public void Checkbox() {
	WebElement check= driver.findElement(By.id("bmwcheck"));
	check.click();
		
	}

	public void dropdown() {
	WebElement dropdown = driver.findElement(By.id("carselect"));
	Select sel=  new Select(dropdown);
	sel.selectByIndex(1);
	
	
	List<WebElement>  drop= sel.getOptions();
	int size= drop.size();
	System.out.println(size);
	for(int i=0; i<0;i++) {
		String selection= drop.get(i).getText();
		System.out.println(selection);
	}
	
	

		
	}


	public void check(String name) {
		// TODO Auto-generated method stub
		
	}

	

}
