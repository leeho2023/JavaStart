package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		System.out.println(studentName + "님이 " + bus.busNumber + "번 버스를 탔습니다.");
		System.out.println("버스요금으로 1000원을 지불했습니다.");
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway subway) {
		System.out.println(studentName + "님이 " + subway.lineNumber + "을 탔습니다.");
		System.out.println("지하철요금으로 1500원을 지불했습니다.");
		this.money -= 1500;
		subway.take(1500);
		
	}
	
	public void takeTaxi(Taxi taxi) {
		System.out.println(studentName + "님이 " + taxi.taxiNumber + " 택시를 탔습니다.");
		this.money -= 10000;
		taxi.take(10000);
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
	public void goSchool(Bus bus, Subway subway) {
		this.takeBus(bus);
		this.takeSubway(subway);
		this.showStudentInfo();
	}
	
}





