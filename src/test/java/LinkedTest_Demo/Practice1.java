package LinkedTest_Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Practice1 {
	
	private Scanner scan= new Scanner(System.in);
	
public static void main(String[] args) {
	ArrayList<String> places= new ArrayList<String>();
	addinorder(places, "Chennai");
	addinorder(places, "Bangalore");
	PrintArray(places);
}

public static void PrintArray(ArrayList<String> places) {
	Iterator i= places.iterator();
	while(i.hasNext()) {
		System.out.println("Now Visiting " + i.next());
}	
}


public static boolean addinorder(ArrayList<String> places, String NewCity) {
	ListIterator<String> Stringlistiterator= places.listIterator();
	while(Stringlistiterator.hasNext()) {
		int comparison= Stringlistiterator.next().compareTo(NewCity);
		if(comparison==0) {
			System.out.println("Place already got added in the destination list");
		}else if(comparison>0) {
			Stringlistiterator.previous();
			Stringlistiterator.add(NewCity);
			return true;
			
		}else if(comparison<0){
			
		}
	}
	Stringlistiterator.add(NewCity);
	return true;
}
}


