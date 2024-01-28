package asEmployee;

public class Manager extends Employee{

	protected double pctBonus;
	protected double travelExpense;
	
	public Manager(String n, double s, double pB, double tE) {
		super(n,s);
		pctBonus = pB;
		travelExpense = tE;
	}

	
	public double getPctBonus() {
		return pctBonus;
	}
	
	public double getTravelExpense() {
		return travelExpense;
	}
	
	
	public double computeBonus() {
		double bonus = (salary * pctBonus) + 500.00;
		return bonus;
	}
	
	

}
