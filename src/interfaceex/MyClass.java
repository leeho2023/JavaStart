package interfaceex;

public class MyClass implements MyInterface{

	@Override
	public void x() {

		System.out.println("x() 메서드 호출");
		
	}

	@Override
	public void y() {

		System.out.println("y() 메서드 호출");
		
	}

	@Override
	public void myMethod() {

		System.out.println("myMethod() 메서드 호출");
		
	}

}
