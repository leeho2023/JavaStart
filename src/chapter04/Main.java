package chapter04;

import java.util.Scanner;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		System.out.println("당신의 나이를 숫자로만 입력해 주세요");
//		Scanner sc = new Scanner(System.in);
//		
//		int age;
//		
//		age = sc.nextInt();
//		
//		조건식은 무조건 true or false로 반환되어야 한다.
//		if(age == 7) {
//			System.out.println("학교에 다닌다.");
//		}else {
//			System.out.println("학교에 다니지 않습니다.");
//		}
//			
//		
//		sc.close();
//		
//		
//		
//		
//		
//		
//		if(age < 0) {
//			System.out.println("나이에 음수는 없습니다.");
//		}else {
//			if(age < 8) {
//				System.out.println("유치원에 다닙니다.");
//			}else if(age < 14){
//				System.out.println("초등학교에 다닙니다.");
//			}else if(age < 17) {
//				System.out.println("중학교에 다닙니다.");
//			}else if(age < 20) {
//				System.out.println("고등학교에 다닙니다.");
//			}else {
//				System.out.println("성인입니다.");
//			}
//		}
//		
//		
//		홀짝 판별기 만들기!!!!

//		System.out.println("홀짝 판별기!!");
//		System.out.println("1~1000사이의 정수를 입력해주세요");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		if(num >= 1 && num <= 1000) {
//			if (num % 2 == 1) {
//				System.out.println("당신이 입력한 " + num + "는 홀수입니다.");
//			}else {
//				System.out.println("당신이 입력한 " + num + "는 짝수입니다.");
//			}
//		}else {
//			System.out.println("1~1000사이의 숫자가 아닙니다.");
//		}
//		
//		BMI 계산기 만들기!!
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 몸무게를 입력하세요(소수점 첫째자리 까지)");
//		System.out.println("(20kg ~ 300kg 이신 분만 가능합니다^^)");
//		float kg = sc.nextFloat(); // 20~300
//		System.out.println("당신의 키를 입력하세요(cm단위로 적어주세요)");
//		double cm = sc.nextDouble();
//		double m = cm / 100;
//		double BMI = kg / (m * m);
//		String str = "";
//
//		if (kg < 20 || kg > 300) {
//			System.out.println("몸무게가 정확하지 않습니다. 다시 입력해 주세요");
//		} else {
//			System.out.println("당신의 키를 입력하세요(cm단위로 적어주세요)");
//			float cm = sc.nextFloat();
//			float m = cm / 100;
//			float BMI = (float)(kg / (m * m));
//			String str = "";
//			if (BMI <= 18.5) {
//				str = "저체중";
//				System.out.println("당신의 몸무게는 " + kg + "이고,");
//				System.out.println("키는 " + cm + "입니다. 따라서");
//				System.out.println("당신의 BMI 수치는 " + String.format("%.1f", BMI) + " , " + str + "입니다.");
//			} else if (BMI >= 18.6 && BMI <= 23) {
//				str = "정상";
//				System.out.println("당신의 몸무게는 " + kg + "이고,");
//				System.out.println("키는 " + cm + "입니다. 따라서");
//				System.out.println("당신의 BMI 수치는 " + String.format("%.1f", BMI) + " , " + str + "입니다.");
//			} else if (BMI >= 24 && BMI <= 25) {
//				str = "과체중";
//				System.out.println("당신의 몸무게는 " + kg + "이고,");
//				System.out.println("키는 " + cm + "입니다. 따라서");
//				System.out.println("당신의 BMI 수치는 " + String.format("%.1f", BMI) + " , " + str + "입니다.");
//			} else if (BMI >= 26 && BMI <= 30) {
//				str = "비만";
//				System.out.println("당신의 몸무게는 " + kg + "이고,");
//				System.out.println("키는 " + cm + "입니다. 따라서");
//				System.out.println("당신의 BMI 수치는 " + String.format("%.1f", BMI) + " , " + str + "입니다.");
//			} else if (BMI >= 31 && BMI <= 35) {
//				str = "고도비만";
//				System.out.println("당신의 몸무게는 " + kg + "이고,");
//				System.out.println("키는 " + cm + "입니다. 따라서");
//				System.out.println("당신의 BMI 수치는 " + String.format("%.1f", BMI) + " , " + str + "입니다.");
//			} else
//				str = "초고도비만";
//			System.out.println("당신의 몸무게는 " + kg + "이고,");
//			System.out.println("키는 " + cm + "입니다. 따라서");
//			System.out.printf("당신의 BMI 수치는 " + String.format("%.1f", BMI) + " , " + str + "입니다.");
//		}
//		System.out.println(">>>>>>>>>>>BMI 계산기<<<<<<<<<<<<<<");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 키를 입력해주세요");
//		
//		double height = sc.nextDouble();
//		
//		System.out.println("당신의 몸무게를 입력해주세요");
//		
//		double weight = sc.nextDouble();
//		
//		double changeHeight = ((height*0.01) * (height*0.01));
//		
//		double bmi = weight / changeHeight;
//		
//		if(weight < 20 || weight > 300) {
//			System.out.println("제발 정직하게 적어주세요");
//		}else {
//			if(bmi <= 18.5) {
//				System.out.println("저체중");
//			}else if(bmi <= 23) {
//				System.out.println("정상");
//			}else if(bmi <= 25) {
//				System.out.println("과체중");
//			}else if(bmi <= 30) {
//				System.out.println("비만");
//			}else if(bmi <= 35) {
//				System.out.println("고도비만");
//			}else if(bmi <= 36) {
//				System.out.println("초고도비만");
//			}
//		}
//		
//		sc.close();
//		System.out.println(">>>>>>>>>>계절 판독기<<<<<<<<<<<<");
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 3개를 띄어쓰기 단위로 입력");
//		System.out.println("1~12사이의 숫자만 입력해주세요");
//		
//		int num1, num2, num3;
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//
//		if(num1 < 1 || num2 <1 || num3 < 1 ||
//				num1 > 12 || num2 > 12 || num3 > 12) {
//			System.out.println("숫자를 다시 입력해 주세요");
//		}else {
//			if(num1 == 1 || num1 == 2 || num1 == 12) {
//				System.out.println("겨울");
//			}else if(num1 == 3 || num1 == 4 || num1 == 5) {
//				System.out.println("봄");
//			}else if(num1 == 6 || num1 == 7 || num1 == 8) {
//				System.out.println("여름");
//			}else
//				System.out.println("가을");
//			
//			if(num2 == 1 || num2 == 2 || num2 == 12) {
//				System.out.println("겨울");
//			}else if(num2 == 3 || num2 == 4 || num2 == 5) {
//				System.out.println("봄");
//			}else if(num2 == 6 || num2 == 7 || num2 == 8) {
//				System.out.println("여름");
//			}else
//				System.out.println("가을");
//			
//			if(num3 == 1 || num3 == 2 || num3 == 12) {
//				System.out.println("겨울");
//			}else if(num3 == 3 || num3 == 4 || num3 == 5) {
//				System.out.println("봄");
//			}else if(num3 == 6 || num3 == 7 || num3 == 8) {
//				System.out.println("여름");
//			}else
//				System.out.println("가을");
//		}
//		sc.close();

//		System.out.println(">>>>>>>>>>>>큰수<<<<<<<<<<<<<<");
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 2개를 띄어쓰기 단위로 입력해주세요");
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int result;
//		
//		result = num1 > num2 ? num1 : num2;
//		
//		if(num1 == num2) {
//			System.out.println("두 숫자는 같습니다.");
//		}else {
//			if(result == num1) {
//				System.out.println(num1 + "가 " + Math.abs(num1-num2) +"만큼 더 큽니다.");
//			}else{
//				System.out.println(num2 + "가 " + Math.abs(num1-num2) +"만큼 더 큽니다.");
//			}
//		}
//		
//		sc.close();
//
//		int ranking = 1;
//		String medal = null;
//
//		switch (ranking) {
//		case 1:
//			medal = "금메달 입니다.";
//			break;
//		case 2:
//			medal = "은메달 입니다.";
//			break;
//		case 3:
//			medal = "동메달 입니다.";
//			break;
//		default:
//			medal = "수고하셨습니다.";
//		}
//
//		System.out.println(ranking + "등은 " + medal);

//		int month = 11;
//		int lastDay = 0; 
//		
//		switch (month) {
//		case 1 :case 3 :case 5 :case 7 :case 8 :case 10: case 12:
//			lastDay = 31;
//			break;
//		case 4: case 6: case 9: case 11:
//			lastDay = 30;
//			break;
//		case 2:
//			lastDay = 28;
//			break;
			
//		case 1 :
//			lastDay = 31;
//			break;
//		case 2 :
//			lastDay = 28;
//			break;
//		case 3 :
//			lastDay = 31;
//			break;
//		case 4 :
//			lastDay = 30;
//			break;
//		case 5 :
//			lastDay = 31;
//			break;
//		case 6 :
//			lastDay = 30;
//			break;
//		case 7 :
//			lastDay = 31;
//			break;
//		case 8 :
//			lastDay = 31;
//			break;
//		case 9 :
//			lastDay = 30;
//			break;
//		case 10 :
//			lastDay = 31;
//			break;
//		case 11 :
//			lastDay = 30;
//			break;
//		case 12 :
//			lastDay = 31;
//			break;
//		}
//		
//		System.out.println(month + "월의 마지막 일은 " + lastDay + "일 입니다.");
		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(2+" x "+i+" = " +(2*i));
//		}
		
//		for(int i = 2; i < 20; i++) {
//			
//			for(int j = 1; j < 10; j++) {
//				
//				System.out.println(i + " x " + j + " = " + (i*j));
//			
//			}
//			System.out.println();
//			
//		}
		
//		for(int i = 1; i < 10; i++) {
//			for(int j = 2; j < 20; j++) {
//				if(j % 2 == 1) {
//					continue;
//				}
//				System.out.print(j + " x " + i + " = " + (i*j) +"\t");
//			}
//			System.out.println();
//		}
		
//		for(int i = 2; i < 20; i++) {
//			for(int j = 1; j < 10; j++) {
//				if(i == (j-1)) {
//					break;
//				}
//				System.out.println(i + " x " + j + " = " + (i*j));
//			}
//			System.out.println();
//		}
		
//		for(int i = 0; i < 3; i ++) {
//			for(int j = 0; j <= i+1; j++) {
//				System.out.print(" ");
//			}
//			for(int j = (4-i-1)*2-1; j > 0 ; j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		for(int i = 0; i < 3; i ++) {
//			for(int j = 0; j < 2-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j <= 2*i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
//		for(int i = 0; i < 4; i ++) {
//			for(int j = 0; j < 3-i; j++) {
//				System.out.print(" ");
//			}
//			for(int j = 0; j <= 2*i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			if(i == 3) {
//				for(int h = 0; h < 3; h ++) {
//					for(int j = 0; j < h+1; j++) {
//						System.out.print(" ");
//					}
//					for(int j = 0; j <= 2*h; j++) {
//						System.out.print("*");
//					}
//					System.out.println("");
//				}
//			}
//		}
		
//		
//		System.out.println("숫자를 입력하세요");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int k = sc.nextInt();
//		
//		for(int i = 1; i < 10; i++) {
//			System.out.println(k +" x "+ i + " = " + (i*k));
//		}
//		int i;
//		int sum = 0;
//		for(i = 1;; i++) {
//			sum += i;
//			if(sum > 30) {
//				break;
//			}
//		}
//		
//		System.out.println(sum);
		
//		int num = 1;
//		int sum = 0;
//		
//		while(num <= 100) {
//			sum = sum + num;
//			num++;
//			System.out.println(sum);
//		}
//		
//		System.out.println(sum);
//	
//		int num = 1;
//		int sum = 0;
//		
//		do {
//			System.out.println(sum);
//			System.out.println(num);
//			sum = sum + num;
//			System.out.println(sum);
//			System.out.println(num);
//			num++;
//			System.out.println(sum);
//			System.out.println(num);
//		}while(num > 10);
//		
//		System.out.println(sum);
//		System.out.println(num);
		
		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
		
//		for(;;) {
//			if(a <= 0 || a >= 4) {
//				System.out.println("-------숫자 오류-------\n숫자를 다시 입력해 주세요");
//				a = in.nextInt();
//			}else {
//				if(a == 1) {
//					System.out.println("1이(가) 입력됨");
//					a = in.nextInt();
//				}else if(a == 2) {
//					System.out.println("2이(가) 입력됨");
//					a = in.nextInt();
//				}else if(a == 3) {
//					System.out.println("프로그램 종료");
//					in.close();
//					break;
//				}
//			}
//		}
		
		
//		int b = 0;
		
		while (true) {
			System.out.println("연산하고 싶은 연산기호를 써주세요\n(+,-,x,/)만 가능");
			System.out.println("종료하고 싶으시면 #을 입력하세요");
			char a = in.next().charAt(0);
			int num1;
			int num2;
			switch (a) {
			case '+': 
				System.out.println("+가 입력됨");
				System.out.println("더하기 프로그램 시작");
				System.out.println("첫번째 숫자 입력");
				num1 = in.nextInt();
				System.out.println("두번째 숫자 입력");
				num2 = in.nextInt();
				System.out.println("결과값은 " + sum(num1,num2));
				break;
			case '-': 
				System.out.println("-가 입력됨");
				System.out.println("빼기 프로그램 시작");
				System.out.println("첫번째 숫자 입력");
				num1 = in.nextInt();
				System.out.println("두번째 숫자 입력");
				num2 = in.nextInt();
				System.out.println("결과값은 " + minus(num1,num2));
				break;
			case 'x': 
				System.out.println("x가 입력됨");
				System.out.println("곱하기 프로그램 시작");
				System.out.println("첫번째 숫자 입력");
				num1 = in.nextInt();
				System.out.println("두번째 숫자 입력");
				num2 = in.nextInt();
				System.out.println("결과값은 " + multiple(num1,num2));
				break;
			case '/':
				System.out.println("/가 입력됨");
				System.out.println("나누기 프로그램 시작");
				System.out.println("첫번째 숫자 입력");
				num1 = in.nextInt();
				System.out.println("두번째 숫자 입력");
				num2 = in.nextInt();
				System.out.println("결과값은 " + div(num1,num2));
				break;
			case '#':
				System.out.println("계산기 프로그램을 종료합니다.");
				in.close();
				return;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		
		
	}

	
	public static int multiple(int num1, int num2) {
		int result;
		result = num1 * num2;
		return result;
	}
	
	public static int div(int num1, int num2) {
		int result;
		result = num1 / num2;
		return result;
	}
	
	public static int minus(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public static int sum(int num1, int num2) {
		int result;
		result = num1 + num2;
		
		return result;
	}
	
	
}
