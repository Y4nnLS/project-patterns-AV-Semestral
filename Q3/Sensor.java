package Q3;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private final String id;
    private final List<SensorObserver> observers = new ArrayList<>();
    private SensorReading lastReading;

    public Sensor(String id) {
        this.id = id;
    }

    public void registerObserver(SensorObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SensorObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (SensorObserver observer : observers) {
            observer.update(lastReading);
        }
    }

    public void newReading(double temperature, double humidity, double pollutionIndex) {
        this.lastReading = new SensorReading(id, temperature, humidity, pollutionIndex);
        notifyObservers();
    }
}
