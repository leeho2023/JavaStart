package array;

public class Shoes {
	private int price;
	private String shoesName;
	private String maker;
	
	public Shoes() {}
	
	public Shoes(String maker, String shoesName, int price) {
		this.maker = maker;
		this.shoesName = shoesName;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getShoesName() {
		return shoesName;
	}
	public void setShoesName(String shoesName) {
		this.shoesName = shoesName;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void shoesInfo() {
		System.out.println("이 신발은 " + maker + " " + shoesName + "입니다.");
		System.out.println("가격은 " + price + "원 입니다.");
	}
	
	
}
