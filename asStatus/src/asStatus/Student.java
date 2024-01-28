package asStatus;

import javax.swing.JOptionPane;

public class Student implements Status{

	private int stuID;
	private String name;
	private double[] eScore;
	
	public Student(int iD, String n, double[] g) {
		stuID= iD;
		name =n;
		eScore= new double[g.length];
		System.arraycopy(g,0,eScore,0,g.length);
		
	}
	
	public String findGrade() {
		String grade;
		double sum = 0;
		double av;
		
		for(int i=0;i<eScore.length;i++) {
			sum = sum + eScore[i];
		}
		
		av = sum/eScore.length;
		
		if(av>= 90.00) {
			grade = "A";
		} else if(av>= 80.00) {
			grade = "B";
		} else if(av>= 70.00) {
			grade = "C";
		} else if(av>= 60.00) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
	
	public int getStuID() {
		return stuID;
	}
	
	public String getname() {
		return name;
	}
	
	public String getStatus() {
		String total = "Student \n ID = " +stuID +", name = " +name + ", Scores = ";
		for (int i =0; i<eScore.length; i++) {
			total = total + eScore[i] +" ";
		}
		total = total +"\n";
		return total;
	}
	
	public void displayStatus() {
		String status = getStatus();
		JOptionPane.showMessageDialog(null, status);
	}
}
