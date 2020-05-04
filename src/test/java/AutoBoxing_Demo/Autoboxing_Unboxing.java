package AutoBoxing_Demo;

import java.util.ArrayList;

public class Autoboxing_Unboxing {
	
	public static void main(String[] args) {
		
		/*What is Auto boxing?
		  The Arraylist is possible in String . And the string is having class on its own.
		  Wheareas integer is primitive it does not have class paranthesis like below().
		  So below mentioned thing is directly not possible in integers . This is where auto
		  boxing concepts coming in .Common thing is we need to pass the class in array list 
		  and it work 
		  
		  ArrayList<String> array=new ArrayList<String>(); Possible in String as it has class
		  ArrayList<int> array=new ArrayList<int>(); not possible for int 
		*/
		
		/*Auto Boxing :
		 Coversion of primitive type into Integer is called auto boxing. We are taking
		 primitive type and we are going to the object wrapper and we are going to the 
		 class thats called autoboxing 
		 ArrayList <Integer> intArraylist=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			intArraylist.add(Integer.valueOf(i));
		}
		 
		*/
		ArrayList <Integer> intArraylist=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			intArraylist.add(Integer.valueOf(i));
			System.out.println(intArraylist);
		
			ArrayList<Integer> intarray= new ArrayList<Integer>();
			intarray.add(12);
			
		}
		
		
		/*Unboxing :
		 Conversion of integer to primitive type.Unboxing is where we are taking it
		 from the class or from the object wrapper and converting it back to a primitive
		 type
		for (int i=0;i<10;i++) {
			System.out.println(i + " --->" + intArraylist.get(i).intValue() );
		}
		}
		 
		*/
		for (int i=0;i<10;i++) {
			System.out.println(i + " --->" + intArraylist.get(i).intValue() );
		}
		
	}
	

	Integer myintvalue=56;
	int myint=myintvalue.intValue();//we can user integer class to primitive in the same using
	//intvalue functionality
	
	
	/* Java will allow above mentioned thing. Because during compile time the code will be
	   like below
	   //Integer.valueOf(56);
	 */
	
	
	

}

class intclass{
	
/*	To use Array list we can create class like this and constructors , getters and
     setters like this to achieve above things. However this is little bit messy 
     we need use  constructors , getters and setters to make use of Array list . we 
     have another short cut method to use array list for integers
	*/
	
	/*What is wrapper?
	  For example in this class we have private intvalue and this is wrapped up under
	  class the inclass. And it cant be accessed as such . we have constructors and we 
	  have getters and setters to set and retrieve the value .
	 
	*/
	
	
	 private int intvalue;
	 
	public  intclass(int intvalue) {
		this.intvalue=intvalue;
	}
	
	public void setIntvalue(int intvalue) {
		this.intvalue = intvalue;
	}

	public int getIntvalue() {
		return intvalue;
	}
	
	public static void main(String[] args) {
	ArrayList<intclass> Intclassarraylist=new ArrayList<intclass>(); 
	Intclassarraylist.add(new intclass(54));
	System.out.println(Intclassarraylist);
	}	
}
