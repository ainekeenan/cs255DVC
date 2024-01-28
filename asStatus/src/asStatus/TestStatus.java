package asStatus;

import javax.swing.JOptionPane;

public class TestStatus {

	public static void main(String args[]) {
		
	String in, name;
	String out = "";
	double len, wid;
	int age, weight, iD, testNum;

	Status[] stat = new Status[6];

	for(int i = 0;i<3;i++){
		in = JOptionPane.showInputDialog("Enter length");
		len = Double.parseDouble(in);
		in = JOptionPane.showInputDialog("Enter Width");
		wid = Double.parseDouble(in);
		Rectangle rect = new Rectangle(len, wid);
		stat[i] = rect;

	}

	for(int j = 0;j<2;j++){
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter age");
		age = Integer.parseInt(in);
		in = JOptionPane.showInputDialog("Enter weight");
		weight = Integer.parseInt(in);
		Sibling sib = new Sibling(name, age, weight);
		stat[j + 3] = sib;
	}

	for(int k = 0;k<1;k++){
		in = JOptionPane.showInputDialog("Enter ID number");
		iD = Integer.parseInt(in);
		name = JOptionPane.showInputDialog("Enter name");
		in = JOptionPane.showInputDialog("Enter how many tests");
		testNum = Integer.parseInt(in);
		double[] scores = new double[testNum];
		for (int l = 0; l < scores.length; l++) {
			in = JOptionPane.showInputDialog("Enter test score");
			scores[l] = Double.parseDouble(in);
		}
		Student cat = new Student(iD, name, scores);
		stat[k + 5] = cat;
	}

	for (int m = 0; m<stat.length; m++) {
		stat[m].displayStatus();
	}
	
	for(int n = 0;n<stat.length;n++){
		out= out +stat[n].getStatus();

	}
	
	JOptionPane.showMessageDialog(null, out);
	

}
}
