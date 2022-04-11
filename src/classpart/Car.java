package classpart;

public class Car {
	String carName;
	int carSpeed;
	
	public void name() {
		System.out.println("이 차는 " + carName + "입니다.");
	}
	
	public void accel(int accel) {
		
		carSpeed = accel;
		System.out.println(carName+"는 "+ carSpeed +"km로 주행중입니다.");
		
	}
	
}
