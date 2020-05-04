package Arrays_Demo;

import java.util.Scanner;

public class Practice {
	
private static Scanner scan= new Scanner(System.in)	;

	
public static void main(String[] args) {
	
	int[] myintegers= getintegers(5);
	int[] sort=Sortintegers(myintegers);
	PrintArray(sort);


}

public static int[] getintegers(int numbers) {
	
	int[] array = new int[numbers];
	for(int i=0; i<array.length;i++) {
		array[i]=scan.nextInt();
	}
	return array;
	
}

public static void PrintArray(int[] array) {
	
	for (int i=0; i<array.length;i++) {
		System.out.println("Element"+ i + "contents"+ array[i]);
	}
	
}


public static int[] Sortintegers(int[] array) {
	int[] SortedArray= new int[array.length];
	for(int i=0; i<array.length;i++) {
		SortedArray[i]=array[i];
	}
	int temp=0;
	for (int i=0;i<SortedArray.length;i++) {
		for(int j=i+1;j<SortedArray.length;j++) {
			if(SortedArray[i]<SortedArray[j]) {
				temp=SortedArray[i];
				SortedArray[i]=SortedArray[j];
				SortedArray[j]=temp;
			}
		}
	}
	return SortedArray;
		
	
	
}


}
