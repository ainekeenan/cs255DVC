package asStatistics;

import javax.swing.JOptionPane;

public class TestStatistics {
	
	public static void main(String[] args) {
		
		String in, out;
		int d;
		double min, max, mean, median;
		double [] ogData, sData;
		
	
		in = JOptionPane.showInputDialog("Enter the Number of Data Values");
		d = Integer.parseInt(in);
		double[] inp = new double[d];
		
		
		for(int i=0;i<inp.length;i++) {
			
			in = JOptionPane.showInputDialog("Enter Data Value");
			inp[i] = Double.parseDouble(in);
		}
		
		Statistics data = new Statistics(inp);
		
		ogData= data.getOrigData();
		sData= data.getSortedData();
		min = data.findMin();
		max = data.findMax();
		mean = data.findMean();
		median = data.findMedian();
		
		out = "Original Data: \n";
		for(int i=0; i<ogData.length;i++){ 
			out = out + ogData[i] +" ";}
		out = out + "\n";
		out = out + "Sorted Data: \n";
		for(int i=0; i<sData.length;i++){
			out = out + sData[i] + " ";
		}
		out = out + "\n";
		out = out + "Min Value: " + min +"\n";
		out = out + "Max Value: " + max + "\n";
		out = out + "Mean:      " + mean + "\n";
		out = out + "Median:    " + median;
		
		JOptionPane.showMessageDialog(null, out);
		System.exit(0);
		

	}

}

