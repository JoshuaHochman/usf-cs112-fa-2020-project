import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

public abstract class KNNModel extends Model {
	private ArrayList<DataPoint> trainSet;
	private int k;
	private int survivors = 0;
	private int notsurvivors = 0;
	public double x1 = 0;
	public double x2 = 0;
	public double y1 = 0;
	public double y2 = 0;


	public KNNModel(int kparam) {
		this.k = kparam;
		ArrayList<DataPoint> trainSet = new ArrayList<DataPoint>();

	}

	private double getDistance(DataPoint p1, DataPoint p2) {
		
		p1.getf1() = x1;


	}


}

