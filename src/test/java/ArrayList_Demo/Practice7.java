package ArrayList_Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {
	
	private static Scanner Scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int[] myinteger= getinteger(5);
		int[] sort= sortintegers(myinteger);
		PrintArray(sort);
		
	}
	
	public static int[] getinteger(int number) {
		
		int[] array= new int[number];
		for(int i=0;i<array.length;i++) {
			array[i]= Scan.nextInt();
			
		}
		Scan.close();
		return array;
		
	}
	
	
	public static void PrintArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Element" + i  + "Contain values " + array[i]);
		}
		
	}
		
	
	public static int[] sortintegers(int[] array) {
		
		int[] sortedarray= Arrays.copyOf(array, array.length);
		int temp=0;
		
		for(int i=0;i<sortedarray.length;i++) {
			for(int j=i+1;j<sortedarray.length;j++) {
				if(sortedarray[i]<sortedarray[j]) {
					sortedarray[i]=temp;
					sortedarray[i]=sortedarray[j];
					sortedarray[j]=temp;
				}
			}
		}
		return sortedarray;
	}
		
	
	

}
