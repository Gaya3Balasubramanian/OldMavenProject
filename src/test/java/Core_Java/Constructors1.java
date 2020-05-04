package Core_Java;

public class Constructors1 {
	
	private String name;
	

	private int number;
	private double ID;
	
	/*1.Constructors are created using access modifiers and class name
	  2.Constructors will execute on its own 
	  3.More than one constructors can be created in class
	  4.Constructors can also be overloaded
	  5.Using 1 constructor we can create parameter and that can be called using another constructor
	  6.When we run the class, constructors are the one which will execute first
	  7. We have already set the value in constructors however to call that 
	      method we need to return the value for that we need to use getters method to return the value
	*/
	
	public Constructors1(){
		this("Gayathri",1236,56.666);
	}
	
	public Constructors1(String name,int number ,double ID) {
		this.name=name;
		this.number=number;
		this.ID=ID;
		
	}
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public double getID() {
		return ID;
	}

	

}
