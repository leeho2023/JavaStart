package object;

class Book{
	int bookNumber;
	String bookTitle;
	
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}
	
}

class Member{
	private String memID;
	private String memPW;
	
	
	Member(String memID, String memPW) {
		this.memID = memID;
		this.memPW = memPW;
	}


	@Override
	public String toString() {
		return "Member [memID=" + memID + ", memPW=" + memPW + "]";
	}

}



public class ToStringEx {

	public static void main(String[] args) {

		Member m1 = new Member("sutak", "sutak");
		Member m2 = new Member("sutak1", "sutak1");
		Member m3 = new Member("sutak2", "sutak2");
		Member m4 = m1;
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m1.equals(m4));
		
//		Book book1 = new Book(100, "개미");
//		Book book2 = new Book(200, "데미안");
//		
//		System.out.println(book1.toString());
//		System.out.println(book2.toString());
		
	}

}
