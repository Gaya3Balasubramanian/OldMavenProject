package Core_Java;

public class Inheritance2 extends Inheritance1{
	
	private int malephyteachers;
	private int Femalephyteachers;
	
	public Inheritance2() {
		this("default name",12,13,13);

		
	}

	public Inheritance2(String schoolname, int students,int malephyteachers,int Femalephyteachers  ) {
		super("Valluvar Gurukulam", 1000);
		
		
	}

	public int getMalephyteachers() {
		return malephyteachers;
	}

	public int getFemalephyteachers() {
		return Femalephyteachers;
	}

	@Override
	public void PhysicsTeachers(int PhyTeachers) {
		super.PhysicsTeachers(12);
		System.out.println(PhyTeachers);
		System.out.println("Total no of physics teachers");
	}

	@Override
	public int chemTeachers(int ChemistryTeachers) {
		return super.chemTeachers(ChemistryTeachers);
		
	}

	@Override
	public void NOofStudents(int NOofStudents) {
		// TODO Auto-generated method stub
		super.NOofStudents(NOofStudents);
	}
	
	


	



}
