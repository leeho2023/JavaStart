package array;

public class ObjectCopy1 {

	public static void main(String[] args) {

		char[][] arr = new char[13][2];
		
		char ch = 'A';
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ch;
				ch++;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
//		String[][] arr = {
//				{"a","b"},
//				{"c","d"},
//				{"e","f"},
//				{"g","h"},
//				{"i","j"},
//				{"k","l"},
//				{"m","n"},
//				{"o","p"},
//				{"q","r"},
//				{"s","t"},
//				{"u","v"},
//				{"w","x"},
//				{"y","z"}
//		};
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
		
//		int[] arr = {1,2,3,4,5,6,7};
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		
//		for(int i : arr) {
//			sum = sum + i;
//		}
//		
//		System.out.println(sum);
		
		
//		String[] strArray = {"Java", "Android", "C", "JavaScript", "python"};
//		
//		for(String str : strArray) {
//			System.out.println(str);
//		}
		
//		for(int i = 0; i < strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
		
		
//		Book[] library1 = new Book[3];
//		Book[] library2 = new Book[3];
//		
//		
//		library1[0] = new Book("태백산맥", "조정래");
//		library1[1] = new Book("데미안", "헤르만 헤세");
//		library1[2] = new Book("어떻게 살 것인가", "유시민");
//		
//		library2[0] = new Book();
//		library2[1] = new Book();
//		library2[2] = new Book();
//		
//		for(int i = 0; i < library1.length; i++) {
//			library2[i].setBookName(library1[i].getBookName());
//			library2[i].setAuthor(library1[i].getAuthor());
//		}
//
//		for(int i = 0; i < library2.length; i++) {
//			library2[i].showBookInfo();
//		}
//		
//		library1[0].setBookName("나목");
//		library1[0].setAuthor("박완서");
//		
//		System.out.println("=================아래는 세팅이 완료된 library1 입니다.================");
//		
//		for(int i = 0; i < library1.length; i++) {
//			library1[i].showBookInfo();
//		}
//		
//		System.out.println("=================아래는 세팅이 완료된 library2 입니다.================");
//		
//		for(int i = 0; i < library2.length; i++) {
//			library2[i].showBookInfo();
//		}
		
	}

}
