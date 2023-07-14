// Child class inheriting from Vehicle
class Car extends Vehicle {
  int number;

  public Car(String brand, int number) {
    super(brand);
    this.number = number;
  }

  public void drive() {
    System.out.println("Driving the " + brand + "  with " + number + " Person.");
  }
}
