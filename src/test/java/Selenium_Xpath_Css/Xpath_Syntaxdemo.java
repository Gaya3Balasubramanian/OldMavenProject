package Selenium_Xpath_Css;

public class Xpath_Syntaxdemo {
	
public static void main(String[] args) {
	
/*	1.Syntax
     This is the basic syntax for xpath . And this can be use for any attribute not
     only for ID
     //input[@id='name']
       tagname attribute value
	*/
	
	
	/*	2.Syntax using text 
	    Below mentioned syntex used to find using text 
    
      //div[@class='homepage-hero']//a[text()='Enroll now']
	*/
	
	
	/*	3.Syntax using contains 
    Below mentioned syntex used to find using contains . Also we find using text too 
    however if we have huge space in that case DOM cant find the matching node 
    Note: If we use contains , do not use =sign after attribute 
     
     /div[@id='navbar']//a[contains(text(),'Login')] 
     */
	
	
	/*	4.Syntax using more contains & and  
    Below mentioned syntex used to find using contains & and. 
    Note: If we use contains , do not use =sign after attribute 
     
     .//div[@id='navbar']//a[contains(@class,'navbar-link') and contains (@href,'/sign_in')] 
     */
	
	
	/*	5.Syntax using starts with keyword  
    Below mentioned syntex used to find using starts with keyword
    Note: As like contains we should not use =sign 
     
     .//div[@id='navbar']//a[starts-with(@class,'navbar-link')]
     */
	
	/*	6.Syntax to find parent , following and preceding sibling 
    
    1. Parent Sibling
    Xpath to some element 
    .//div[@href='/sign_in']//parent::li
    
    2. Preceding Sibling
    Xpath to some element 
    .//*[@href='/sign_in']//parent::li//preceding-sibling::li

    3. Following Sibling
    Xpath to some element 
    Note: If we too many following sibling we can use numbers like below. Its like an array
    but its not starts with 0 it starts with 1
    .//*[@href='/sign_in']//parent::li//preceding-sibling::li//following-sibling::li[1]
    
    
     */
}

}
