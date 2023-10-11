public class Main {
    public static void main(String[] args) {
        // Create observable (subject)
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Create observers (components)
        WeatherObserver weatherDisplay = new WeatherDisplay();
        WeatherObserver hvacController = new HVACController();

        // Register observers with the observable
        temperatureSensor.addObserver(weatherDisplay);
        temperatureSensor.addObserver(hvacController);

        // Simulate a change in temperature
        temperatureSensor.setTemperature(25.5);
        temperatureSensor.setTemperature(45.5);
        temperatureSensor.setTemperature(10.5);
    }
}
