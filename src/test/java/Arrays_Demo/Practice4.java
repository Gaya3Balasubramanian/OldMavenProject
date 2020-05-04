package Arrays_Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
	
	private static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] myintegers = getintegers(5);
		int[] sorted= sortintegers(myintegers);
		PrintArray(sorted);
		
	}
	
	public static int[] getintegers(int number) {
		int[] array= new int[number];
		for(int i=0;i<array.length;i++) {
			array[i]= scan.nextInt();
		}
		return array;
	}
	
	
	public static void PrintArray(int[] array) {
		for(int i=0;i< array.length;i++) {
			System.out.println("Element" + i + "Content is "  + array[i]);
		}
	}
	
	public static int[] sortintegers(int[] array) {
		int[] sortedarray= Arrays.copyOf(array, array.length);
		int temp=0;
		for(int i=0;i<sortedarray.length;i++) {
			for(int j=i+1;j<sortedarray.length;j++) {
				if(sortedarray[i]<sortedarray[j]) {
					temp=sortedarray[i];
					sortedarray[i]=sortedarray[j];
					sortedarray[j]= temp;
				}
			}
		}
		return sortedarray;
	}
}