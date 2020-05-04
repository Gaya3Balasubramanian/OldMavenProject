package Encapsulation_1;

public class School {
	
	private int teacher;
	private int NoofStudents;
	
	public School(int teachers,int students) {
		this.teacher=teachers;
		this.NoofStudents=students;
	}

	public int NOofTeachers() {
		return teacher;
	}

	public int NoofStudents() {
		return NoofStudents;
	}

}
