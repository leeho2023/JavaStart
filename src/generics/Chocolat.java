package generics;

public class Chocolat extends Material {

	@Override
	public void doPrinting() {
		System.out.println("초콜릿으로 프린트 합니다.(먹지마시오)");
	}
	
	public String toString() {
		return "재료는 초콜렛 입니다.";
	}

}
