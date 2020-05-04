package ArrayList_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practice10 {

	public static void main(String[] args) {
		LinkedList<String> places= new LinkedList<String>();
		sortinteger(places,"Kerala");
		sortinteger(places,"Bangalore");
		sortinteger(places,"Coimbatore");
		PrintArray(places);
		modifyplace(places,0,"Cochin");
		PrintArray(places);
		RemoveCity(places,0);
		PrintArray(places);
	}
	
	public static void PrintArray(LinkedList<String> places) {
		Iterator m= places.iterator();
		while(m.hasNext()) {
			System.out.println("Now Visiting" + m.next());
		}
	}
	
	public static boolean sortinteger(LinkedList<String> places, String newplace) {
		ListIterator<String> Stringlist=places.listIterator();
		while(Stringlist.hasNext()) {
			int comparison= Stringlist.next().compareTo(newplace);
			if(comparison==0) {
				System.out.println("Already visited the place");
			}else if(comparison>0) {
				Stringlist.previous();
				Stringlist.add(newplace);
				return true;
				
			}else if(comparison<0) {
				
			}
		}
		Stringlist.add(newplace);
		return true;
	}

	public static void modifyplace(LinkedList<String> places, int position, String newplace) {
		places.set(position, newplace);
		System.out.println("City" + position + "has been modified ");
	}
	
	public static void RemoveCity(LinkedList<String> places,int position) {
		places.remove(position);
		System.out.println("City" + position + "has been removed ");
	}
}
