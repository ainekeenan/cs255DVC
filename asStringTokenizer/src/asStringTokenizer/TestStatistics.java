package asStringTokenizer;

import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class TestStatistics {

	public static void main(String[] args) {
		String in, out;
		double min, max, mean, median;
		double [] ogData, sData;
		
	
		in = JOptionPane.showInputDialog("Enter Data Values, seperated by commas");
		StringTokenizer cat = new StringTokenizer(in,",");
		int size = cat.countTokens();
		double[] inp = new double[size];
		
		for(int i=0; i<inp.length;i++) {
			String dog;
			dog = cat.nextToken();
			dog = dog.trim();
			inp[i] = Double.parseDouble(dog);
		}
		
		
		Statistics data = new Statistics(inp);
		
		ogData= data.getOrigData();
		sData= data.getSortedData();
		min = data.findMin();
		max = data.findMax();
		mean = data.findMean();
		median = data.findMedian();
		
		in = JOptionPane.showInputDialog("Enter the Number of Decimal Places to which the Computed Values are displayed:");
		int dec = Integer.parseInt(in);
		
		String pattern = "0.";
		for(int i=0; i< dec; i++) {
			pattern = pattern + "0";
		}
		
		
		DecimalFormat form = new DecimalFormat();
		form.applyPattern(pattern);
		
		
		double [] sDataTwo = Statistics.compSData(inp);
		double minTwo = Statistics.compMin(inp);
		double maxTwo = Statistics.compMax(inp);
		double meanTwo = Statistics.compMean(inp);
		double medianTwo = Statistics.compMedian(inp);
		
		int instanceCount = Statistics.count;
		
		
		
		
		out = "Original Data: \n";
		for(int i=0; i<ogData.length;i++){ 
			out = out + ogData[i] +" ";}
		out = out + "\n \n";
		
		out = out + "Results Using Instance Methods: \n \n";
		out = out + "Sorted Data: \n";
		for(int i=0; i<sData.length;i++){
			out = out + sData[i] + " ";
		}
		out = out + "\n";
		out = out + "Computed Values: \n";
		out = out + "Min Value: " + form.format(min) +"\n";
		out = out + "Max Value: " + form.format(max) + "\n";
		out = out + "Mean:      " + form.format(mean) + "\n";
		out = out + "Median:    " + form.format(median) +"\n";
		out = out + "\n";

		
		out = out + "Results Using Static Methods: \n \n";
		out = out + "Sorted Data: \n";
		for(int i=0; i<sDataTwo.length;i++){
			out = out + sDataTwo[i] + " ";
		}
		out = out + "\n";
		out = out + "Computed Values: \n";
		out = out + "Min Value:  " + form.format(minTwo) +"\n";
		out = out + "Max Value:  " + form.format(maxTwo) +"\n";
		out = out + "Mean Value:  " + form.format(meanTwo) +"\n";
		out = out + "Median Value:  " + form.format(medianTwo) +"\n \n";
		
		out = out + "The Total Number of Statistics objects created during execution: " +instanceCount;
		



		
		
		
		JOptionPane.showMessageDialog(null, out);
		System.exit(0);
		

	}

}

