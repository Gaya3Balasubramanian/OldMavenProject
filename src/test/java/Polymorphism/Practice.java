package Polymorphism;

class Fruits {
	private String name;

	public Fruits(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public String FruitColour() {
		return "No colour for this fruit";
	}

}

class Grapes extends Fruits {

	public Grapes() {
		super("Grapes");
	}

	public String FruitColour() {
		return "Colour of  this fruit is Greeen";
	}

}

class Apple extends Fruits {

	public Apple() {
		super("Apple");
	}

	public String FruitColour() {
		return "Colour of  this fruit is Red";
	}

}

class Mango extends Fruits {

	public Mango() {
		super("Mango");
	}

	public String FruitColour() {
		return "Colour of  this fruit is Yellow";
	}

}

class Watermelon extends Fruits {

	public Watermelon() {
		super("Watermelon");
	}

	public String FruitColour() {
		return "Colour of  this fruit is Pink";
	}

}

class Pineapple extends Fruits {

	public Pineapple() {
		super("Pineapple");
	}

	public String FruitColour() {
		return "Colour of  this fruit is grey";
	}

}

class Pome extends Fruits {

	public Pome() {
		super("Pome");
	}

}


public class Practice {
	
	public static void main(String[] args) {
		for(int i=1;i<12;i++) {
			Fruits fruits= randomfruits();
			System.out.println("fruits # is"+ i + ": "+ fruits.getName() + "\n" + "fruitcolor:"+ fruits.FruitColour() + "\n" );
			
		}
		
		
		
	}
	
	public static Fruits randomfruits() {
		
		int randomnumber =(int) (Math.random()*6)+1;
		System.out.println("Random number generated was:"+ randomnumber);
		switch(randomnumber) {
		case 1:
			return new Grapes();
			
		case 2:
			return new Apple();	
			
		case 3:
			return new Mango();
			
		case 4:
			return new Watermelon();	
			
		case 5:
			return new Pineapple();	
		
		case 6:
			return new Pome();		
		
		}
		return null;
		}
	}




