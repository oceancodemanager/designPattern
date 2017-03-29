package main.java.test.param;

public class Writter {
	public void setPage(Book book) {
		book.setPage(100);
	}

	public static void main(String[] args) {
		Writter writter = new Writter();
		Book book = new Book();
		writter.setPage(book);
		System.out.println(book.getPage());
	}
}
