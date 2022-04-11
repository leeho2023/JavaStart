package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer lee = new BronzeCustomer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer sutak = new GoldCustomer(10040, "sutak");
		Customer xooos = new VIPCustomer(10010, "xooos", 1001);
		Customer joker = new BlackCustomer(20010, "김조커");
		
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(sutak);
		customerList.add(xooos);
		customerList.add(joker);
		
		System.out.println("====================고객정보출력====================");
		
		for(Customer cus : customerList) {
			System.out.println(cus.showCustomerInfo());
		}
		
		System.out.println("===========할인율과 보너스 포인트 계산==========");
		
		int price = 10000;
		
		for(Customer cus : customerList) {
			int cost = cus.calcPrice(price);
			String name = cus.getCustomerName();
			int bp = cus.getBonusPoint();
			System.out.println(name + "님이 " + cost + "원을 지불했습니다.");
			System.out.println(name + "님의 보너스 포인트는 " + bp + "Point 입니다.");
		}
		
		
	}

}
