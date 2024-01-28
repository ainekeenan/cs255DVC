package asExpection;

import javax.swing.JOptionPane;

public class Expection {

	//Don't use
	
	public Expection(){
		
	}
	
	public static void validateID (String ID) throws IdNotAWholeNumberException {
		int num; 
		
		try {
			
			num = Integer.parseInt(ID);
			
		} catch(NumberFormatException e) {
			
			throw new IdNotAWholeNumberException();
		
			}
		
		
				 
		}
		
		
		
	}
	
	
	

