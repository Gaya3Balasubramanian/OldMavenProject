package LinkedTest_Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main_Demo {
	
	LinkedList<String> linkedlist;
public static void main(String[] main) {
	LinkedList<String> Placestovisit= new LinkedList<String>();
	addinOrder(Placestovisit, "Chennai");
	addinOrder(Placestovisit, "Trichy");
	addinOrder(Placestovisit, "Madurai");
	addinOrder(Placestovisit, "Ooty");
	addinOrder(Placestovisit, "salem");
	addinOrder(Placestovisit, "Kerala");
	addinOrder(Placestovisit, "Coimbatore");
	PrintList(Placestovisit);
	
	ModifyGroceryItem(Placestovisit, 2, "Cochin");
	PrintList(Placestovisit);
	
	
	RemoveGroceryItem(Placestovisit,2);
	PrintList(Placestovisit);
	
	
	
	
	
	
	
}

public static void PrintList(LinkedList<String> linkedlist) {
	Iterator<String> i= linkedlist.iterator();
	while(i.hasNext()) {
		System.out.println("Now Visiting " + i.next());
	}
	
	System.out.println("*************");
}

private static boolean addinOrder(LinkedList<String> linkedlist, String newCity) {
	ListIterator<String> stringlistiterator=  linkedlist.listIterator();
	while(stringlistiterator.hasNext()) {
		int comparison= stringlistiterator.next().compareTo(newCity);
		if(comparison ==0) {
			System.out.println(newCity + "is already included as a destination");
		}else if(comparison > 0) {
			stringlistiterator.previous();
			stringlistiterator.add(newCity);
			return true;
		}else if(comparison < 0) {
			
		}
	}
	stringlistiterator.add(newCity);
	return true;
}


public static void ModifyGroceryItem(LinkedList<String> linkedlist,int Position,String newitem) {
	linkedlist.set(Position, newitem);
	System.out.println("Grocery Item" + (Position+1) + "has been modified");
	
}

public static void RemoveGroceryItem(LinkedList<String> linkedlist,int Position) {
	String Ritem=linkedlist.get(Position);
	linkedlist.remove(Position);
	
}
 


}
