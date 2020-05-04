package ArrayList_Demo;

public class Practice12 {

	public static void main(String[] args) {
		String input="Gayathri is a good gal";
		String output= reverse(input);
		System.out.println(output);
	}
	
	public static String reverse(String input) {
		String reverse="";
		
		String[] rev= input.split("\\s");
		for(String item:rev) {
			reverse= item + " "+ reverse;
		}
		return reverse;
	}
	
	

}
