package Q3;

public class Q3Main {

    public static void main(String[] args) {
        Sensor sensorCentro = new Sensor("Centro");

        SensorObserver painel = new ControlPanelObserver();
        SensorObserver alertas = new AlertModuleObserver();
        SensorObserver historico = new HistoryLoggerObserver();

        sensorCentro.registerObserver(painel);
        sensorCentro.registerObserver(alertas);
        sensorCentro.registerObserver(historico);

        System.out.println("== Nova leitura 1 ==");
        sensorCentro.newReading(29.5, 60.0, 120.0);

        System.out.println("\n== Nova leitura 2 ==");
        sensorCentro.newReading(36.0, 55.0, 180.0);

    }
}
