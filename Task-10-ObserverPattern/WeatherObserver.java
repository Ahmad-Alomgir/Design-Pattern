// Observer
interface WeatherObserver {
    void update(double temperature);
}

// Concrete Observers
class WeatherDisplay implements WeatherObserver {
    @Override
    public void update(double temperature) {
        System.out.println("Weather Display: Temperature has changed to " + temperature +"\n");
    }
}

class HVACController implements WeatherObserver {
    @Override
    public void update(double temperature) {
        if (temperature > 30) {
            System.out.println("HVAC System: It's hot! Turning on the air conditioning.\n");
        } else if (temperature < 16) {
            System.out.println("HVAC System: It's cold! Turning on the heater.\n");
        } else {
            System.out.println("HVAC System: Temperature is comfortable.\n");
        }
    }
}
