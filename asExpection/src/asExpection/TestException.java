package asExpection;

import javax.swing.JOptionPane;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
 
	while(true) {	String ID = JOptionPane.showInputDialog("Enter ID Num");
		
		if(ID.equalsIgnoreCase("0")) {
			 JOptionPane.showMessageDialog(null,"Bye");
             return;
		}
		
		String name = JOptionPane.showInputDialog("Enter Name");
		String out;
		try {
			validateID(ID);
			out = "Validated ID: " + ID +"\n";
			JOptionPane.showMessageDialog(null, out);
			validateName(name);
			out = "Validated Name: " +name +"\n";
			JOptionPane.showMessageDialog(null, out);
			
			
		} catch(IdNotAWholeNumberException e){
			out = "" + e.getMessage();
			JOptionPane.showMessageDialog(null, e);
			
		} catch (IdOutOfRangeException e) {
			out = "" + e.getMessage();
			JOptionPane.showMessageDialog(null, e);
		
		} catch ( NotSpecifiedException e) {
			out = "" + e.getMessage();
			JOptionPane.showMessageDialog(null, e);
		} catch (NotAlphabeticException e) {
			out = "" + e.getMessage();
			JOptionPane.showMessageDialog(null, e);
		}
		
		
		
		}} 
		
	
	public static void validateID (String ID) throws IdNotAWholeNumberException, IdOutOfRangeException {
		int num; 
		
		try {
			
			num = Integer.parseInt(ID);
			
		} catch(NumberFormatException e) {
			
			throw new IdNotAWholeNumberException();
		
			}
	
	if(num<1 ||  num> 999) {
		throw new IdOutOfRangeException();
	}
	}
	
	
	public static void validateName(String name) {
		String empName = name;
		
		if(empName.equalsIgnoreCase("")) {
			throw new NotSpecifiedException();
			
		} else if (!name.matches("[a-zA-Z]+")) {
			throw new NotAlphabeticException();
			
		}
		
		
	}
	
}
