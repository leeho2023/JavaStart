package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {

		int result = num1 * num2;

		return result;
	}

	@Override
	public int divide(int num1, int num2) {
	
		if(num2 == 0) {
			return Calc.ERROR;
		}else {
			int result = num1 / num2;
			
			return result;
		}

	}
	
	@Override
	public int square(int num1) {

		int result = num1 * num1;
		
		return result;
	}
	
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}

	

}
