package abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop에서의 display()(이)가 완성됐습니다.");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop에서의 typing()(이)가 완성됐습니다.");		
	}

}
