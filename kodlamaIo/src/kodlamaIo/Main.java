package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		Instructor ınstructor = new Instructor(1,"Engin","Demiroğ","1234","engindemirog@asd.com");
		ınstructor.setClassNumber(3);
		ınstructor.setStudentNumber(4500);
		
		Student student = new Student(2,"Yunus Emre","Bayazıt","5678","yunusemre@asd.com");
		student.setGpa(3.14);
		student.setUniversity("Konya Teknik Üniversitesi");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.logIn(ınstructor);
		instructorManager.course(ınstructor);
		instructorManager.homework(ınstructor);
		userManager.logOut();

		userManager.logIn(student);
		studentManager.course();
		studentManager.homework();
		userManager.logOut();
		
		
		
		

	}

}
