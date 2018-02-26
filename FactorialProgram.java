
/* 
 * Lauren Choi 
 * AP CS A 0 period
 * October 20, 2017
 * Factorial Program: This program calculates the factorial of a user-inputed number under 10.
 */

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		
		// ask user for input number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an input under 10:");
		
		// initializing variables to calculate factorial
		int n = scan.nextInt();
		int product = 1;
		
		// calculating factorial
		for (int i = 1; i <= n; i++){
			product *= i;
		}
		
		// initializing variables to print factorial
		String factorial = "";
		int count = 1;
		
		// printing factorial
		System.out.print(n + "! = ");
		
		for (int i = 1; i < n; i++){
			factorial = count + " * ";
			count++;
			System.out.print(factorial);
		}
		
		System.out.print(n + " = " + product);
		
		scan.close();
	}

}
