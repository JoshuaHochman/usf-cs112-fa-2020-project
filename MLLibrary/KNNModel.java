import java.util.*;
import java.util.ArrayList;
import java.lang.Math;

public class KNNModel extends Model {
	private ArrayList<DataPoint> trainSet;
	private int k;
	private int survivors = 0;
	private int notsurvivors = 0;
	public double x1 = 0;
	public double x2 = 0;
	public double y1 = 0;
	public double y2 = 0;
	public double distance = 0;
	public int asum = 0;
	public int anothersum = 0;
	public int truePositive = 0;
	public int falsePositive = 0;
	public int falseNegative = 0;
	public int trueNegative = 0;
	public double accuracy = 0;
	public double precision = 0;

	public KNNModel(int kparam) {
		this.k = kparam;
		ArrayList<DataPoint> trainSet = new ArrayList<DataPoint>();

	}

	private double getDistance(DataPoint p1, DataPoint p2) {
		
		x1 = p1.getf1();
		x2 = p1.getf2();
		y1 = p2.getf1();
		y2 = p2.getf2();
		double xdis = (x1 - x2);
		double xdissqr = (xdis * xdis);
		double ydis = (y1 - y2);
		double ydissqr = (ydis * ydis);
		double inside = (xdissqr + ydissqr);
		double distance = (Math.sqrt(inside));
		return distance;


	}

	public void train(ArrayList<DataPoint> dataPoints) {
		for (int i = 0; i < dataPoints.size(); i++) {
			if (dataPoints.get(i).getType() == "train") {
				trainSet.add(dataPoints.get(i));
				if (dataPoints.get(i).getLabel() == "0") {
					notsurvivors += 1;
				} else if (dataPoints.get(i).getLabel() == "1") {
					survivors += 1;
				}
			}
		}

	}

	public String test(DataPoint dataPoint) {
		Double[][] array = new Double[trainSet.size()][2];
		if (dataPoint.getType() == "test") {
			for (int j = 0; j < trainSet.size(); j++) {
				double distance = getDistance(dataPoint, trainSet.get(j));
				String alabel = trainSet.get(j).getLabel();
				array[j][0] = distance;
				array[j][1] = Double.valueOf(alabel);



				
			}
			
		}
		java.util.Arrays.sort(array, new java.util.Comparator<Double[]>() {
			public int compare(Double[] a, Double [] b) {
				return a[0].compareTo(b[0]);
			}
		});
		for (int j = 0; j < k; j++) {
			if(array[j][1] == 1) {
				survivors++;
			} else {
				notsurvivors++;
			}
			
			
		}
		if (survivors > notsurvivors) {
			return "1";
		} else {
			return "0";
		}





	}

	public Double getAccuracy(ArrayList<DataPoint> dataPoints) {

		for (int i = 0; i < dataPoints.size(); i++) {
			if (dataPoints.get(i).getType() == "test") {
				String val = test(dataPoints.get(i));
				if (val == "1") {
					if (dataPoints.get(i).getLabel() == "1") {
						truePositive++;
					} else if (dataPoints.get(i).getLabel() == "0") {
						falsePositive++;
					}
				} else if (val == "0") {
					if (dataPoints.get(i).getLabel() == "1") {
						falseNegative++;
					} else if (dataPoints.get(i).getLabel() == "0") {
						trueNegative++;
					}
				}
			}

		}
		accuracy = ((truePositive + trueNegative)/(truePositive + trueNegative + falsePositive + falseNegative));
		return accuracy;

	}

	public Double getPrecision(ArrayList<DataPoint> dataPoints) {
		for (int i = 0; i < dataPoints.size(); i++) {
			if (dataPoints.get(i).getType() == "test") {
				String val = test(dataPoints.get(i));
				if (val == "1") {
					if (dataPoints.get(i).getLabel() == "1") {
						truePositive++;
					} else if (dataPoints.get(i).getLabel() == "0") {
						falsePositive++;
					}
				} else if (val == "0") {
					if (dataPoints.get(i).getLabel() == "1") {
						falseNegative++;
					} else if (dataPoints.get(i).getLabel() == "0") {
						trueNegative++;
					}
				}
			}

		}
		precision = ((truePositive)/(truePositive + falseNegative));
		return precision;

	}

}




















