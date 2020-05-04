package Arrays_Demo;

import java.util.Arrays;

public class Practice3 {
	
	public static void main(String[] args) {
		
		int[] myintegers=getintegers();
		int[] sorted= sortintegers(myintegers);
		Printarray(sorted);
		

}
	
	public static int[]  getintegers() {
		int[] myarray= {100,56,86,46,76};
		return myarray;
	}
	
	public static void Printarray(int[] myarray ) {
		for(int i=0;i<myarray.length;i++) {
			System.out.println("Element " + i + "Contents " + myarray[i] );
		}
	}
	
	public static int[] sortintegers(int[] myarray) {
		int[] sortedarray=Arrays.copyOf(myarray, myarray.length);
		
		int temp=0;
		
		for(int i=0;i<sortedarray.length;i++) {
			for(int j=i+1;j<sortedarray.length;j++) {
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


