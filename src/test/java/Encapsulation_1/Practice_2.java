package Encapsulation_1;

public class Practice_2 {
	
	private Practice1 pc;
	private Practice1 pc1;
	
public static void main(String[] args) {
	Practice1 pc= new Practice1(12,"Apple");
	System.out.println(pc.fruitname());
	System.out.println(pc.fruitnumber());
	Practice1 pc1= new Practice1(13,"Mango");
	System.out.println(pc1.fruitname());
	System.out.println(pc1.fruitnumber());
}

}
