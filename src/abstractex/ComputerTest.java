package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c1 = new DeskTop();
		Computer c2 = new MyNoteBook();
		
		c1.display();
		c1.typing();
		c2.display();
		c2.typing();
		
	}

}
