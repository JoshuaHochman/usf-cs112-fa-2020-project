import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

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

		for (int i = 0; i < trainData.size; i++) {
			if (trainData.get(i).getLabel() == "FirstLabel") {
				if (trainData.get(i).getf1() > maxf1Label1) {
					maxf1Label1 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Label1) {
					maxf2Label1 = trainData.get(i).getf2();
				}
			}

			if (trainData.get(i).getLabel() == "SecondLabel") {
				if (trainData.get(i).getf1() > maxf1Label2) {
					maxf1Label2 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Label2) {
					maxf2Label2 = trainData.get(i).getf2();
				}
			}

			if (trainData.get(i).getType() == "FirstType") {
				if (trainData.get(i).getf1() > maxf1Type1) {
					maxf1Type1 = trainData.get(i).getf1();
				}
				if (trainData.get(i).getf2() > maxf2Type1) {
					maxf2Type1 = trainData.get(i).getf2();
				}
			}

			if (trainData.get(i).getType() == "SecondType") {
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
		this.maxf2Label1 = maxf2Label;
		this.maxf2Label2 = maxf2Label2;
		this.maxf2Type1 = maxf2Type1;
		this.maxf2Type2 = maxf2Type2;
	}
	}
	

	

	public String test(ArrayList<DataPoint> data) {
		ArrayList<DataPoint> testData = data.get(0);

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

