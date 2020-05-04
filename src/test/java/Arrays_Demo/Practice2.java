package Arrays_Demo;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
	
private static Scanner scan = new Scanner(System.in);

public static void main(String[] args) {
	
	int[] myintegers= getintegers(5);
	


}

public static  int[] getintegers(int numbers) {
	int[] array = new int[numbers];
	for(int i=0;i<array.length;i++) {
		array[i]= scan.nextInt();
	}
	return array;
}


public static void PrintArray(int[] array ) {
	for(int i=0;i<array.length;i++) {
		System.out.println("Element"+ i + "contents"+ array[i]);
	}
}

public static int[] sortintegers(int[] array) {
	int[] sortedarray= Arrays.copyOf(array, array.length);
	 int temp=0;
	 
	 for(int i=0;i<sortedarray.length;i++) {
		 for(int j=i+1;i<sortedarray.length;j++) {
			 if(sortedarray[i]>sortedarray[j]) {
				 temp=sortedarray[i];
				 sortedarray[i]=sortedarray[j];
				 sortedarray[j]=temp;
				 
			 }
		 }
	 }
	return sortedarray;
}

}

