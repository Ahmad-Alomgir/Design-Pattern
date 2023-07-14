public class Main {
    public static void main(String[] args) {
        // Creating objects

        Vehicle vehicle = new Vehicle("Car");
        Car car = new Car("Audi", 5);

        // Accessing variables and methods

        System.out.println("This vehicle is " + vehicle.brand);
        vehicle.run();

        System.out.println("This Car model is " + car.brand);

        car.drive();
    }
}