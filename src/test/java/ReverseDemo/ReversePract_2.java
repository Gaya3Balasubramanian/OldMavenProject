package ReverseDemo;

import java.util.Scanner;

public class ReversePract_2 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a valid string value");
		String original= scan.nextLine();
		scan.close();
		
		ReversePract_2 rev= new ReversePract_2();
		String rev1= rev.reverse(original);
		System.out.println(rev1);
		
		
	 

	}
	
	private String reverse(String input) {
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--) {
			reverse= reverse+input.charAt(i);
		}
		return reverse;
		
}

	
}