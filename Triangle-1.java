/* 
 * Lauren Choi
 * AP CS A 0 period
 * 27th November 2017
 * Triangle Class
 */

public class Triangle {

	// define instance variables
	private int startSide1;
	private int startSide2;
	private int startSide3;
	
	// default constructor
	public Triangle () {
		startSide1 = 0;
		startSide2 = 0;
		startSide3 = 0;
	}
	
	// overloaded constructor
	public Triangle (int side1, int side2, int side3) {
		startSide1 = side1;
		startSide2 = side2;
		startSide3 = side3;
	}
	
	// isTriangle method finds if object is triangle
	public boolean isTriangle () {
		if (startSide1 > 0 && startSide2 > 0 && startSide3 > 0){
			return true;
		}
		else return false;
	}
	
	// isRight method finds if object is right triangle
	public boolean isRight () {
		if (((Math.pow(startSide1, 2) + Math.pow(startSide2, 2) == Math.pow(startSide3, 2)) || 
			(Math.pow(startSide2, 2) + Math.pow(startSide3, 2) == Math.pow(startSide1, 2)) ||
			(Math.pow(startSide3, 2) + Math.pow(startSide1, 2) == Math.pow(startSide2, 2)))
			&& isTriangle () == true && isEquilateral () == false) {
			return true;
		}
		else return false;
	}
	
	// isRight method finds if no two sides are the same length
	public boolean isScalene () {
		if ((startSide1 != startSide2 && startSide1 != startSide3 && startSide2 != startSide3) && isTriangle () == true) {
			return true;
		}
		else return false;
	}
	
	// isIsosceles finds if exactly two sides are the same length
	public boolean isIsosceles () {
		if ((startSide1 == startSide2 || startSide1 == startSide3 || startSide2 == startSide3) && isTriangle () == true && isEquilateral() == false) {
			return true;
		}
		else return false;
	}
	
	// isEquilateral finds if all three sides are the same length
	public boolean isEquilateral () {
		if ((startSide1 == startSide2 && startSide1 == startSide3) && isTriangle () == true && isRight () == false) {
			return true;
		}
		else return false;
	}
	
}
