/* Lauren Choi
 * AP CS A 0 period
 * MakingChange program: generates random number; user inputs a cash value; program returns change
 * December 11th, 2017
 */

import java.util.*;
import java.text.*;

public class MakingChange1 {

	public static void main(String[] args) {
		
		// creating random money values
		Random rand = new Random();
		int cash = rand.nextInt(10) + 1;
		double cents = rand.nextDouble();
		
		// formatting random total in decimal format
		DecimalFormat moneyFormat = new DecimalFormat("$#0.00");
		double totalDue = cash + cents;
		String totalDue1 = moneyFormat.format(cash + cents);
		
		// telling user the total due and prompting user for cash
		System.out.println("The total due is " + totalDue1 + ". Please pay in cash below:");
		Scanner scan = new Scanner(System.in);
		int cashPaid = scan.nextInt();
		
		// checking if cash entered is enough money
		while (cashPaid < totalDue) {
			System.out.println("More cash is needed. Please enter a greater amount.");
			cashPaid = scan.nextInt();
		}
		
		// calculating change in whole dollars and cents
		int dollars = cashPaid - cash - 1;
		double coins = 1 - cents;
		String coins1 = moneyFormat.format(coins);
		String changeDue1 = moneyFormat.format(cashPaid - totalDue);
		String cashPaid1 = moneyFormat.format(cashPaid);
		
		System.out.println("You paid " + cashPaid1 + ". Your change is " + changeDue1 + ". You will receive " 
							+ dollars + " dollar(s) and " + coins1 + " cents.");
		
		scan.close();

	}

}
