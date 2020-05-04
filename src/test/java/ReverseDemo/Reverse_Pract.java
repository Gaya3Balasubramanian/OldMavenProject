package ReverseDemo;

public class Reverse_Pract {

	public static void main(String[] args) {
		
      String input="My Name is Gayathri";
      String output=reverse(input);
      System.out.println(output);
	}
	
	public static String reverse(String input) {
		String reverse="";
		
		String[] original= input.split("\\s+");
		for(String item:original) {
			reverse= item +" "+ reverse;
		}
		return reverse;
		
		
	}
	
	
}
