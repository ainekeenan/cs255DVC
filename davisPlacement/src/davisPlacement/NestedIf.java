package davisPlacement;

public class NestedIf {
double x;


public NestedIf(double ex) {
	x = ex;
	
	if (x>10) {
		System.out.println(1);
		if(x>20) {
			System.out.println(2);
		}
		if(x>30) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
		
	} else {
		if(x>5) {
			System.out.println(5);
		} 
		else{
			if (x>8) {
				System.out.println(6);
		
			} else {
				System.out.println(7);
			}
			
		}
		
	}

	
} 


} 
