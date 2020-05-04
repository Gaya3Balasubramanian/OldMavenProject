package ArrayList_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Practice9 {

	public static void main(String[] args) {
		ArrayList<String> places= new ArrayList<String>();
		addinorder(places,"Mumbai");
		addinorder(places,"Bangalore");
		addinorder(places,"Calicut");
		PrintArray(places);
		System.out.println("********");
		modifycity(places,0,"Kerala");
		PrintArray(places);
		System.out.println("********");
		RemoveCity(places,0);
		PrintArray(places);
		System.out.println("********");
	}
	
	public static void PrintArray(ArrayList<String> places) {
		Iterator i=places.iterator();
		while(i.hasNext()) {
			System.out.println("Now Visiting" + i.next());
		}
	}
	
	public static boolean addinorder(ArrayList<String> places, String newplace) {
		ListIterator<String> Stringlistitertaor= places.listIterator();
		while(Stringlistitertaor.hasNext()) {
			int comparison= Stringlistitertaor.next().compareTo(newplace);
			if(comparison==0) {
				System.out.println("New place is already in the destination place");
			}else if(comparison>0) {
				Stringlistitertaor.previous();
				Stringlistitertaor.add(newplace);
				return true;
			}else if(comparison<0) {
				 
			 }
		}
		Stringlistitertaor.add(newplace);
		return true;
		
	}
	
	public static void modifycity(ArrayList<String> places,int position, String place) {
		places.set(position,place);
		System.out.println("City" + position+1 + "has been modified ");
	}
	
	public static void RemoveCity(ArrayList<String> places,int position) {
		places.remove(position);
		System.out.println("City" + position+1 + "has been removed ");
	}

}
