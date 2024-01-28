package asStatus;

import javax.swing.JOptionPane;

public class Rectangle implements Status{

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
		
		public String getStatus() {
			String total = "Rectangle \n Length= " + length + ", Width= " + width +"\n";

			return total;

		}

		public void displayStatus() {
			String status = getStatus();
			JOptionPane.showMessageDialog(null, status);
		}
	}


