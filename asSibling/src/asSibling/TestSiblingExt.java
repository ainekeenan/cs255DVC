package asSibling;

import javax.swing.JOptionPane;

public class TestSiblingExt {

	public static void main(String[] args) {
	String in, out, name;
	
	int age, weight, height;
	
	SiblingExt sibext1, sibext2, sibext3;
	
	name = JOptionPane.showInputDialog("Enter the first siblings name!");
	in = JOptionPane.showInputDialog("Enter their age (in years)");
	age = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter their weight (in pounds)");
	weight = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter their height (in inches)");
	height = Integer.parseInt(in);
	
	sibext1 = new SiblingExt (name, age, weight, height);
	
	name = JOptionPane.showInputDialog("Enter the second siblings name!");
	in = JOptionPane.showInputDialog("Enter their age");
	age = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter their weight");
	weight = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter their height");
	height = Integer.parseInt(in);
	
	sibext2 = new SiblingExt (name, age, weight, height);
	
	name = JOptionPane.showInputDialog("Enter the third siblings name!");
	in = JOptionPane.showInputDialog("Enter their age");
	age = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter their weight");
	weight = Integer.parseInt(in);
	in = JOptionPane.showInputDialog("Enter their height");
	height = Integer.parseInt(in);
	
	sibext3 = new SiblingExt (name, age, weight, height);
	
	SiblingExt youngest = null , lightest=null , tallest =null;

	
	
	if(sibext1.getAge()< sibext2.getAge() && sibext1.getAge() < sibext3.getAge()) {
		youngest = sibext1;
	} else if(sibext2.getAge()< sibext3.getAge() && sibext2.getAge() < sibext1.getAge()) {
		youngest = sibext2;
	} else {
		youngest = sibext3;
	}
	
	

if(sibext1.getWeight()< sibext2.getWeight() && sibext1.getWeight() < sibext3.getWeight()) {
		lightest = sibext1;
	} else if(sibext2.getWeight()< sibext3.getWeight() && sibext2.getWeight() < sibext1.getWeight()) {
		lightest = sibext2;
	} else {
		lightest = sibext3;
	}


if(sibext1.getHeight() > sibext2.getHeight() && sibext1.getHeight() > sibext3.getHeight()) {
	tallest = sibext1;
} else if (sibext2.getHeight() > sibext1.getHeight() && sibext2.getHeight() > sibext3.getHeight()) {
	tallest = sibext2;
} else {
	tallest = sibext3;
}



out = "The Youngest Sibling: " + youngest.getName() +" " + youngest.getAge() +" " + youngest.getWeight() +" " + youngest.getHeight() + " \n";

out = out + "The Lightest Sibling: " + lightest.getName() + " " + lightest.getAge() +" " + lightest.getWeight() + " " + lightest.getHeight() + "\n";

out = out + "The Tallest Sibling: " + tallest.getName() +" " + tallest.getAge() +" " + tallest.getWeight() +" " + tallest.getHeight() +" \n";


JOptionPane.showMessageDialog(null, out);

System.exit(0);
	

	}

}
