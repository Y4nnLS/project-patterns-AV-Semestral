package Q4;

public class FraudCheckResult {
    private final boolean approved;
    private final String reason;

    public FraudCheckResult(boolean approved, String reason) {
        this.approved = approved;
        this.reason = reason;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return (approved ? "APROVADA" : "NEGADA") + " - " + reason;
    }
}
