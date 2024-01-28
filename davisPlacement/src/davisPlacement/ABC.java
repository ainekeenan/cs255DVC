package davisPlacement;

import javax.swing.JOptionPane;

public class ABC {
	
	double a;
	double b;
	double c; 
	
	public ABC(double first, double second){
		a = first;
		b = second;  
	
	
	if(a<0) {
		a = -a;
	}

	if (b<0) {
		b = -b;
	}

	while (b>0) {
		while(b<=a) {
			a=a-b;
		}
		c=a;
		a=b;
		b=c;
		
	 } 
	
	String num = "" + a;

	JOptionPane.showMessageDialog(null, num);


	} }



