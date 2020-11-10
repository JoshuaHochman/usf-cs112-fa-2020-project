import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

public abstract class Model extends DataPoint {

	
	abstract void train(ArrayList<DataPoint> data);
	abstract String test(ArrayList<DataPoint> data);
	abstract Double getAccuracy(ArrayList<DataPoint> data);
	abstract Double getPrecision(ArrayList<DataPoint> data);

public class DummyModel extends Model {
	double difference = 0;
	double tempdifference = 0;
	int pointsnum = 0;
	double avgdif = 0;

	

	public void train(ArrayList<DataPoint> data) {
		

		for (int i = 0; i < data.size(); i++) {
			tempdifference = (data.get(i).getf1() - data.get(i).getf2());
			difference = (Math.abs(difference + tempdifference));
			pointsnum = data.size();
			avgdif = (difference/pointsnum);


         }
    }

    public String test(ArrayList<DataPoint> data) {
    	String te = "hi";
    	return te;
    	//if (difference)

    }


	public Double getAccuracy(ArrayList<DataPoint> data) {
		Double acc = 0.001;
		return acc;
		





	}

	public Double getPrecision(ArrayList<DataPoint> testData) {
		Double prec = 0.0099;
		return prec;
		

	}

}

}

