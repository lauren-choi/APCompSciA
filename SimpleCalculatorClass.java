/* Lauren Choi
 * September 25, 2017
 * AP CS A 0 Period
 * 
 * This program will let the user input two doubles and an operation; then,
 * the program will calculate the operation using the two doubles.
 */

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		
		// this section will let the user enter two doubles.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two doubles:");
		double first = scan.nextDouble();
		double second = scan.nextDouble();
		
		// this section will let the user enter an operation.
		System.out.println("Enter an operation (ADD, SUBTRACT, MULTIPlY, DIVIDE):");
		String operation = scan.next();
		
		// this section will determine the calculations for each operation.
		double sum = first + second;
		double difference = first - second;
		double product = first * second;
		double quotient = first / second;
		
		// this section will print the result of the operation.
		if (operation.equals("ADD")){
			System.out.println("The sum is equal to " + sum + ".");
		}
		else if (operation.equals("SUBTRACT")){
			System.out.println("The difference of " + first + " minus " + second + " equals " + difference + ".");
		}
		else if (operation.equals("MULTIPLY")){
			System.out.println("The product is equal to " + product + ".");
		}
		else if (operation.equals("DIVIDE")){
			System.out.println("The quotient of " + first + " divided by " + second + " equals " + quotient + ".");
		}
		
		scan.close();
	}

}
