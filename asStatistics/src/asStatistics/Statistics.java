
package asStatistics;

import java.util.Arrays;

public class Statistics {

	private double[] data;
	private double[] sdata;


public Statistics(double[] d){
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
	double total =0;
	for(int i=0;i<sdata.length;i++) {
		total= total+ sdata[i];
	}
	return total/sdata.length;
}

public double findMedian() {
	double median;
	int high, low;
	if((sdata.length % 2) != 0) {
		median = sdata[(sdata.length-1)/2];
		return median;
	} else {
		high = sdata.length/2;
		low = high -1;
		median= (sdata[low] + sdata[high])/2;
		return median;
	}
}


}
