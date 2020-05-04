package Interview_Practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SearchPageFactory1 {
WebDriver driver;
ExtentReports reports;
ExtentTest test;
	
	@FindBy(id="bmwradio")
	WebElement radiobutton;
	
	@FindBy(xpath="//div[@id='radio-btn-example']//input[@type='radio']")
	List<WebElement> ListRadio;
	
	@FindBy(id="bmwcheck")
	WebElement Checkbox;
	
	@FindBy(xpath="//div[@id='checkbox-example']//input[@type='checkbox']")
	List<WebElement> ListCheckbox;
	
	@FindBy(id="carselect")
	WebElement dropdownsingle;
	
	@FindBy(id="carselect")
	WebElement dropdown;
	
	@FindBy(id="multiple-select-example")
	WebElement multiplesingle;
	
	@FindBy(id="multiple-select-example")
	WebElement multiple;
	
	@FindBy(id="openwindow")
	WebElement OpenWindow;
	
	@FindBy(id="search-courses")
	WebElement searchbox;
	
	
	@FindBy(id="name")
	WebElement Name;
	
	
	
	public SearchPageFactory1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickRadioButton() {
	 radiobutton.click();
		
	}
	
	public void ClickCheckbox() {
		Checkbox.click();
	}
	
	public void dropdownsingle() {
		Select sel= new Select(dropdownsingle);
		sel.selectByIndex(2);
		
	}
	
	
	
	public void ClickRadioButtonList() {
		int size = ListRadio.size();
		for(int i=0;i<size;i++) {
			ListRadio.get(i).click();
			System.out.println("Radio");
			
		}
	}
	public void ClickCheckboxList() {
		int size= ListCheckbox.size();
		for(int i=0;i<size;i++) {
			ListCheckbox.get(i).click();
			System.out.println("Check");
	}
}

	public void Dropdown() {
    
     Select sel= new Select(dropdown);
     List<WebElement> droplist= sel.getOptions();
     int size= droplist.size();
     for(int i=0;i<size;i++) {
    	String option= droplist.get(i).getText();
    	System.out.println(option);
    	 
     }
		
	}
	
	
	public void multiplesingle() {
		Select sel1= new Select(multiplesingle);
		sel1.selectByIndex(2);
	}
	
	public void multiple() {
		Select sel1= new Select(multiple);
		sel1.selectByIndex(1);
		List<WebElement> multiplelist= sel1.getAllSelectedOptions();
		for(WebElement items:multiplelist) {
			System.out.println(items.getText());
		}
		
	}
	
	public void switchtowindowdemo() {
		String parenthandle=driver.getWindowHandle();
		System.out.println("ParentHandle:"+parenthandle );
		
		OpenWindow.click();
		
		Set<String> Handles= driver.getWindowHandles();
		System.out.println("Handles:"+Handles );
		
		for(String Handle:Handles) {
			if(!Handle.equals(parenthandle)) {
				driver.switchTo().window(Handle);
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				searchbox.sendKeys("Python");
				driver.close();
				
			}
		}
		
		driver.switchTo().window(parenthandle);
		Name.sendKeys("Gayathri");
		System.out.println("Successful");
		
		
	}
	
	
	
	
}