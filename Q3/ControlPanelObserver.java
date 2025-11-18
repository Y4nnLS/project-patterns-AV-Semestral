package Q3;

public class ControlPanelObserver implements SensorObserver {

    @Override
    public void update(SensorReading reading) {
        System.out.printf("[Painel] Região %s -> T: %.1f°C, U: %.1f%%, Poluição: %.2f%n",
                reading.getRegion(), reading.getTemperature(), reading.getHumidity(), reading.getPollutionIndex());
    }
}
