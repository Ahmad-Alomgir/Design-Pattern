public class Main {
    public static void main(String[] args) {

        Vehicle.Car car = new Vehicle.Car();
        car.setPrice(15.00);
        car.start();
        car.stop();

        Vehicle.Aeroplane aeroplane = new Vehicle.Aeroplane();
        aeroplane.setPrice(1000);
        aeroplane.start();
        aeroplane.fly();
        aeroplane.stop();
    }
}
