import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

public abstract class Model extends DataPoint {

	public double maxf1Label = 0;
	public double maxf1Type = 0;
	public double maxf2Label = 0;
	public double maxf2Type = 0;

	abstract void train(ArrayList<DataPoint> trainData);
	abstract String test(ArrayList<DataPoint> data);
	abstract Double getAccuracy(ArrayList<DataPoint> data);
	abstract Double getPrecision(ArrayList<DataPoint> data);

public class DummyModel extends Model {

		private double maxf1Label1 = 0;
		private double maxf1Label2 = 0;
		private double maxf1Type1 = 0;
		private double maxf1Type2 = 0;
		private double maxf2Label1 = 0;
		private double maxf2Label2 = 0;
		private double maxf2Type1 = 0;
		private double maxf2Type2 = 0;

	public void train(ArrayList<DataPoint> trainData) {
		double maxf1Label1 = 0;
		double maxf1Label2 = 0;
		double maxf1Type1 = 0;
		double maxf1Type2 = 0;
		double maxf2Label1 = 0;
		double maxf2Label2 = 0;
		double maxf2Type1 = 0;
		double maxf2Type2 = 0;

		for (int i = 0; i < trainData.size(); i++) {
			if (trainData.get(i).getLabel() == "American") {
				if (trainData.get(i).getf1() > maxf1Label1) {
					maxf1Label1 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Label1) {
					maxf2Label1 = trainData.get(i).getf2();
				}
			}

			if (trainData.get(i).getLabel() == "Japanese") {
				if (trainData.get(i).getf1() > maxf1Label2) {
					maxf1Label2 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Label2) {
					maxf2Label2 = trainData.get(i).getf2();
				}
			}

			if (trainData.get(i).getType() == "Action") {
				if (trainData.get(i).getf1() > maxf1Type1) {
					maxf1Type1 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Type1) {
					maxf2Type1 = trainData.get(i).getf2();
				}
			}

			if (trainData.get(i).getType() == "Strategy") {
				if (trainData.get(i).getf1() > maxf1Type2) {
					maxf1Type2 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Type2) {
					maxf2Type2 = trainData.get(i).getf2();
				}
			}

		
		this.maxf1Label1 = maxf1Label;
		this.maxf1Label2 = maxf1Label2;
		this.maxf1Type1 = maxf1Type1;
		this.maxf1Type2 = maxf1Type2;
		this.maxf2Label1 = maxf2Label1;
		this.maxf2Label2 = maxf2Label2;
		this.maxf2Type1 = maxf2Type1;
		this.maxf1Type2 = maxf1Type2;
	}
	}
	

	

	public String test(ArrayList<DataPoint> data) {
		ArrayList<DataPoint> testData = new ArrayList<DataPoint>();
		testData.set(0, data.get(0));

		if ((Math.abs(testData.get(getf1())) - this.maxf1Label1) > Math.abs(testData.get(getf1()) - this.maxf1Label2)) {
			if (Math.abs(testData.get(getf1())) - this.maxf1Type1 > Math.abs(testData.get(getf1()) - this.maxf1Type2)) {
				return "Japanese Strategy";
			} else if (Math.abs(testData.get(getf1())) - this.maxf1Type2 > Math.abs(testData.get(getf1()) - this.maxf1Type1)) {
				return "Japanese Action";
			}
		} else if ((Math.abs(testData.get(getf1())) - this.maxf1Label2) > Math.abs(testData.get(getf1()) - this.maxf1Label1)) {
			if (Math.abs(testData.get(getf1())) - this.maxf1Type1 > Math.abs(testData.get(getf1()) - this.maxf1Type2)) {
				return "American Strategy";
			} else if (Math.abs(testData.get(getf1())) - this.maxf1Type2 > Math.abs(testData.get(getf1()) - this.maxf1Type1)) {
				return "American Action";
			}
		}
	}


	public Double getAccuracy(ArrayList<DataPoint> testData) {
		return 3.2;





	}

	public Double getPrecision(ArrayList<DataPoint> testData) {
		return 4.1;

	}

}

}

