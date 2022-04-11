package classpart;

public class ShoppingMall {
	long orderNum = 201803120001L;
	String orderId = "abc123";
	String orderDate = "2018년 3월 12일";
	String orderName = "홍길순";
	String prodNum = "PD0345-12";
	String address = "서울시 영등포구 여의도동 20번지";
	
	// orderId, prodNum 출력 메서드
	// 1) void 형태 메서드
	public void print1() {
		System.out.println("출력 내용(void형태)>> orderId : " + orderId + ", prodNum : " + prodNum);
	}
	
	// 2) String 형태 메서드
	public String print2() {
		
		String result = "출력 내용(String형태)>> orderId : " + orderId + ", prodNum : " + prodNum;
		
		return result;
	}
	
}
