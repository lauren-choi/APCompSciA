
public class RectangleArea {

	// defining instance variables
	private int width;
	private int height;
	private int area;
	
	// default constructor
	public RectangleArea () {
		width = 0;
		height = 0;
	}
	
	// overloaded constructor
	public RectangleArea ( int startWidth, int startHeight ){
		setWidth(startWidth);
		setHeight(startHeight);
	}
	
	// accessor method for width
	public int getWidth () {
		return width;
	}
	
	// accessor method for height
	public int getHeight () {
		return height;
	}
	
	// mutator method for width
	public void setWidth ( int newWidth ) {
		width = newWidth;
	}
	
	// mutator method for height
	public void setHeight ( int newHeight ){
		height = newHeight;
	}
	
	// calculate area of rectangle
	public int calculateArea () {
		area = width * height;
		return area;
	}
	
}
