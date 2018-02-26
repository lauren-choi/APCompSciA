
/* Lauren Choi  
 * APCSA 0 period
 * February 2nd, 2018
 * BookStore Class: holds books from Book class
 */

import java.util.*;
public class BookStore {
	
	// initializing variables
	public ArrayList<Book> library;
	private String allBooks;
	private String KTitle;
	public ArrayList<Book> phrases;
	public Book book1 = new Book("The Alchemist", "Paulo Coelho", 11.99);
	public Book book2 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 8.99);
	public Book book3 = new Book("Anne of Green Gables", "L.M. Montgomery", 7.69);
	public Book book4 = new Book("Man's Search for Meaning", "Viktor Frankl", 9.64);
	public Book book5 = new Book("Ready Player One", "Ernest Cline", 9.19);
	public Book book6 = new Book("Pride and Prejudice", "Jane Austen", 8.04);
	
	// default constructor
	public BookStore () {
		library = new ArrayList<Book>(6);
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);
		library.add(book6);
	}
	
	// toString method
	public String toString () {
		for (Book j : library) {
			allBooks += j + "\n";
		}
		return allBooks;
	}
	
	// searchForTitle method
	public ArrayList<Book> searchForTitle(String keyword) {
		phrases = new ArrayList<Book>(6);
		for (Book s : library) {
			KTitle = s.getTitle();
			if (KTitle.indexOf(keyword) != -1) {
				phrases.add(s);
			}
		}
		if (phrases.isEmpty()) {
			System.out.println("No books were found - check capitalization/spelling");
		}
		return phrases;
	}

	public int BSSize() {
		return library.size();
	}
	
	
}
