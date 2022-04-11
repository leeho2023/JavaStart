package array;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Shoes> shoes = new ArrayList<Shoes>();
		
		shoes.add(new Shoes("나이키", "운동화", 65000));
		shoes.add(new Shoes("나이키", "축구화", 70000));
		shoes.add(new Shoes("나이키", "런닝화", 98000));
		shoes.add(new Shoes("아디다스", "운동화", 55000));
		shoes.add(new Shoes("아디다스", "축구화", 85000));
		shoes.add(new Shoes("아디다스", "런닝화", 115000));
		shoes.add(new Shoes("다이나핏", "런닝화", 165000));
		shoes.add(new Shoes("아이더", "등산화", 265000));
		shoes.add(new Shoes("블랙야크", "등산화", 365000));
		
		for(Shoes shoesAll : shoes) {
			shoesAll.shoesInfo();
		}
		
//		ArrayList<Car> car = new ArrayList<Car>();
//		
//		Car car1 = new Car();
//		car1.setCarOwner("sutak");
//		car1.setCarName("벤츠");
//		car1.setCarNo(1111);
//		
//		Car car2 = new Car();
//		car2.setCarOwner("sutak1");
//		car2.setCarName("소나타");
//		car2.setCarNo(5683);
//		
//		Car car3 = new Car();
//		car3.setCarOwner("sutak2");
//		car3.setCarName("아반떼");
//		car3.setCarNo(9865);
//		
//		car.add(car1);
//		car.add(car2);
//		car.add(car3);
//		
//		for(Car carAll : car) {
//			carAll.carInfo();
//		}
		
//		ArrayList<Student> std = new ArrayList<Student>();
//		
//		Student std1 = new Student(1001, "James");
//		Student std2 = new Student(1002, "Tomas");
//		Student std3 = new Student(1003, "Edward");
//		
//		std.add(std1);
//		std.add(std2);
//		std.add(std3);
//		
//		for(Student student : std) {
//			student.showStudentInfo();
//		}
		
//		ArrayList<Book> library = new ArrayList<Book>();
//		
//		library.add(new Book("태백산맥", "조정래"));
//		library.add(new Book("데미안", "헤르만 헤세"));
//		library.add(new Book("어떻게 살 것인가", "유시민"));
//		library.add(new Book("토지", "박경리"));
//		library.add(new Book("어린왕자", "생텍쥐페리"));
//		library.add(new Book("sutak", "sutak"));
//
//		for(int i = 0; i < library.size()-1; i++) {
//			Book book = library.get(i);
//			book.showBookInfo();
//		}
//		
//		
//		for(Book book : library) {
//			book.showBookInfo();
//		}
		
		
	}
}
