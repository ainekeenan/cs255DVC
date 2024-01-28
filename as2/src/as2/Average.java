package as2;

import javax.swing.JOptionPane;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3, average, sum;
		String in, out;
		
		in = JOptionPane.showInputDialog("Enter the first number. \n");
		n1 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the second number. \n");
		n2 = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter the third number. \n");
		n3 = Double.parseDouble(in);
		
		
		
	
		sum = n1 + n2 + n3;
	average = (sum)/3;
			
out = "The Sum of " + n1 +", " + n2 +", and " + n3 +" is "+sum +". \n"; 
out = out + "The Average of " + n1 +", " + n2 + ", " + n3 +" is " + average +".";

		JOptionPane.showMessageDialog(null, out);
		
		System.exit(0);
	}

}

