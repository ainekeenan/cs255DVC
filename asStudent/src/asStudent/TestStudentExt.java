package asStudent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class TestStudentExt {

	public static void main(String[] args) throws Exception {

		String in;
		String outA = "", outB = "", outC = "", outD = "", outF = "", outCR = "", outNCR = "", outAll = "";
		int n;

		BufferedReader br = new BufferedReader(new FileReader("in.txt"));

		in = br.readLine();

		n = Integer.parseInt(in);

		StudentExt[] st = new StudentExt[n];

		String[] student = new String[n];

		for (int i = 0; i < student.length; i++) {
			student[i] = br.readLine();
		}

		String token;

		for (int i = 0; i < student.length; i++) {

			StringTokenizer stu = new StringTokenizer(student[i], ",");

			token = stu.nextToken().trim();

			int id = Integer.parseInt(token);
			String name = stu.nextToken().trim();

			token = stu.nextToken().trim();
			int numOfTest = Integer.parseInt(token);

			double[] eScore = new double[numOfTest];

			for (int j = 0; j < eScore.length; j++) {
				token = stu.nextToken().trim();
				eScore[j] = Double.parseDouble(token);

			}

			String gradeType = stu.nextToken().trim();

			st[i] = new StudentExt(id, name, eScore, gradeType);
		}

		String grade = "";

		for (int i = 0; i < st.length; i++) {
			grade = st[i].findGrade();
			if (grade.equals("A")) {
				outA = outA + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			} else if (grade.equals("B")) {
				outB = outB + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			} else if (grade.equals("C")) {
				outC = outC + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			} else if (grade.equals("D")) {
				outD = outD + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			} else if (grade.equals("F")) {
				outF = outF + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			} else if (grade.equals("CR")) {
				outCR = outCR + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			} else if (grade.equals("NCR")) {
				outNCR = outNCR + st[i].getStuID() + " " + st[i].getname() + " " + "(" + grade + ")\n";
			}

		}
		outAll = outA + outB + outC + outD + outF + outCR + outNCR;

		PrintWriter pw = new PrintWriter(new FileWriter("outAll.txt"));

		pw.print(outAll);
		pw.flush();

		if (br != null)
			br.close();

		if (pw != null)
			pw.close();
	}

}
