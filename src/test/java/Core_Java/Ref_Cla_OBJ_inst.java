package Core_Java;

public class Ref_Cla_OBJ_inst {
	
	private String color;
	
/*	1.what is class ?
	A class is basically a blueprint for a house , Using that only 
	we can bulid as many houses as we like based on those plans
	
 
	
	3.What is reference
	Each house which we build should have physical address . In other words if you want to tell someone
	where you live , you give them your address . This is known as reference. Also we can copy that reference
	many times as we like . For example building contains so many house however we can have only one address or
	reference for the  different object
	Also we can pass refereneces as parameters to constructors or to methods
	*/
	
	public Ref_Cla_OBJ_inst(String color) {
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public static void main(String[] args) {
		
		  /* 2.What is instance ?
		    Each house which we build is an object (using the key word New, in other words used to instantiate )
		    is known as instance
		    
		    Ref_Cla_OBJ_inst house=new Ref_Cla_OBJ_inst("Blue");
		    this is new instance creation . In this house is the variable name . In another words it is the
		    reference to the object in memory 
		    Ref_Cla_OBJ_inst anotherhouse=house;	
		    this is also the reference which is creating another reference to the same object in memory.
		    in this we have two references pointing to the same object in the memory 
		    Take house as an object 
		      
		    */				
		Ref_Cla_OBJ_inst house=new Ref_Cla_OBJ_inst("Blue");
		Ref_Cla_OBJ_inst anotherhouse=house;	
		System.out.println(house.getColor());
		System.out.println(anotherhouse.getColor());
		
		
	}

}
