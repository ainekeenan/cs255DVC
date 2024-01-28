package asEmployee;

import javax.swing.JOptionPane;

public class TestEmployee {

	public static void main(String[] args) {
		
		String in;
		int numWork, numMan, numExec;
		int employIndex =0;
		String name;
		double salary, pctBonus, travelExpense, optionsCount, bonus;
		
		
		in = JOptionPane.showInputDialog("Enter number of Workers");
		numWork= Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog("Enter number of Managers");
		numMan= Integer.parseInt(in);

		in = JOptionPane.showInputDialog("Enter number of Executives");
		numExec= Integer.parseInt(in);
		
		
		int totalE = numWork+ numMan + numExec;
		
		Employee[] employees = new Employee[totalE];
		
		for(int i =0; i<numWork; i++) {
			name = JOptionPane.showInputDialog("Enter name of Worker");
			in = JOptionPane.showInputDialog("Enter salary of Worker");
			salary = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter percent bonus of Worker");
			pctBonus = Double.parseDouble(in);
			Worker cat = new Worker(name, salary, pctBonus);
			employees[employIndex]= cat;
			employIndex++;
		}
		

		for(int i =0; i<numMan; i++) {
			name = JOptionPane.showInputDialog("Enter name of Manager");
			in = JOptionPane.showInputDialog("Enter salary of Manager");
			salary = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter percent bonus of Manager");
			pctBonus = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter travel expense of Manager");
			travelExpense = Double.parseDouble(in);
			Manager dog = new Manager(name, salary, pctBonus, travelExpense);
			employees[employIndex]= dog;
			employIndex++;
		}
		

		for(int i =0; i<numExec; i++) {
			name = JOptionPane.showInputDialog("Enter name of Executive");
			in = JOptionPane.showInputDialog("Enter salary of Executive");
			salary = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter percent bonus of Executive");
			pctBonus = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter travel expense of Executive");
			travelExpense = Double.parseDouble(in);
			in = JOptionPane.showInputDialog("Enter options count of Executive");
			optionsCount= Double.parseDouble(in);
			Executive horse = new Executive(name, salary, pctBonus, travelExpense, optionsCount);
			employees[employIndex]= horse;
			employIndex++;
		}
		
		String outAll = "";
		String outW="";
		String outM="";
		String outE="";
		
		for(int i=0; i<employees.length;i++) {
			name = employees[i].getName();
			salary = employees[i].getSalary();
			bonus = employees[i].computeBonus();
			
			if(employees[i] instanceof Worker) {
				pctBonus = ((Worker)employees[i]).getPctBonus();
				outW= outW + "Name: " +name + "\n";
				outW= outW+ "Yearly Salary: " +salary + "\n";
				outW = outW + "Percent Bonus: " +pctBonus + "\n";
				outW = outW + "Total Bonus: " +bonus +"\n \n";
			} else if (employees[i] instanceof Manager) {
				pctBonus = ((Manager)employees[i]).getPctBonus();
				travelExpense = ((Manager)employees[i]).travelExpense;
				outM= outM + "Name: " +name + "\n";
				outM= outM+ "Yearly Salary: " +salary + "\n";  
				outM = outM + "Percent Bonus: " +pctBonus + "\n";
				outM = outM + "Total Bonus: " +bonus +"\n";
				outM = outM + "Travel Expense: " + travelExpense + "\n \n";
			} else if (employees[i] instanceof Executive) {
				pctBonus = ((Executive)employees[i]).getPctBonus();
				travelExpense = ((Executive)employees[i]).travelExpense;
				optionsCount = ((Executive)employees[i]).optionsCount;
				outE= outE + "Name: " +name + "\n";
				outE= outE+ "Yearly Salary: " +salary + "\n";  
				outE = outE + "Percent Bonus: " +pctBonus + "\n";
				outE = outE + "Total Bonus: " +bonus +"\n";
				outE = outE + "Travel Expense: " + travelExpense + "\n";
				outE = outE + "Options Count: " +optionsCount +"\n \n";
			}
		
			
			
		}
		outAll = outW +outM +outE;
		
		JOptionPane.showMessageDialog(null, outAll);
		
	}
	

}
