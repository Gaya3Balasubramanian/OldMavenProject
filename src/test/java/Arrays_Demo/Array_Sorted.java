package Arrays_Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sorted {
	
	private static Scanner Scan= new Scanner(System.in);
	

	public static void main(String[] args) {
		int[] myintegers = getintegers(5);
		int[] sort=SortIntegers(myintegers);
	    printArray(sort);
	}
	
	public static int[] getintegers(int numbers) {
		int[] array= new int [numbers];
		for(int i=0;i<array.length;i++) {
			array[i]=Scan.nextInt();
		}
		return array;
	}
	
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Element"+ i + "contents"+ array[i]);
		}
	}
	
	//to copy one method use following method 
	public static int[] SortIntegers(int[] array) {
		/*int[] Sortedarray=new int[array.length];
		for(int i=0;i<array.length;i++) {
			Sortedarray[i]=array[i];
		}*/
		
		int[] Sortedarray=Arrays.copyOf(array, array.length);
		boolean flag=true;
		int temp;
		while(flag) {
			flag=false;
			for(int i=0;i<Sortedarray.length-1;i++) {
				if(Sortedarray[i]<Sortedarray[i+1]) {
					temp=Sortedarray[i];
					Sortedarray[i]=Sortedarray[i+1];
					Sortedarray[i+1]=temp;
					flag=true;
				}
			}
		}
		return Sortedarray;
	}

}
