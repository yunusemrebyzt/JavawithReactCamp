package kodlamaİo2;

public class InstructorManager extends UserManager {
	
	public void homework(User user) {
		System.out.println(user.firstName +" "+user.lastName+" tarafından ödev verildi!");
	}
	
	public void course(User user) {
		System.out.println(user.firstName +" "+user.lastName+" tarafından yeni kurs eklendi !");
	}
}
