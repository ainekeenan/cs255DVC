package asStringTokenizer;

import java.util.Arrays;

public class Statistics {
	private double[] data;
	private double[] sdata;
	
	public static int count =0;

	public Statistics(double[] d) {
		count = count +1;
		data = d.clone();
		sdata = d.clone();
		Arrays.sort(sdata);

	}

	public double[] getOrigData() {
		return data;
	}

	public double[] getSortedData() {
		return sdata;
	}

	public double findMin() {
		return sdata[0];
	}

	public double findMax() {
		return sdata[sdata.length - 1];
	}

	public double findMean() {
		double total = 0;
		for (int i = 0; i < sdata.length; i++) {
			total = total + sdata[i];
		}
		return total / sdata.length;
	}

	public double findMedian() {
		double median;
		int high, low;
		if ((sdata.length % 2) != 0) {
			median = sdata[(sdata.length - 1) / 2];
			return median;
		} else {
			high = sdata.length / 2;
			low = high - 1;
			median = (sdata[low] + sdata[high]) / 2;
			return median;
		}
	}
	
	public static double[] compSData(double [] data){
		double [] sdata = data.clone();
		Arrays.sort(sdata);
		return sdata;
	}
	
	public static double compMin(double[] data){
		Arrays.sort(data);
		double min = data[0];
		return min;
	}
	
	public static double compMax(double[] data) { 
		Arrays.sort(data);
		double max = data[data.length-1];
		return max;
	}
	
	public static double compMean(double[] data) {
		Arrays.sort(data);
		double sum = 0;
		for(int i=0; i<data.length; i++) {
			sum = sum +data[i];
		}
		double mean = sum/data.length;
		return mean;
	}
	
	public static double compMedian(double[] data) {
		Arrays.sort(data);
		double median;
		int high, low;
		if ((data.length % 2) != 0) {
			median = data[(data.length - 1) / 2];
			return median;
		} else {
			high = data.length / 2;
			low = high - 1;
			median = (data[low] + data[high]) / 2;
			return median;
		}
	}
	
	

}

