package Core_Java;

public class This_Key_Difference {
	
	private String color;
	
	/*super: 
	Super Keyword used to access /call the parent class members(Variables or methods)	
	this:
	This keyword used to call the current class members . This requires when we have a parameter
	with the same name as an instance variable . This keyword is mostly used in constructors and 
	setters. Also we can use "This" keyword in getter sometime . But that is optional.
	
	Note : In the static block we will not be able to use the super or This keyword 
	*/
	
	//constructor
	
	public void setColor(String color) {
		this.color = color;
	}

	public This_Key_Difference(String color) {
		this.color=color;
	}
		

}
