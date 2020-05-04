package Polymorphism;


class Vegetables{
	private String Name;
	


	public Vegetables(String Name) {
		this.Name=Name;

	}
	
	public String getName() {
		return Name;
	}
	public String Vegetablecolor() {
		return "No color for this vegetable";
	}
}

class Tomato extends Vegetables{
	public Tomato() {
		super("Tomato");
		
	}
		
	public String Vegetablecolor() {
		return "The color of this vegetable is red";
		}
	}

class Brinjal extends Vegetables{
	public Brinjal() {
		super("Brinjal");
		
	}
		
	public String Vegetablecolor() {
		return "The color of this vegetable is Violet";
		}
	}

class Carrot extends Vegetables{
	public Carrot() {
		super("Carrot");
		
	}
		
	public String Vegetablecolor() {
		return "The color of this vegetable is Orange";
		}
	}

class Beetoot extends Vegetables{
	public Beetoot() {
		super("Beetoot");
		
	}
		
	public String Vegetablecolor() {
		return "The color of this vegetable is Pink";
		}
	}

class Onion extends Vegetables{
	public Onion() {
		super("Onion");
		
	}
		
	//No Vegetable Color
	}

public class School {
	
public static void main(String[] args) {
	
	for(int i=1;i<11;i++) {
		
		Vegetables vegetable=RandomVegetable();
		System.out.println("Vegetable # is"+ i + ": "+ vegetable.getName() + "\n" + "Vegetablecolor:"+ vegetable.Vegetablecolor() + "\n" );
		
		
	}
	
}

public static Vegetables RandomVegetable() {
	
	int randomnumber =(int) (Math.random()*5)+1;
	System.out.println("Random number generated was:"+ randomnumber);
	switch(randomnumber) {
	case 1:
		return new Tomato();
		
	case 2:
		return new Brinjal();	
		
	case 3:
		return new Carrot();
		
	case 4:
		return new Beetoot();	
		
	case 5:
		return new Onion();				
	
	}
	return null;
}

}

