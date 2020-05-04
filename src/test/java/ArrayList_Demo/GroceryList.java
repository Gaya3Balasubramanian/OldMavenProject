package ArrayList_Demo;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> GroceryList =new ArrayList<String>();
	
	public void AddGroceryItem(String item ) {
		GroceryList.add(item);
		
	}
	
	public void PrintGroceryList() {
		System.out.println("You have "+ GroceryList.size() +"Items in your grocery List" );
		for(int i=0;i<GroceryList.size();i++) {
			System.out.println((i+1) + ". " + GroceryList.get(i));
		}
	}
	
	public void ModifyGroceryItem(int Position,String newitem) {
		GroceryList.set(Position, newitem);
		System.out.println("Grocery Item" + (Position+1) + "has been modified");
		
	}
	
	public void RemoveGroceryItem(int Position) {
		String Ritem=GroceryList.get(Position);
		GroceryList.remove(Position);
		
	}
	
	public void  findItem(String SearchItem) {
		if(GroceryList.contains(SearchItem)){
		System.out.println("Search Item is Placed in the list ");
	}
		else {
			System.out.println("Search Item is not Placed in the list");
		}
		
	
	}
		


}