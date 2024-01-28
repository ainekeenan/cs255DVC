package asEmployee;

public class Executive extends Employee{

	protected double pctBonus;
	protected double travelExpense;
	protected double optionsCount;
	
	public Executive(String n, double s, double pB, double tE, double oC) {
		super(n,s);
		pctBonus = pB;
		travelExpense = tE;
		optionsCount = oC;
	}

	public double getPctBonus() {
		return pctBonus;
	}
	
	public double getTravelExpense() {
		return travelExpense;
	}
	
	public double getOptionsCount() {
		return optionsCount;
	}
	
	public double computeBonus() {
		double bonus = (salary *pctBonus) +1000;
		return bonus;
	}
	
	
	

}
