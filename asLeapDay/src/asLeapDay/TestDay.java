package asLeapDay;

import javax.swing.JOptionPane;

public class TestDay {

	public static void main(String[] args) {
	
		String in, out;
		
		int dayValue, monthValue, yearValue, dayNum;
		
		in = JOptionPane.showInputDialog("Enter the day");
		
		dayValue = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog("Enter the month");
		
		monthValue = Integer.parseInt(in);
		
		in = JOptionPane.showInputDialog("Enter the year");
		
		yearValue = Integer.parseInt(in);
		
		Day day1 = new Day(dayValue, monthValue);
		
		dayNum= day1.findDayNum();
		
		if(((yearValue % 4 ==0) && (yearValue % 100) != 0) || ((yearValue % 400) == 0)) {
			if (monthValue > 2) {
				dayNum = dayNum + 1;
			}
				
			}
		
		
		
		out = "Day Number for " + monthValue + "/" + dayValue + " is " + dayNum + " \n";
		
		
		JOptionPane.showMessageDialog(null, out);
		
	}

	}

