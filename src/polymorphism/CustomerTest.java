package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer sutak = new Customer();
//		sutak.setCustomerID(10020);
//		sutak.setCustomerName("sutak");
//		sutak.setBonusPoint(1000);
//		System.out.println(sutak.showCustomerInfo());
//		
//		Customer xooos = new VIPCustomer(10020, "xooos", 12345);
//		xooos.setBonusPoint(1000);
//		System.out.println(xooos.showCustomerInfo());
//		
//		System.out.println("============할인율과 보너스포인트 계산===============");
//		
//		int price = 10000;
//		
//		int sutakPrice = sutak.calcPrice(price);
//		int xooosPrice = xooos.calcPrice(price);
//		String sutakName = sutak.getCustomerName();
//		String xooosName = xooos.getCustomerName();
//		
//		System.out.println(sutakName + "님이 " + sutakPrice + "원 지불하셨습니다.");
//		System.out.println(sutak.showCustomerInfo());
//		System.out.println(xooosName + "님이 " + xooosPrice + "원 지불하셨습니다.");
//		System.out.println(xooos.showCustomerInfo());
		
		Customer sutak = new BlackCustomer(10099, "sutak");
		
		int price = 10000;
		
		int sutakPrice = sutak.calcPrice(price);
		String sutakName = sutak.getCustomerName();
		
		System.out.println(sutakName + "님이 " + sutakPrice + "원 지불하셨습니다.");
		System.out.println(sutak.showCustomerInfo());
		
		
	}

}
