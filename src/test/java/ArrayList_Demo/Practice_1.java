package ArrayList_Demo;

import java.util.ArrayList;

public class Practice_1 {
	
	
	private ArrayList<String> fruits= new ArrayList<String>();
	
	
 public void Addfruitslist(String item) {
	 fruits.add(item);
	 
 }
   
 public void PrintFruitslistsize () {
	System.out.println("You have" + fruits.size()+ "Items in your fruits List"); 
	for(int i=0;i<fruits.size();i++) {
		System.out.println((i+1) + ". " + fruits.get(i));
	}

}
 
 
public void modifyfruitslist(int position, String newItem) {
	fruits.set(position, newItem);
	System.out.println("Fruits Item"+ position+1 + "has been modified");
}


public void Removefruitslist(int position) {
	fruits.get(position);
	fruits.remove(position);

}

public void Searchfruitlist(String SearchItem) {
	if(fruits.contains(SearchItem)) {
		System.out.println("Fruit available in the search list");
	}else {
		System.out.println("Fruit not available in the search list");
	}
	
}

}
