package asLeapDay;

public class LeapDay extends Day{

	private int yearValue;
	
	public LeapDay(int dayValue, int monthValue, int yearValue) {
		super(dayValue, monthValue);
		this.yearValue = yearValue;
	}

	public int getYearValue() {
		return yearValue;
	}
	
	public int findDayNum() {
		int dayNum = super.findDayNum();
		if(((yearValue % 4 ==0) && (yearValue % 100) != 0) || ((yearValue % 400) == 0)) {
			if (monthValue > 2) {
				dayNum = dayNum + 1;
			}
	}
		return dayNum;
	}
	
	
	
}
