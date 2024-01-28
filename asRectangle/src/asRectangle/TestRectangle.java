package asRectangle;

import javax.swing.JOptionPane;

public class TestRectangle {

	public static void main(String[] args) {
		
		String in, out;
		double len, wid, area, perimeter;
		
		in = JOptionPane.showInputDialog("Enter a length for your first Rectangle!");
		len = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Enter a width");
		wid = Double.parseDouble(in);
		
		Rectangle recOne = new Rectangle(len,wid);
		
		in = JOptionPane.showInputDialog("Enter a length for your second Rectangle!");
		len = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Enter a width");
		wid= Double.parseDouble(in);
		
		Rectangle recTwo = new Rectangle (len, wid);
		
		len = recOne.getLength();
		wid= recOne.getWidth();
		area = recOne.computeArea();
		perimeter = recOne.computePerim();
		
		out = "First Rectangle: \n";
		out = out + "Length: " +len +"\n";
		out = out + "Width: " + wid + "\n";
		out = out + "Area: " + area +"\n";
		out = out + "Perimeter: " + perimeter +"\n";
		out = out + "\n";
		
		len = recTwo.getLength();
		wid = recTwo.getWidth();
		area = recTwo.computeArea();
		perimeter = recTwo.computePerim();
		
		out = out + "Second Rectangle: \n";
		out = out + "Length: " +len +"\n";
		out = out + "Width: " + wid + "\n";
		out = out + "Area: " + area +"\n";
		out = out + "Perimeter: " + perimeter;
				
				
				
		JOptionPane.showMessageDialog(null, out);
		
		System.exit(0);
		

	}

}


