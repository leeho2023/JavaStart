package singleton;

public class Car {
	private static int Num = 10000;
	private int carNum;
	
	public Car() {
		Num++;
		carNum = Num;
	}

	public int getCarNum() {
		return carNum;
	}
	
	
	
}
