package ArrayList_Demo;

import java.util.Arrays;

public class Practice8 {
	
	public static void main(String[] args) {
		int[] myintegers= getinteger();
		int[] sort=sortinteger(myintegers);
		printarray(sort);
	
	}

	public static int[] getinteger() {
		int[] array= {10,100,50,60,20};
		return array;
		
}
	
	public static void printarray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println("Element" + i  + "Content is " + array[i]);
		}
	}
	
	public static int[] sortinteger(int[] array) {
		int[] sortarray= Arrays.copyOf(array, array.length);
		int temp=0;
		for(int i=0;i<sortarray.length;i++) {
			for(int j=i+1;j<sortarray.length;j++) {
				if(sortarray[i]<sortarray[j]) {
					temp=sortarray[i];
					sortarray[i]=sortarray[j];
					sortarray[j]=temp;
				}
			}
		}
		return sortarray;
	}
	
}
