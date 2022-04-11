package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println("11111111111111111");
		System.out.println(this);
	}
}

public class ThisExmaple {
	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2022);
		System.out.println();
		System.out.println(bDay);
		bDay.printThis();
	}
}
