import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.lang.Math;



public class DataPoint {
  public double f1;
  public double f2;
  public String label;
  public String type;


  public List<String> getRecordFromLine(String line) {
    List<String> values = new ArrayList<String>();
    try (Scanner rowScanner = new Scanner(line)) {
      rowScanner.useDelimiter(",");
      while (rowScanner.hasNext()) {
        values.add(rowScanner.next());
      }
    }
    return values;
  }

  public List<DataPoint> TitanicScan() {
    List<DataPoint> dataPoints = new ArrayList<DataPoint>();

    try (Scanner scanner = new Scanner(new File("titanic.csv"))) {
      while (scanner.hasNextLine()) {
        List<String> records = getRecordFromLine(scanner.nextLine());
        DataPoint point = new DataPoint(Double.valueOf(records.get(5)), Double.valueOf(records.get(6)), records.get(1), "");
        dataPoints.add(point);




      

      }
    // TODO: Select the columns from the records and create a DataPoint object
    // TODO: Store the DataPoint object in a collection
    } catch (Exception e) {
      System.out.println("Runtime Error");
    }
    return dataPoints;
  }


  public void SplitData(DataPoint datapoint) {
    Random rand = new Random();
    double randNum = rand.nextDouble();
    // 90% of the data is reserved for training
    if (randNum < 0.9) {
      datapoint.setType("train");
      

    // Set the type of DataPoint as “train” and put into the Collection

    } else {
      datapoint.setType("test");
    // Set the type of DataPoint as “test” and put into the Collection
    }
  }


  public DataPoint(double f1Param, double f2Param, String label, String type) {
    this.f1 = f1Param;
    this.f2 = f2Param;
    this.label = label;
    this.type = type;
  }

  public DataPoint() {
    this(0, 0, "", "");
  }




  

  public String getLabel() {
    return this.label;
  }

  public String getType() {
    return this.type;
  }

  public double getf2() {
    return this.f2;
  }

  public double getf1() {
    return this.f1;
  }

  public void setf1(double val) {
    f1 = val;
  }


  public void setf2(double val) {
    f2 = val;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public void setType(String type) {
    this.type = type;
  }

  public String toString() {
    return "(" + this.f1 + "," + this.f2 + "," + this.label + "," + this.type + ")";

  }







}





