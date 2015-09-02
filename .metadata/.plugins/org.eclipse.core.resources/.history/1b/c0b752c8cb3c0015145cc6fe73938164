package lesson9.lab9.prob9;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("test", 3);
		List<BookCopy> copies = book.getCopies();
		copies.forEach(copy -> copy.changeAvailability());
		
		//test for return false
		System.out.println(book.isAvailable());
		
		//test for return true
		book.addCopy();
		System.out.println(book.isAvailable());
	}
}
