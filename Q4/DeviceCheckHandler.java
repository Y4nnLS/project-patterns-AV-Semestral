package Q4;

public class DeviceCheckHandler extends FraudCheckHandler {

    @Override
    protected FraudCheckResult check(Transaction tx) {
        if (tx.isNewDevice()) {
            return new FraudCheckResult(false, "Dispositivo não reconhecido: " + tx.getDeviceId());
        }
        System.out.println("[DeviceCheck] Dispositivo reconhecido: " + tx.getDeviceId());
        return new FraudCheckResult(true, "Dispositivo conhecido");
    }
}
