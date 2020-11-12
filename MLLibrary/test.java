import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.lang.Math;

public class test {
  private static List<String> getRecordFromLine(String line) {
    List<String> values = new ArrayList<String>();
    try (Scanner rowScanner = new Scanner(line)) {
      rowScanner.useDelimiter(",");
      while (rowScanner.hasNext()) {
          values.add(rowScanner.next());
        
        //values.add(rowScanner.next())
      }
    }
    return values;
  }


    



     
      
    // TODO: Select the columns from the records and create a DataPoint object
    // TODO: Store the DataPoint object in a collection
  

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(new File("titanic.csv"))) {
      while (scanner.hasNextLine()) {
        List<String> records = getRecordFromLine(scanner.nextLine());

        //records.set(5, Double.valueOf(records.get(5)));
        System.out.println(records.get(1) * 1);
        //System.out.println(scanner.nextLine());
      }
    }
    catch (Exception e) {
      System.out.println("Runtime Error");
    }

    


  



  }
}




  