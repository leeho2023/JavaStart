package object;

class Student{
	
	int stdID;
	String stdName;
	
	public Student(int stdID, String stdName) {
		this.stdID = stdID;
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + "]";
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {

//		int a = Integer.parseInt("30");
		
		
//		String javaStr = new String("Java");
//		System.out.println("첫 번째 javaStr 문자열의 주소값 : " + System.identityHashCode(javaStr));
//		
//		StringBuilder buffer = new StringBuilder(javaStr);
//		System.out.println("연산 전 buffer 메모리 주소 : " + System.identityHashCode(buffer));
//		
//		buffer.append(" and");
//		buffer.append(" Android");
//		buffer.append(" programming id fun!!!");
//		System.out.println("연산 후 buffer 메모리 주소 : " + System.identityHashCode(buffer));
//		
//		System.out.println(buffer);
//		
//		javaStr = buffer.toString();
//		System.out.println(javaStr);
//		System.out.println("새로 만들어진 javaStr 문자열 주소 : " + System.identityHashCode(javaStr));

		
//		System.out.println(javaStr);
//		System.out.println("첫 번째 javaStr 문자열의 주소값 : " + System.identityHashCode(javaStr));
//		
//		javaStr = javaStr.concat(androidStr);
//		System.out.println("두 번째 javaStr 문자열의 주소값 : " + System.identityHashCode(javaStr));
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1.equals(str2));
		
		
//		Integer i1 = new Integer(123);
//		Integer i2 = new Integer(123);
//		
//		System.out.println(i1 == i2);
//		System.out.println(i1.equals(i2));
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
		
//		Student studentLee = new Student(100, "이상원");
//		Student studentLee2 = studentLee;
//		Student studentSang = new Student(100, "이상원");
//		
//		if(studentLee == studentLee2) {
//			System.out.println("==기호를 사용하여 비교");
//			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
//		}else {
//			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
//		}
//		
//		if(studentLee == studentSang) {
//			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
//		}else {
//			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
//		}
//		
//		if(studentLee.equals(studentLee2)) {
//			System.out.println("equals() 를 사용하여 비교");
//			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
//		}else {
//			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
//		}
//		
//		if(studentLee.equals(studentSang)) {
//			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
//		}else {
//			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
//		}
		
		
	}

}
