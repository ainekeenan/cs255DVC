package davisPlacement;

public class ValueofS {
	
	double s = 0;
	double x = 0; 
	double y;
	
	public ValueofS(double y) {
		this.y = y;
		
		while (x<y) {
			s += x;
			x ++;

			
		}
		
		System.out.println("" + s);
	}

}
