package asStudent;


public class Student {

	private int stuID;
	private String name;
	private double[] eScore;
	
	public Student(int iD, String n, double[] g) {
		stuID= iD;
		name =n;
		eScore= g;
		
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
	
}