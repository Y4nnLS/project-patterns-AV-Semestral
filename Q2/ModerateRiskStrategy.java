package Q2;

public class ModerateRiskStrategy implements RiskCalculationStrategy {

    @Override
    public RiskProfile calculate(ClientData client) {
        double base = client.getRiskTolerance() * 0.5
                + (client.getMonthlyIncome() / Math.max(1, client.getAge())) * 0.008
                + (client.getTotalAssets() * 0.000005);

        double score = Math.min(base, 1.0);
        return new RiskProfile("MODERADO", score);
    }
}
