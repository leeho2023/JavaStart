package inheritance;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		VIPCustomer xooos = new VIPCustomer(10020, "xooos", 9999);
		xooos.setBonusPoint(183546);
		System.out.println(xooos.showVIPInfo());
		
	}

}
