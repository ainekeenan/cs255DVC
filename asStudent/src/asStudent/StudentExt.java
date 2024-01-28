package asStudent;

public class StudentExt extends Student{

	private String gradeType;
	
	public StudentExt(int iD, String n, double[] g, String gT) {
		super(iD,n,g);
		gradeType = gT;
	}
	
	
	public String findGrade() {
		String grade = super.findGrade();
		
		if(gradeType.equals("Credit")) {
			if(grade.equals("A")|| grade.equals("B")|| grade.equals("C")) {
				grade = "CR";
			} else {
				grade = "NCR";
				
			}
		} 
		
		return grade;
	}

}
