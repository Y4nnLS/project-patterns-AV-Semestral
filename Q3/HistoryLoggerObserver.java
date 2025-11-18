package Q3;

public class HistoryLoggerObserver implements SensorObserver {

    @Override
    public void update(SensorReading reading) {
        System.out.printf("[Histórico] Registrando leitura da região %s (T=%.1f, U=%.1f, P=%.2f)%n",
                reading.getRegion(), reading.getTemperature(), reading.getHumidity(), reading.getPollutionIndex());
    }
}
