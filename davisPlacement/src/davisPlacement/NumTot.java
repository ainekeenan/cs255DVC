package davisPlacement;

public class NumTot {
	double total = 0;
	double number = 1;
	
	public NumTot() {
		
		while(number < 7) {
			
			if (number >= 3 && number<= 5) {
		
			total = total + number;
			
			}
			number ++;
		} 
		
		System.out.println(total);
		
	}
	
	

	
 
}
