package kodlamaIo;

public class Instructor extends User {

	private int classNumber;
	private int studentNumber;
	public Instructor(int id, String firstName, String lastName, String password, String email) {
		super(id, firstName, lastName, password, email);
		
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

}
