package asLeapDay;

import javax.swing.JOptionPane;

public class TestLeapDay {

	public static void main(String[] args) {
		String in, out;

		int dayValue, monthValue, yearValue, dayNum;

		in = JOptionPane.showInputDialog("Enter the day");

		dayValue = Integer.parseInt(in);

		in = JOptionPane.showInputDialog("Enter the month");

		monthValue = Integer.parseInt(in);

		in = JOptionPane.showInputDialog("Enter the year");

		yearValue = Integer.parseInt(in);
		
		LeapDay leapd1 = new LeapDay(dayValue, monthValue, yearValue);
		
		dayNum = leapd1.findDayNum();
		

		out = "Day Number for " + monthValue + "/" + dayValue + " is " + dayNum + " \n";
		
		
		JOptionPane.showMessageDialog(null, out);
		

	}

}
