package Q4;

public class UserHistoryCheckHandler extends FraudCheckHandler {

    @Override
    protected FraudCheckResult check(Transaction tx) {
        if (tx.getUserScore() < 300) {
            return new FraudCheckResult(false, "Usuário com histórico de risco (score=" + tx.getUserScore() + ")");
        }
        System.out.println("[UserHistoryCheck] Usuário confiável (score=" + tx.getUserScore() + ")");
        return new FraudCheckResult(true, "Histórico de usuário aceitável");
    }
}
