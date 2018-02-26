
/* Lauren Choi
 * APCSA 0 period
 * February 2nd, 2018
 * Book Class: creates Book objects
 */

public class Book {
	
	// initializing variables
	private String title;
	private String author;
	private double price;
	
	// default constructor
	public Book () {
		title = "";
		author = "";
		price = 0;
	}
	
	// overloaded constructor
	public Book (String newTitle, String newAuthor, double newPrice) {
		title = newTitle;
		author = newAuthor;
		price = newPrice;
	}
	
	// accessor method for title
	public String getTitle () {
		return title;
	}
	
	// accessor method for author
	public String getAuthor () {
		return author;
	}
	
	// accessor method for price
	public double getPrice () {
		return price;
	}
	
	// toString method
	public String toString () {
		return "The title of the book is " + title + ". The author is " + author + 
				". The price is " + price + " dollars.";
	}
	
}
