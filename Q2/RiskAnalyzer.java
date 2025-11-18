package Q2;

public class RiskAnalyzer {

    private RiskCalculationStrategy strategy;

    public RiskAnalyzer(RiskCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RiskCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public RiskProfile analyze(ClientData client) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy de risco não configurada.");
        }
        return strategy.calculate(client);
    }
}
