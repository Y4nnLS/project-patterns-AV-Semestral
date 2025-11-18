package Q3;

public class SensorReading {
    private final String region;
    private final double temperature;
    private final double humidity;
    private final double pollutionIndex;

    public SensorReading(String region, double temperature, double humidity, double pollutionIndex) {
        this.region = region;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pollutionIndex = pollutionIndex;
    }

    public String getRegion() {
        return region;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPollutionIndex() {
        return pollutionIndex;
    }
}
