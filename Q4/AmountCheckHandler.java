package Q4;

public class AmountCheckHandler extends FraudCheckHandler {

    private final double maxAllowed;

    public AmountCheckHandler(double maxAllowed) {
        this.maxAllowed = maxAllowed;
    }

    @Override
    protected FraudCheckResult check(Transaction tx) {
        if (tx.getAmount() > maxAllowed) {
            return new FraudCheckResult(false, "Valor muito alto para o perfil: " + tx.getAmount());
        }
        System.out.println("[AmountCheck] OK para valor " + tx.getAmount());
        return new FraudCheckResult(true, "Valor dentro do limite");
    }
}
