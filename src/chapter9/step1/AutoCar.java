package chapter9.step1;

public class AutoCar extends Car{

	public void run() {
		System.out.print("차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}

}
