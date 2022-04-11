package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student3 st3 = new Student3();
		
		st3.studentID = 1001;
		st3.studentName = "sutak";
		st3.korean.subjectName = "국어";
		st3.korean.scorePoint = 90;
		st3.math.subjectName = "수학";
		st3.math.scorePoint = 100;
		
		System.out.println(st3.studentID);
		System.out.println(st3.studentName);
		System.out.println(st3.korean.subjectName);
		System.out.println(st3.korean.scorePoint);
		System.out.println(st3.math.subjectName);
		System.out.println(st3.math.scorePoint);
		
	}

}
