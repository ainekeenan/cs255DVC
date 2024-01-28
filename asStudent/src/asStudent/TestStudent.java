package asStudent;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStudent {

	public static void main(String[] args) {
	
		String in;
		String outA="", outB="", outC="", outD="", outF="", outAll="";
		int n;
		
		in = JOptionPane.showInputDialog("Enter how many students:");
		n = Integer.parseInt(in);
	
		
		Student[] st = new Student[n];
		String token;
		
		
		for(int i=0; i<st.length;i++) {
			in = JOptionPane.showInputDialog("Enter ID of student, name, and number of tests, grades; seperated by commas");
			StringTokenizer	stu = new StringTokenizer(in,",");
			
			token = stu.nextToken().trim();
			
			int id = Integer.parseInt(token);
			String name= stu.nextToken().trim();
			
			token = stu.nextToken ().trim();
			int numOfTest= Integer.parseInt(token);
			
			double[] eScore = new double[numOfTest];
			
			for(int j= 0; j< eScore.length;j++) {
				token = stu.nextToken ().trim();
				eScore[j] = Double.parseDouble(token);
	
			}
			
			st[i] = new Student(id, name, eScore);
		}
		
		for(int i=0; i<st.length; i++) {
			if(st[i].findGrade().equals("A")) {
				outA= outA+ st[i].getStuID() + " " +st[i].getname()+ " " +st[i].findGrade() + "\n";
			} else if(st[i].findGrade().equals("B")) {
				outB= outB+ st[i].getStuID() + " " +st[i].getname()+ " " +st[i].findGrade()+ "\n";
			} else if(st[i].findGrade().equals("C")) {
				outC= outC+ st[i].getStuID() + " " +st[i].getname() + " " +st[i].findGrade() +"\n";
			}else if(st[i].findGrade().equals("D")) {
				outD= outD+ st[i].getStuID()+ " " +st[i].getname()+ " " +st[i].findGrade() +"\n";
			} else {
				outF = outF + st[i].getStuID() + " " + st[i].getname() + " " +st[i].findGrade() +"\n";
			}
			
		}
		outAll= outA+outB+outC+outD+outF;
		
		JOptionPane.showMessageDialog(null, outAll);
		
		System.exit(0);

	}

}
