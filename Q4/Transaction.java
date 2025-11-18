package Q4;

public class Transaction {
    private final String id;
    private final double amount;
    private final String country;
    private final String userId;
    private final int userScore;
    private final String deviceId;
    private final boolean newDevice;

    public Transaction(String id, double amount, String country, String userId, int userScore, String deviceId,
            boolean newDevice) {
        this.id = id;
        this.amount = amount;
        this.country = country;
        this.userId = userId;
        this.userScore = userScore;
        this.deviceId = deviceId;
        this.newDevice = newDevice;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getCountry() {
        return country;
    }

    public String getUserId() {
        return userId;
    }

    public int getUserScore() {
        return userScore;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isNewDevice() {
        return newDevice;
    }
}
