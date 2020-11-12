import java.util.Random;
import java.io.File;
import java.util.Scanner;
import java.util.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {

	


	//ArrayList<DataPoint> 

	private static void initAndShowGUI() {
    	
	
			JFrame frame = new JFrame("Project");
       		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
			Container pane = frame.getContentPane();
			pane.setLayout(new GridLayout(2, 2));
        	frame.pack();
        	frame.setVisible(true);

			pane.add(new JButton("Accuracy below"));
			pane.add(new JButton("Precision below"));
			pane.add(new JButton(theaccuracy));
			pane.add(new JButton(theprecision));
		
	

			frame.pack();
			frame.setVisible(true);
	}

	/*
	public static List<String> getRecordFromLine(String line) {
    List<String> values = new ArrayList<String>();
    try (Scanner rowScanner = new Scanner(line)) {
      rowScanner.useDelimiter(",");
      while (rowScanner.hasNext()) {
        values.add(rowScanner.next());
      }
    }
    return values;
  	}

  	*/

  	/*
	public static List<DataPoint> TitanicScan() {
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

 	*/


  public static void SplitData(DataPoint datapoint) {
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

	public static void main(String[] args) {

		ArrayList<DataPoint> dataPoints = new ArrayList<DataPoint>();
		try (Scanner scanner = new Scanner(new File("titanic.csv"))) {
			while (scanner.hasNextLine()) {
				ArrayList<String> records = getRecordFromLine(scanner.nextLine());
				DataPoint point = new DataPoint(Double.valueOf(records.get(5)), Double.valueOf(records.get(6)), records.get(1), "");
				 dataPoints.add(point);
			}
		} catch (Exception e) {
			System.out.println("Runtime Error");
		} finally {
			for (int i; i < dataPoints.size(); i++)	{
				SplitData(dataPoints.get(i));

			}
		}
		KNNModel theModel = new KNNModel(60);
		dataPoints.train(dataPoints);
		Double theaccuracy = getAccuracy(dataPoints);
		Double theprecision = getPrecision(dataPoints);

		SwingUtilities.invokeLater(
          new Runnable() { public void run() { initAndShowGUI(); } }
        );

		
		

	
    }




  	}

		

	














