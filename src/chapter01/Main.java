package chapter01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		char a = in.next().charAt(0);
				
		System.out.println(a);
		
		
//		if(n < b) {
//			for (int i = n; i <= b; i++) {
//				System.out.print(i + " ");
//			}
//		}else if(n > b) {
//			for (int i = b; i <= n; i++) {
//				System.out.print(i + " ");
//			}
//		}else if(n == b) {
//			System.out.println(n);
//		}
		
		in.close();
	}

}
