package Collections_Demo;

import static org.testng.Assert.assertEquals;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

public abstract class collection_Collections_Set_List {
	
	
	public static void main(String[] args) {
		
	ArrayList l= new ArrayList();
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof Cloneable);
	System.out.println(l instanceof RandomAccess);
	l.add("a");
	l.add(11);
	l.add(null);
	l.add("a");
	System.out.println(l);
	l.remove(3);
	l.add(3, "f");
	System.out.println(l);
	LinkedList l1= new LinkedList();
	System.out.println(l1 instanceof Serializable);
	System.out.println(l1 instanceof Cloneable);
	System.out.println(l1 instanceof RandomAccess);
	
		
		
	}
	
	public static void SynchronizedList(List l) {
		List l1=Collections.synchronizedList(l);
		
		//L is nonsynchronizer
		//L1 is synchronizer
		
	}
	
	public static void SynchronizedList(Set  s) {
		Set l2= Collections.synchronizedSet(s);
	}
	
	public static void SynchronizedList(Map  m) {
		Map l3= Collections.synchronizedMap(m);
	}
	
	/*Collection methods
	 boolean add(Object o);
	 boolean addall(Collection c);
	boolean remove(Object o);
	 boolean removeall(Collection c);
	  boolean reatinall(Collection c);
	  void clear();
	  boolean contains(Object o);
	   boolean contains(Collection c);
	   boolean isEmpty();
	   int size();
	   Object[] toArray();
	   Iterator iterator();


	*/
	 /*Collection(I):
	   1. If we want to represent a group of individual objects has a single entity
		then we should go for collection.
	   2.Collection interface defines most common methods which are applicable for 
	     any collection object	
	   
	     Note: There is not concrete class which implements collection interface directly
	     
	   List(I)
	   
	   1.List is child interface of collection
	   2.If we want to represent a group of individual objects has a single entity
		 where duplicates are allowed and insertion order must be preserved then we should
		 go for list.
	   3.We can preserve insertion via index and we can differentiate duplicate objects
	     by using index.Hence index will play very important role in list.
	   4.List interface defines the following specific methods  
	     	 
		
	  List can be classified into 4 types:(Implementation types)
	  
	  ArrayList:
	  1.The underlying data structure is resizable array or growable array
	  2.Duplicates are allowed
	  3.Insertion order is preserved
	  4.Heterogeneous objects are allowed(Except treeset and treemap not allowed)
	  5.Null insertion is allowed.
	  
	  Constructor1:
	  ArrayList l= new ArrayList();
	  that creates an empty array list object with default initial capacity 10.
	  Once array list reaches its maximum capacity then a new array list object
	  will be created with new capcity = currentcapcity*3/2+1
	  
	  Constructor2:
	  Arraylist l= new ArrayList(int initialcapcaity );
	  that creates an empty array list object with specified initial capacity
	  
	  Constructor3:
	    Arraylist l= new ArrayList(Collection c );
	    creates equivalent array list object for the given collection
	  
	  Usually we use collection to hold and transfer object from one location to 
	  another location. To provide support for this requirement every collection
	  class by default implements serializable and clonable interfaces
	  
	  Arraylist and vector classes implements random access interface so that any 
	  random element we can access with the same speed
	  
	  Random Access:
	  Random access interface present in java.util package. And it does not contains
	  any methods. It is a marker interface where required utility will be provided
	  automatically by the jvm.
	  
	  ArrayList advantage:
	  If ever frequent operation is retrieval operation(Because array list implements RA interface)
	  
	  ArrayList Disadvantage:
	  If ever frequent operation is insertion or deletion in a middle
	  
	  By Default ArrayList is non synchroniser. But we can get synchroniser version of
	  arraylist object by using synchronisedlist() method of collections class. 
	  
	  Similarly we can get synchronised version of set and map objects by using the 
	  following methods of collections class.
	 
	
*/
	
	abstract void add(int index, Object o);
	abstract boolean addall(int index, Collection c);
	abstract Object get(int index);
	abstract Object remove (int index);
	abstract Object set (int index, Object newl);
	abstract int indexof(Object o);
	abstract int lastindexof(Object o);
	abstract  ListIterator listiterator();
	//39:17
	
	
}
