import java.util.Scanner;
public class CarTester {
  public static void main(String[] args) {
    for (int i = 0; i<2; i++) {
    System.out.println();
    CarTester test = new CarTester();
    Car car = test.AddCar(); 
    System.out.println("\n" + car.toString()); 
  }
  }
  public Car AddCar() {
    Scanner sca = new Scanner(System.in);
    System.out.println("Please enter the car's name: ");
    String name = sca.nextLine();
    System.out.println("\nPlease enter cars miles: ");
    double miles = sca.nextDouble();
    System.out.print("\nPlease enter cars gallons: ");
    double gallons = sca.nextDouble();
    Car car = new Car(name, miles, gallons);
    return car;
  }
}
