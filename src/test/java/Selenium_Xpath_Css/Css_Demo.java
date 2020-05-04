package Selenium_Xpath_Css;

public class Css_Demo {
	
	public static void main(String[] args) {
		
		/*What is CSS
		  Cascading style sheets. Html give beauty to the web page .CSS provides styles to
		  the web page  
	  */
		
		/*1. Syntax
		     input[id='bmwradio'] 
		     input -Tag Name
		     id=Attribute 
		     value-bmwradio 
		     This is the common syntax which can be used for any attribute 
		    Note: Do not use double slash before tag name in Css
		  */
		
		/*2. Syntax
	       For ID attribute we can use # alone. We no need to follow the above mentioned
	       syntax
	       
	       #displayed-text
	  */
		
		/*3. Syntax
	       If we search using # and we are getting too many matching nodes . In that case
	       what we can do is we can just include the tag name that will reduce the matching 
	       nodes
	       
	       input#displayed-text
	  */
		
		/*4. Syntax
	       For Class attribute we can use . alone. We no need to follow the above mentioned
	       syntax
	       
	       .displayed-text
	       
	  */
		
		/*5. Syntax
	       If we search using . and we are getting too many matching nodes . In that case
	       what we can do is we can just include the tag name that will reduce the matching 
	       nodes
	       
	       input.displayed-text
	  */
		
		/*6. Syntax
	       We can append classes together until we get unique which means until we get
	       one matching node
	       
	       .inputs.displayed-class
	  */
		
		/*7. Syntax
	     Wild card search
	     
	    1. Starts with ^
	    
	      ^ represents starting text (charat symbol) and below is the syntax 
	     to use
	     input[class^='inputs'] tagname[attribute(symbol)=value]
	     
	     2. Ends with $
	    
	      $ represents ending text (dollar symbol) and below is the syntax 
	     to use
	     input[class$='displayed-class'] tagname[attribute(symbol)=value]
	     
	      3. Contains *
	    
	     *  represents available text (star symbol) and if the text is available in
	        the string it will fetch the result .below is the syntax  to use
	      input[class*='displayed'] tagname[attribute(symbol)=value]
	     
	     
	  */
		
		
		/*8. Syntax
	      To find children below is the syntex. Initially just used fieldset , for that
	      system showed 11 matching nodes. After using below mentioned syntex matching 
	      nodes reduced to 1
	       
	       Use > (RightArrow)
	       
	       Fieldset>table
	  */
	}

}
