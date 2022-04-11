package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student sutak = new Student(1001, "sutak");
		
		sutak.addSubject("국어", 100);
		sutak.addSubject("수학", 70);
		sutak.addSubject("영어", 98);
		
		Student xooos = new Student(1002, "xooos");
		
		xooos.addSubject("국어", 70);
		xooos.addSubject("수학", 80);
		xooos.addSubject("영어", 100);
		
		sutak.showStudentInfo();
		System.out.println("=======================================");
		xooos.showStudentInfo();
		
	}

}
