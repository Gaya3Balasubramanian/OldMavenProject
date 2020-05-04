package ArrayList_Demo;

public class Practice13 {

	public static void main(String[] args) {
		
		String input="Gayathri";
		
		Practice13 prac= new Practice13();
		String s= prac.reverse(input);
		System.out.println(s);
		
	
	}
	
	public String reverse(String input) {
		String reverse="";
		
		for(int i=input.length()-1; i>=0;i--) {
			reverse = reverse + input.charAt(i);
		}
		return reverse;
	}
	

}
