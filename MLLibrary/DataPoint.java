public class DataPoint {
  public int pclass;
  public int survived;
  public String name;
  public String gender;
  public double f1;
  public double f2;

  public DataPoint(int pcparam, int sparam, String nparam, String gparam, double f1Param, double f2Param) {
    this.pclass = pcparam;
    this.survived = sparam;
    this.name = nparam;
    this.gender = gparam;
    this.f1 = f1Param;
    this.f2 = f2Param;
  }

  public DataPoint() {
    this(0, 0, "", "", 0, 0);
  }

  public TestDataPoint(double f1Param, double f2Param) {
    this.f1 = f1Param;
    this.f2 = f2Param;
  }

  public int getPlcass() {
    return this.plcass;
  }

  public int getSurvived() {
    return this.survived;
  }

  public String getName() {
    return this.name;
  }

  public String getGender() {
    return this.gender;
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

/*
  public void setLabel(String label) {
    this.label = label;
  }


  public void setType(String type) {
    this.type = type;
  }

  public String toString() {
    return "(" + this.f1 + "," + this.f2 + "," + this.label + "," + this.type + ")";

  }
  */
}
