package Q3;

public class AlertModuleObserver implements SensorObserver {

    @Override
    public void update(SensorReading reading) {
        if (reading.getPollutionIndex() > 150.0) {
            System.out.printf("[Alerta] Poluição muito alta na região %s! Índice: %.2f%n",
                    reading.getRegion(), reading.getPollutionIndex());
        }
        if (reading.getTemperature() > 35.0) {
            System.out.printf("[Alerta] Temperatura elevada na região %s! T: %.1f°C%n",
                    reading.getRegion(), reading.getTemperature());
        }
    }
}
