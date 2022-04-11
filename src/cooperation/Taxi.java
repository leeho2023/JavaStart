package cooperation;

public class Taxi {
	String taxiNumber;
	int money;
	int passengerCount;
	
	public Taxi(String taxiNumber){
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println("지금까지 태운 승객 수는 " + passengerCount + "명입니다.");
		System.out.println("현재 택시 수입은 " + money + "입니다.");
	}
	
}
