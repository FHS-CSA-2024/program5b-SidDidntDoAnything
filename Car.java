public class Car {
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
     public Car () {
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
      }
      public Car (String name, double miles, double gallons) {
        carName = name;
        milesDriven = miles;
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
        double avg = Math.round((milesDriven/gallonsUsed) * 10) / 10.0;
        return avg;
        
      }
      public String toString() {
        String total = carName + " averaged " + milesDriven / gallonsUsed + " m/g";
        return total;
    }
    }
