package array;

public class StudentArray {

	public static void main(String[] args) {
		
		int[] arr1 = {10 ,20, 30, 40, 50};
		int[] arr2 = {1, 2, 3, 4, 5};
		
		System.arraycopy(arr1, 0, arr2, 1, 6);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
//		Student[] sd = new Student[3];
//		
//		sd[0] = new Student();
//		sd[0].setName("James");
//		sd[0].setStudentID(1001);
//		
//		sd[1] = new Student();
//		sd[1].setName("Tomas");
//		sd[1].setStudentID(2001);
//		
//		sd[2] = new Student();
//		sd[2].setName("Edward");
//		sd[2].setStudentID(3001);
//		
//		for(int i = 0; i < sd.length; i++) {
//			sd[i].showStudentInfo();
//		}
		
		
	}

}
