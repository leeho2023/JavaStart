package interfaceex;

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {

		int result = num1 + num2;
		
		return result;
	}

	@Override
	public int subtract(int num1, int num2) {

		int result = num1 - num2;
		
		return result;
	}

}
