package ArrayList_Demo;

import java.util.Scanner;

public class Main1 {
	
	private static Scanner scan=new Scanner(System.in);
	private static GroceryList grocerylist=new GroceryList();
	
	
	public static void main(String[] args) {
		boolean quit=false;
		int choice=0;
		PrintInstruction();
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice=scan.nextInt();
			scan.nextLine();
					
			switch(choice) {
			case 0:
				PrintInstruction();
				break;
			case 1:	
				grocerylist.PrintGroceryList();
				break;
			case 2:	
			    addItem();
			    break;
			case 3:	
			    modifyItem();
			    break;
			case 4:	
			    RemoveItem();
			    break;
			case 5:	
			    searchforItem();
			    break;  
			case 6:	
			    searchforItem();
			    break;        
			case 7:	
			    quit=true;
			    break;   
			    
				
			}
			
			
		}
		
		
		
		
	}
	

	private static void PrintInstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 0- To Print the Choice Options.");
		System.out.println("\t 1- To Print the list  of the fruits items.");
		System.out.println("\t 2- To add an item to the list.");
		System.out.println("\t 3- To Modify an item in the list.");
		System.out.println("\t 4- To Remove an item from the list.");
		System.out.println("\t 5- To search an item in the list.");
		System.out.println("\t 7- To quit the application.");
		
	}



















	public static void addItem() {
		System.out.println("Please enter the grocery item: ");
		grocerylist.AddGroceryItem(scan.nextLine());
	}
	
	public static void modifyItem() {
		System.out.println("Enter the item number ");
		int itemNO=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the replacement item: ");
		String newItem=scan.nextLine();
		grocerylist.ModifyGroceryItem(itemNO-1, newItem);
		
	}
	
	
	public static void RemoveItem() {
		System.out.println("Enter the item number: ");
		int itemNO=scan.nextInt();
		scan.nextLine();
		grocerylist.RemoveGroceryItem(itemNO);
		
		
	}
	
	
	public static void searchforItem() {
		System.out.println("Item to search for : ");
		String SearchItem=scan.nextLine();
		grocerylist.findItem(SearchItem);

		
		
	}
	

	
	

}
