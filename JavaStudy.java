
/* Lauren Choi
 * AP CS A 0 period
 * October 31st, 2017 (Happy Halloween!)
 * JavaStudy: This program will calculate how long it takes Kevin to get ready for the exam based on a 10% learning rate.
 */

public class JavaStudy1 {
	
	public static void main(String[] args) {
	
		// initialize variables
		double start = 100;
		double end = 0;
		double learningRate = 0.9;
		int months = 0;
		int years = 0;
		
		// calculate how long (in months) Kevin will take to learn at least 95% of the book
		for (int i = 0; end < 95; i++){
			start *= learningRate;
			end = 100 - start;
			months++;
		}
		
		// convert months to years
		years = months / 12;
		months -= years * 12;

		// print results
		System.out.println("It takes Kevin " + years + " years and " + months + " months to get ready for the exam.");
			
	}

}
