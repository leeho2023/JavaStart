package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {

		shelf.add(title);
		
	}

	@Override
	public String deQueue() {
			// remove ArrayList의 요소를 삭제하고 그 값을 반환함
		return shelf.remove(0);
		
	}

	@Override
	public int getSize() {

		return getCount();
		
	}

}
