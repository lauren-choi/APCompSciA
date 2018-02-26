
/* Lauren Choi  
 * APCSA 0 period
 * February 2nd, 2018
 * BookStore Class: provides the user with an interface
 */

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class BookStoreEngine {
	
	public static void main(String[] args) {
		
		// initializing variables
		BookStore store1 = new BookStore();
		String keyword;
		JFrame frame = new JFrame();

		// printing all titles
		System.out.println("Books in collection:" + "\n" + store1.toString());
		
		// prompting user for keyword
		keyword = JOptionPane.showInputDialog(frame, "Enter a keyword");
		
		// printing keyword titles
		System.out.println("Books with keyword:");
		ArrayList<Book> keywordPhrase = store1.searchForTitle(keyword);
		for (Book z : keywordPhrase ) {
			System.out.println(z.toString());
		}
	}

}
