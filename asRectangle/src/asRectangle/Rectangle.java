package asRectangle;


public class Rectangle {

	private double length, width;
	
	
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double computeArea() {
		double area;
		area = length * width;
		return area;
	}
	
	public double computePerim() {
		double perimeter;
		perimeter = (2* length) + (2* width);
		return perimeter;
	}
	
	
}
