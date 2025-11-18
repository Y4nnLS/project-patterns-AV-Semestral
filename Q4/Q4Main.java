package Q4;

import java.util.Set;

public class Q4Main {

    public static void main(String[] args) {
        FraudCheckHandler amountCheck = new AmountCheckHandler(5_000.0);
        FraudCheckHandler geoCheck = new GeoLocationCheckHandler(Set.of("NK", "IR"));
        FraudCheckHandler userHistoryCheck = new UserHistoryCheckHandler();
        FraudCheckHandler deviceCheck = new DeviceCheckHandler();

        amountCheck.setNext(geoCheck)
                .setNext(userHistoryCheck)
                .setNext(deviceCheck);

        Transaction tx1 = new Transaction("TX1", 1_000.0, "BR", "user123", 700, "dev-01", false);
        Transaction tx2 = new Transaction("TX2", 10_000.0, "BR", "user123", 700, "dev-01", false);
        Transaction tx3 = new Transaction("TX3", 2_000.0, "NK", "user123", 700, "dev-01", false);
        Transaction tx4 = new Transaction("TX4", 2_000.0, "BR", "user456", 200, "dev-01", false);
        Transaction tx5 = new Transaction("TX5", 2_000.0, "BR", "user789", 800, "dev-02", true);

        System.out.println("== Transação 1 ==");
        System.out.println(amountCheck.handle(tx1));

        System.out.println("\n== Transação 2 ==");
        System.out.println(amountCheck.handle(tx2));

        System.out.println("\n== Transação 3 ==");
        System.out.println(amountCheck.handle(tx3));

        System.out.println("\n== Transação 4 ==");
        System.out.println(amountCheck.handle(tx4));

        System.out.println("\n== Transação 5 ==");
        System.out.println(amountCheck.handle(tx5));

    }
}
