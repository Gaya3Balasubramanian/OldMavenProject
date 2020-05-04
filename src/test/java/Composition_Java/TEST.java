package Composition_Java;

public class TEST {

	public static void main(String[] args) {
		
		/*Composition:
		  If we use inheritance, we will be able to extend only one class.
		  However if we use composition we will be able to use many class at a time.
		  
		*/
		
		
		KhoKho kho= new KhoKho("Gayathri","Kaarthik");
		System.out.println( kho.getMalePlayer());
		System.out.println(  kho.getFemalePlayer());
	   
		
		
		Ath1 ath1 =new Ath1(12,12);
		System.out.println( ath1.getMaleheight());
		System.out.println(  ath1.getFemaleHeight());
		
		
		
		Athletics athletics =new Athletics("Rajeshwari","Mani",ath1);
		System.out.println(athletics.getMaleAthlete());
		System.out.println(athletics.getFemaleAthlete());
		athletics.getAth1(12);
		
	
		
		Sports sports=new Sports(kho,athletics);
		sports.getKhokho().previouschampions(1);
		sports.getAthletics().getFemaleAthlete();
		
	}
}
