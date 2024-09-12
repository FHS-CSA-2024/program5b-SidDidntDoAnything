public CarTester {
  public static void main(String[] args) {
    CarTester test = new CarTester();
    test.AddCar();
    car.calculateAverage();
    car.toString();
    
    
   
  }
 
  public Car AddCar() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the car's name: ");
    String name = sc.nextString();
    System.out.println("\nPlease enter cars miles: ");
    double miles = sc.nextDouble();
    System.out.print("\nPlease enter cars gallons: ");
    double gallons = sc.nextDouble();
    Car car = new Car(name, miles, gallons);
    return car;
  }
    
