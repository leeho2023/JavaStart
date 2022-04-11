package arraylist;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	ArrayList<SubjectList> subjectList;
		
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjectList = new ArrayList<SubjectList>();
	} 
	
	public void addSubject(String subjectName, int subjectScore) {
		SubjectList subject = new SubjectList();
		subject.setSubjectName(subjectName);
		subject.setSubjectScore(subjectScore);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(SubjectList list : subjectList) {
			total = total + list.getSubjectScore();
			System.out.print("학생 " + studentName + "의 " + list.getSubjectName() + "과목 성적은");
			System.out.println(list.getSubjectScore() + "점 입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
		
	}
	
	
}
