package asLeapDay;

import javax.swing.JOptionPane;

public class Day {
	
	private int dayValue;
	protected int monthValue;
	
	public Day(int dayValue, int monthValue) {
		this.dayValue = dayValue;
		this.monthValue = monthValue;
	}
	
	public int getDayValue() {
		return dayValue;
	}
	
	public int getMonthValue() {
		return monthValue;
	}
	
	
	public int findDayNum() {
		int day= 0;
		switch(monthValue) {
		case 1:
			day = dayValue;
			break;
		case 2:
			day = 31 + dayValue;
			break;
			
		case 3: 
			day = 31+ 28+ dayValue;
			break;
			
		case 4: 
			day = 31+ 28+ 31+ dayValue;
			break;
			
		case 5: 
			day = 31+ 28+ 31 + 30+ dayValue;
			break;
			
		case 6:
			day = 31+ 28+ 31 + 30+ 31+ dayValue;
			break;
		
		case 7:
			day = 31+ 28+ 31 + 30+ 31 + 30+ dayValue;
			break;
		
		case 8:
			day = 31+ 28+ 31 + 30+ 31 +30 + 31+ dayValue;
			
			break;
			
		case 9: 
			day = 31+ 28+ 31 + 30+ 31+ 30+31 +31 + dayValue;
			break;
			
		case 10: 
			day = 31+ 28+ 31 + 30+ 31+ 30+ 31+31+30 + dayValue;
			break;
		
		case 11: 
			day = 31+ 28+ 31 + 30+ 31+ 30+ 31+31+30 + 31+ dayValue;
			break;
		
		case 12: 
			day = 31+ 28+ 31 + 30+ 31+ 30+ 31+31+30 + 31 + 30+ dayValue;
			break;
		
			
		default:
			JOptionPane.showMessageDialog(null, "Month is not Valid"); 
			
	}
	
		return day;
	}

}
