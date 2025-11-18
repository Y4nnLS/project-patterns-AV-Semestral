package Q4;

public abstract class FraudCheckHandler {

    private FraudCheckHandler next;

    public FraudCheckHandler setNext(FraudCheckHandler next) {
        this.next = next;
        return next;
    }

    public FraudCheckResult handle(Transaction tx) {
        FraudCheckResult result = check(tx);
        if (!result.isApproved()) {
            return result;
        }
        if (next != null) {
            return next.handle(tx);
        }
        return result;
    }

    protected abstract FraudCheckResult check(Transaction tx);
}
