package Q2;

public class ConservativeRiskStrategy implements RiskCalculationStrategy {

    @Override
    public RiskProfile calculate(ClientData client) {
        double base = client.getRiskTolerance() * 0.3
                + (client.getMonthlyIncome() / Math.max(1, client.getAge())) * 0.004
                + (client.getTotalAssets() * 0.000002);

        double score = Math.min(base, 1.0);
        return new RiskProfile("CONSERVADOR", score);
    }
}
