package cooperation;

public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println("현재 지하철 " + lineNumber + "의 승객은 " + passengerCount + "명입니다.");
		System.out.println("현재 " + lineNumber + "의 수입은 " + money + "원 입니다.");
	}
}
