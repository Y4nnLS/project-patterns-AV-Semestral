package Q2;

public class AggressiveRiskStrategy implements RiskCalculationStrategy {

    @Override
    public RiskProfile calculate(ClientData client) {
        double base = client.getRiskTolerance() * 0.7
                + (client.getMonthlyIncome() / Math.max(1, client.getAge())) * 0.01
                + (client.getTotalAssets() * 0.00001);

        double score = Math.min(base, 1.0);
        return new RiskProfile("AGRESSIVO", score);
    }
}
