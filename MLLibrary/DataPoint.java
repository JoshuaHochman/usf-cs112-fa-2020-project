public class DataPoint {
  public double f1;
  public double f2;
  public String label;
  public String type;

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
