package chapter02;

//import java.util.Scanner;

public class Hello {
	
//	public static void sum(int a, int b) {
//		int result = a + b;
//		System.out.println(result);
//	}
//	
//	public static void mmm(String name, String sal) {
//		System.out.println("이름 :" + name + "나이 : " + sal);
//	}
//	
//	static int value3 = 10;
	
	public static void main(String[] args) {
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("vvv이름을 입려하vvv");
//		String name = in.next();
//		System.out.println("vvv나이를 입력하vvv");
//		String sal = in.next();
//		
//		mmm(name,sal);
//		
//		System.out.println("vvvv이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요vvvv");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		System.out.println("이름은 " + name + "입니다.");
//		String city = sc.next();
//		System.out.println("도시명은 " + city + "입니다.");
//		int age = sc.nextInt();
//		System.out.println("나이는 " + age + "살 입니다.");
//		double weight = sc.nextDouble();
//		System.out.println("몸무게는 " + weight + "Kg 입니다.");
//		boolean single = sc.nextBoolean();
//		System.out.println("독신 여부는 " + single + " 입니다.");
//
//		sc.close();
//		int test = 10;
//		System.out.println("소문자 변수명일때..." + test);
//		
//		int TEST = 20;
//		System.out.println("대문자 변수명일때..." + TEST);
//		
//		int Test = 30;
//		System.out.println("대소문자 변수명일때..." + Test);
//		
//		int 테스트 = 40;
//		System.out.println("한글 변수명일때..." + 테스트);
//		
//		int _test = 50;
//		System.out.println("특수문자(_) 변수명일때..." + _test);
//		
//		int $test = 60;
//		System.out.println("특수문자($) 변수명일때..." + $test);
//		
//		int test1 = 70;
//		System.out.println("문자+숫자 변수명일때..." + test1);
		
//		int 1test = 80;   숫자가 앞에 오면 안된다.
//		System.out.println("숫자+문자 변수명일때..." + 1test);
		
//		int static = 80;		예약어는 변수명으로 사용할 수 없다.(static, void, 등등)
//		System.out.println("예약어 변수명일때..." + static);
//		
//		int test = 50;
//		System.out.println("특수문자(_) 변수명일때..." + _test);
//		
//		final int TEST_NAME; // 상수는 항상 대문자!! 스네이크표기법
		
		// 메소드도 변수랑 똑같이
		
//		boolean aBcD;
//		byte 가나다;
//		char $abc;
//		double main;
//		String ABC; // all 대문자로는 상수만 권장사항
//		
//		final double PI = 3.14159265;
//		
//		int value1 = 3;
//		{
//			int value2 = 5;
//			System.out.println("value1의 값은..." + value1);
//			System.out.println("value2의 값은..." + value2);
//		}
//		System.out.println("밖에서 value1의 값은..." + value1);
//		
//		short a = 32767;
//		int d = 100;
//		long b = 100L;
//		
//		float e = 2.231F;
//		double i = 2.22;
//		65를 2진수로 바꾸고 싶다.
//		10진수를 8진수로 나타낼때 제일앞에 00 숫자 공 두개
//		char a = 00101; ==> 'A'

//		System.out.printf("%x", 65);		
		
//		10진수를 16진수로 나타낼때 제일 앞에 0x00 공엑스공공 붙이기
//		char a = 0x0041;
//		System.out.println(a);
		
//		System.out.printf("%s", Integer.toBinaryString(65));
		
//		10진수를 2진수로 나타낼때 제일 앞에 0b 공비 붙이기
//		char ch = 0b1000001;
//		System.out.println(ch);
//		
//		int value1 = (int)5.8;
//		System.out.println(value1);
//		
//		float value2 = (float)5.8;
		
//		upcasting  downcasting 왜 빨간줄
		
//		int a = (int)4.6;
//		System.out.println(a);
//		long value2 = 5;
//		double value3 = 7;
//		System.out.println(value2);
//		System.out.println(value3);
		
		/*
		 * 수동으로 타입변환 해줘야 하는 경우(다운캐스팅)
		 * 큰것을 작은것에 대입 할 경우....
		 */		
		
//		byte value6 = (byte)129;
//		System.out.println(value6);
//		
//		int value7 = (int)3.5;
//		System.out.println(value7);
//		
//		float value8 = (float)3.5;
//		System.out.println(value8);
		
//		기본 자료형 간의 연산
//		byte a = 5;
//		long b = 10;
//		
//		System.out.println(a+b);
//		
		/*
		 * 형변환 byte와 short는 int로 
		*/
		
//		int value1 = 5 + (int)3.5;
//		double value2 = 5 + 3.5;
//		System.out.println(value1);
//		System.out.println(value2);
//		
//		byte value3 = 3;
//		short value4 = 4;
//		
//		int resultValue1 = value3 + value4;
//		
//		System.out.println(resultValue1);
		
		
		
		
//		in.close();
		
	}

}
