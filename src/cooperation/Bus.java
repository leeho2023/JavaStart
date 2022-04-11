package cooperation;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println("현재 버스 " + busNumber + "번의 승객은 " + passengerCount + "명입니다.");
		System.out.println("현재 " + busNumber + "번 버스의 수입은 " + money + "원 입니다.");
	}
	
}
