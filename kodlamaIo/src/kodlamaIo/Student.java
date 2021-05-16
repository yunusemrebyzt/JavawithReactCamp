package kodlamaIo;

public class Student extends User {

	private String university;
	private double gpa;
	
	public Student(int id, String firstName, String lastName, String password, String email) {
		super(id, firstName, lastName, password, email);
		
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
