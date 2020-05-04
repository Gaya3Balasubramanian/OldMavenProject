package ArrayList_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practice3 {

	public static void main(String[] args) {
		ArrayList<String>places= new ArrayList<String>();
	}
	
	
	public static void PrintArraylist(ArrayList<String> places) {
		Iterator i=places.iterator();
		while(i.hasNext()) {
			System.out.println("Now Visiting " + i.next());
		}
	}
	
	public static boolean addinorder(ArrayList<String> places, String newplace) {
		 ListIterator<String> Stringlist= places.listIterator();
		 while(Stringlist.hasNext()) {
			 int comparison= Stringlist.next().compareTo(newplace);
			 if(comparison==0) {
				 System.out.println("New place is already in the destination place");
			 }
			 else if(comparison>0) {
				 Stringlist.previous();
				 Stringlist.add(newplace);
				 return true;
			 }
			 else if(comparison<0) {
				 
			 }
		 }
		 Stringlist.add(newplace);
		return true;
	}

}
