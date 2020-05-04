package Pageobjectmodel_demo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="bmwradio")
	WebElement radiobutton;
	
	
	@FindBy(id="bmwcheck")
	WebElement Checkbox;
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id="multiple-select-example")
	WebElement MultipleSelection;
	
	@FindBy(id="carselect")
	WebElement dropdown;

	
	public SearchPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickRadioButton() {
		radiobutton.click();
		
	}
	
	public void ClickCheckbox() {
		Checkbox.click();
	}
	
	public void SendName(String text) {
		Name.sendKeys(text);
	}
	
	public void selectMultiple() {
		Select sel= new Select(MultipleSelection);
		sel.selectByIndex(0);
		sel.selectByValue("orange");
		sel.selectByVisibleText("Peach");
		
		List<WebElement> selection=sel.getAllSelectedOptions();
		for(WebElement item:selection) {
			System.out.println(item.getText());
		}
	}
	
	
	public void Selectdropdown() {
		Select sel= new Select(dropdown);
		sel.selectByIndex(1);
		
		List<WebElement> dropdown=sel.getOptions();
		int size= dropdown.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			String option = dropdown.get(i).getText();
			System.out.println(option);
		}
	}
	

}
