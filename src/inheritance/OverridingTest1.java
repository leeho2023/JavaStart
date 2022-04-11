package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {

		int goodsPrice = 10000;
		
		Customer sutak = new Customer(10010, "sutak");
		sutak.setBonusPoint(1000);
		
		System.out.println(sutak.getCustomerName() + "님이 지불해야할 돈은 " + sutak.calcPrice(goodsPrice) + "원 입니다.");
		
		VIPCustomer xooos = new VIPCustomer(10020, "xooos", 12345);
		xooos.setBonusPoint(10000);
		
		
		System.out.println(xooos.getCustomerName() + "님이 지불해야할 돈은 " + xooos.calcPrice(goodsPrice) + "원 입니다.");
	}

}
