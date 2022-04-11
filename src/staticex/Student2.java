package staticex;

public class Student2 {
	private static int serialNum = 1000;
	private int cardNum;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
		cardNum = serialNum + 100;
	}
	
	public int getCardNum() {
		return cardNum;
	}




	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getSerialNum() {
//		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
	
	
	
}
