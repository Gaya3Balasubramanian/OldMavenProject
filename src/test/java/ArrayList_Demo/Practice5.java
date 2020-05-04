package ArrayList_Demo;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.ListIterator;

public class Practice5 {

	public static void main(String[] args) {
	ArrayList<String> places= new ArrayList<String> ();
	addinorder(places, "Mumbai");
	addinorder(places, "Bangalore");
	addinorder(places, "Cochin");
	Printlist(places);
	System.out.println("********");
	modifycity(places, 0, "Kerala");
	Printlist(places);
	System.out.println("********");
	Removecity(places, 0);
	Printlist(places);
	

	}
	
	private static void Printlist(ArrayList<String> arraylist) {
		Iterator<String> i= arraylist.iterator();
		while(i.hasNext()) {
			System.out.println("Now Visiting " + i.next());
		}
	}
	
	
	private static boolean addinorder(ArrayList<String> arraylist, String newcity) {
		ListIterator<String> Stringlistiterator=arraylist.listIterator();
		while(Stringlistiterator.hasNext()) {
			int comparison= Stringlistiterator.next().compareTo(newcity);
			if(comparison==0) {
				System.out.println(newcity +"is already included as a destination");
				
				
			}
			else if(comparison>0) {
				Stringlistiterator.previous();
				Stringlistiterator.add(newcity);
				return true;
			}
          else if(comparison < 0) {
			
		}
			
			
		}
		Stringlistiterator.add(newcity);
		return true;
	}
	
	public static void modifycity(ArrayList<String> arraylist, int position, String newcity) {
		arraylist.set(position, newcity);
		System.out.println("City" + position+1 + "has been modified ");
	}
	
	public static void Removecity(ArrayList<String> arraylist, int position) {
		arraylist.remove(position);
		System.out.println("City" + position+1 + "has been removed ");
	}

}
