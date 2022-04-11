package array;

public class Car {
	private int carNo;
	private String carName;
	private String carOwner;
	
	public Car() {}
	
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	
	public void carInfo() {
		System.out.println("이차의 소유주는 " + carOwner + "입니다.");
		System.out.println("이차의 번호는 " + carNo + "이고 차 종은 " + carName + "입니다.");
	}
	
}
