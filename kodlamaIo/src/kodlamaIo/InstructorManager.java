package kodlamaIo;

public class InstructorManager extends UserManager {
	
	public void homework(User user) {
		System.out.println(user.firstName +" "+user.lastName+" tarafýndan ödev verildi!");
	}
	
	public void course(User user) {
		System.out.println(user.firstName +" "+user.lastName+" tarafýndan yeni kurs eklendi !");
	}
}
