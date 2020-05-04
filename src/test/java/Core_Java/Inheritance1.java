package Core_Java;

public class Inheritance1 {
	
	private String schoolname;
	private int students;
	
	public Inheritance1(String schoolname, int students) {
		super();
		this.schoolname = schoolname;
		this.students = students;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public int getStudents() {
		return students;
	}
	
	public void PhysicsTeachers(int PhyTeachers) {
		System.out.println(PhyTeachers);
		chemTeachers(12);
		System.out.println("Total no of chemistry teachers");
	}
	
	public int chemTeachers(int ChemistryTeachers) {
		System.out.println(ChemistryTeachers);
		return ChemistryTeachers;
	}
	
	public void NOofStudents(int NOofStudents ) {
		System.out.println(NOofStudents);
	}

}
