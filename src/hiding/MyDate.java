package hiding;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	
	public MyDate(int day, int month, int year) {
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean isValid() {
		
		if(month == 2) {
			if(day > 0 && day < 29) {
				System.out.println("유효한 날짜입니다.");
				return true; 	
			}else {
				System.out.println("유효하지 않은 날짜입니다.");
				return false;
			}
		} else {
			System.out.println("유효한 날짜입니다.");
			return true;
		}
		
		
	}
	

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
//	public void setDay(int day) {
//		
//		if(month == 2) {
//			if(day < 1 || day > 29) {
//				System.out.println("2월은 28일까지 밖에 없다고.... 바보야....");
//				return;
//			}else {
//				this.day = day;
//			}
//		}
//		
//	}
//	
	
	
}
