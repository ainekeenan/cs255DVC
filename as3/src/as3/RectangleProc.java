package as3;

import javax.swing.JOptionPane;

public class RectangleProc {

	public static void main(String[] args) {
		
		double len, wid, area, perim;
		String in, out;

		in = JOptionPane.showInputDialog("Enter a length. \n");
		len = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Enter a width. \n");
		wid = Double.parseDouble(in);
		
		area = computeArea(len, wid); 
		perim = computePerim(len, wid);
		
		
		out = "Length: " + len +"\n";
		out = out + "Width: " + wid +"\n";
		out = out +"Area: " + area +"\n";
		out = out + "Perimeter: " + perim +"\n";
		
		JOptionPane.showMessageDialog(null, out);

	}
	
	static double computeArea(double len, double wid) {
		double area;
		area = len * wid;
		return area;
	}
	
	static double computePerim(double len, double wid) {
		double perimeter;
		perimeter = (2 * len) + (2 * wid);
		return perimeter;

	}

}

