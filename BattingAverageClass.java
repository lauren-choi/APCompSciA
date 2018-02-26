/* Lauren Choi
 * September 21st, 2017
 * 
 * This program will let the user input the number of at-bats and hits. Then,
 * it will calculate whether or not the user is eligible for the All-Stars Game.
 * If the user confuses the number of hits with the number of at-bats, the program
 * will let them know that they cannot have more hits than at-bats.
 */

import java.util.Scanner;
public class BattingAverage {

	public static void main(String[] args) {
		// This section will let the user enter their number of at-bats and hits.
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your number of at-bats below:");
		int atBats = scan.nextInt();
		System.out.println("Enter your number of hits below:");
		int hits = scan.nextInt();
		
		// This section will make sure the user has entered the correct data.
		if (hits > atBats){
			System.out.println("Whoops, you can't have more hits than at-bats!");
		}
		else {
		
		// This section will calculate the user's hitting percentage based on their at-bats and hits.
		double hittingPercentage = hits / atBats;
		
		// This section will tell the user if they are eligible for the All-Stars Game. Their hitting percentage must be > 0.300.
		String message;
		if (hittingPercentage > 0.300){
			message = "Congratulations, you are eligible for the All-Stars Game!";
		}
		else {
			message = "Sorry, you are not eligible for the All-Stars Game.";
		}
		System.out.println(message);

		scan.close();
	}
	}
}
