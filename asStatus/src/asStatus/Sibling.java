package asStatus;

import javax.swing.JOptionPane;

public class Sibling implements Status{

	private String name;
	private int age, weight;

	public Sibling(String n, int a, int w) {
		name = n;
		age = a;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getStatus() {
		String total = "Sibling \n Name = " +name +", Age = " +age + ", Weight= " +weight +"\n";
		return total;
	}
	
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
}

