package LinkedTest_Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void Printarray(LinkedList<String> linkedlist) {
		Iterator<String> i= linkedlist.iterator();
		while(i.hasNext()) {
			System.out.println("Now Visiting" + i.next());
		}
	}
	
	private static boolean addinorder(LinkedList<String> linkedlist, String Newcity) {
		ListIterator<String> stringlistiterator=linkedlist.listIterator();
		while(stringlistiterator.hasNext()) {
			int comparison=stringlistiterator.next().compareTo(Newcity);
			if(comparison==0) {
				System.out.println(Newcity +"has been already added");
			}
			else if(comparison>0) {
				stringlistiterator.previous();
				stringlistiterator.add(Newcity);
				return true;
			}else if(comparison<0) {
				
			}
		}
		stringlistiterator.add(Newcity);
		return true;
	}
	
	public static void Modifycity(LinkedList<String> linkedlist,int position, String newCity) {
		linkedlist.set(position, newCity);
		System.out.println(" New City " + position+1 +"has been added" );
	}

	public static void RemoveCity(LinkedList<String> linkedlist,int position) {
		linkedlist.remove(position);
		
	}
}
