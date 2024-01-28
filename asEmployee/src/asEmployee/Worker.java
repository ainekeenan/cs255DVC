package asEmployee;

public class Worker extends Employee{

	protected double pctBonus;
	
	public Worker(String n, double s, double pB) {
		super (n, s);
		pctBonus = pB;
}
	
	public double getPctBonus() {
		return pctBonus;
	}


	public double computeBonus() {
		double bonus = salary * pctBonus;
		return bonus;
	}
}
