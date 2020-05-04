package Arrays_Demo;

import java.util.Scanner;

public class Array_ToPrinttheKeyboardValue {
	
	private static Scanner scann=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		int[] myinteger=  getintegers(5);
		for(int i=0;i<myinteger.length;i++) {
			System.out.println("Element"+ i +"Typed values was"+myinteger[i] );
		}
	}
	
	public static int[] getintegers(int number) {
	System.out.println("Enter" + number + "Intger values.\r");	
    int[] values= new int [number];
    for (int i=0;i<values.length;i++) {
    	values[i]=scann.nextInt();
    }
	return values;
		
	}
	
}
	
	
		