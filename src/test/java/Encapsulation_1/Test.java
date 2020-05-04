package Encapsulation_1;

public class Test {
	
	private School school;
	
	/*What is encapsulation
	Encapsulation is nothing but data hiding. In other words, fields which we are using in that
	particular class will not be able to view by another class. Also we can change the field 
	names however this will not affect the code .
	*/

	
	public static void main(String[] args) {
		School school= new School(12,12);
		System.out.println(school.NOofTeachers());
		System.out.println(school.NoofStudents());
		
	}
	

}
