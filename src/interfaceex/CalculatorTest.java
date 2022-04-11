package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		Calc calcA = new CompleteCalc();
		
		int number1 = 10;
		int number2 = 2;
		
		System.out.println(calcA.add(number1, number2));
		System.out.println(calcA.subtract(number1, number2));
		System.out.println(calcA.times(number1, number2));
		System.out.println(calcA.divide(number1, number2));
		System.out.println(calcA.square(number1));
		
		
	}

}
