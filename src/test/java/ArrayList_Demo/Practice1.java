package ArrayList_Demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practice1 {
	
	public static void main(String[] args) {
		
	ArrayList<String> places= new 	ArrayList<String>();	

	
	}
	
	public static void PrintArrayList(ArrayList<String> places) {
		Iterator i=places.iterator();
		while(i.hasNext()) {
			System.out.println("Now Visiting " + i.next());
		}
		
		System.out.println("*************");
	
	}
	
	
	public static boolean addinorder(ArrayList<String> places, String newplace) {
		ListIterator<String> Stringlistiterator= places.listIterator();
		while(Stringlistiterator.hasNext()) {
			int comarison= Stringlistiterator.next().compareTo(newplace);
			if(comarison==0) {
				System.out.println("New place is already in the destination place");
			}else if(comarison>0) {
				Stringlistiterator.previous();
				Stringlistiterator.add(newplace);
				return true;
			}else if(comarison<0) {
				
			}
		}
		Stringlistiterator.add(newplace);
		return true;
	}
	
}
	
		
	
		
		
	
	





