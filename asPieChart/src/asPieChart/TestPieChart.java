package asPieChart;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestPieChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in = JOptionPane.showInputDialog("Input sales: N,S,W,E,MidW");
		StringTokenizer cat = new StringTokenizer(in,",");
		
		
		
		PieChart meow = new PieChart(Integer.parseInt(cat.nextToken()),Integer.parseInt(cat.nextToken()), Integer.parseInt(cat.nextToken()), Integer.parseInt(cat.nextToken()), Integer.parseInt(cat.nextToken()));
		meow.setVisible(true);
		meow.setSize(500, 650);
	}

}
