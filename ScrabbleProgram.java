/* Lauren Choi 
 * AP CS A 0 period
 * January 9th, 2018
 * Scrabble Program: computes score of user-inputed word based on predetermined values for each letter
 */

public class ScrabbleProgram {
	
	// initializing variables
	private String word;
	private int[] letterVal = {1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	private String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", 
									"q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }; 
	private int score;
	private int j;
	
	// default constructor
	public ScrabbleProgram() {
		word = "";
		score = 0;
		j = 0;
	}
	
	// overloaded constructor
	public ScrabbleProgram(String word) {
		this.word = word;
	}
	
	// computeScore method calculates the score of word and returns it
	public int computeScore (String word) {
		for (int i = 0; i < word.length(); i++) {
			j = 0;
			while (!(word.substring(i, i+1).equalsIgnoreCase(letters[j]))) {
				j++;
			}
			score += letterVal[j];
		}
		return score;
	}
	
}