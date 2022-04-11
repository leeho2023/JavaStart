package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student jenny = new Student("최제니", 16500);
//		
		Bus bus123 = new Bus(123);
//		Bus bus456 = new Bus(456);
//		
		Subway line1 = new Subway("1호선");
//		Subway line2 = new Subway("2호선");
//		
//		jenny.takeBus(bus123);
//		jenny.takeBus(bus456);
//		jenny.takeSubway(line1);
//		jenny.takeSubway(line2);
//		jenny.takeSubway(line2);
//		
//		jenny.showStudentInfo();
//		
//		bus123.showBusInfo();
//		bus456.showBusInfo();
//		line1.showSubwayInfo();
//		line2.showSubwayInfo();
		
//		Student edward = new Student("Edward", 12000);
//		
//		Taxi taxi1 = new Taxi("13가 1234 모범");
//		
//		edward.takeTaxi(taxi1);
//		edward.showStudentInfo();
//		taxi1.showTaxiInfo();
		
		jenny.goSchool(bus123, line1);
		
	}

}
