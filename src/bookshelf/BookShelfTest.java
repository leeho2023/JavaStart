package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		
		shelfQueue.enQueue("태백산맥");
		shelfQueue.enQueue("토지");
		shelfQueue.enQueue("어린왕자");
		
		System.out.println("===============내가 빼낸 책의 제목=================");
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		System.out.println("===============책장에 남은 책의 권수===============");
		
		System.out.println(shelfQueue.getSize());
		
		
		
	}

}
