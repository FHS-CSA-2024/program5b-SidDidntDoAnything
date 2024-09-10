public class Car {
private String carName = "";
private double mileDriven = 0;
private double gallonsUsed = 0;
    
  public Car () {
    carName = "";
    milesDriven = 0;
    gallonsUsed = 0;
      }
  
  public Car (String name, double miles, double gallons) {
    carName = name;
    mileDriven = miles;
    gallonsUsed = gallons;
  }

  public String getName(){
    return carName;
  }

  public double getMiles() {
    return milesDriven;
  }

  public double getGallons() {
    return gallonsUsed;
  }

  public double calculateAverage() {
    double avg = Math.round(mileDriven/gallonsUsed * 10.0) / 10.0;
    return avg;
  }

  public String toString() {
    String total = carName + " averaged " + milesDriven + " m/g";
    return total;
}
}

