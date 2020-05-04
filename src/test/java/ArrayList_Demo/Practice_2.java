package ArrayList_Demo;

import java.util.Scanner;

public class Practice_2 {
	
	private static Scanner scan= new Scanner(System.in);
	private static Practice_1 fruit= new Practice_1();
	
 public static void main(String[] args) {
	 boolean quit = false;
	 int choice =0;
	 PrintInstruction();
	 while(!quit) {
		 System.out.println("Enter your choice");
		 
	 }
 }
 
 
 public static void PrintInstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 0- To Print the Choice Options.");
		System.out.println("\t 1- To Print the list  of the fruits items.");
		System.out.println("\t 2- To add an item to the list.");
		System.out.println("\t 3- To Modify an item in the list.");
		System.out.println("\t 4- To Remove an item from the list.");
		System.out.println("\t 5- To search an item in the list.");
		System.out.println("\t 7- To quit the application.");
		
	}

}
