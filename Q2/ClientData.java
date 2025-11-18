package Q2;

public class ClientData {
    private final String name;
    private final int age;
    private final double totalAssets;
    private final double monthlyIncome;
    private final double riskTolerance; // 0.0 (baixa) a 1.0 (alta)

    public ClientData(String name, int age, double totalAssets, double monthlyIncome, double riskTolerance) {
        this.name = name;
        this.age = age;
        this.totalAssets = totalAssets;
        this.monthlyIncome = monthlyIncome;
        this.riskTolerance = riskTolerance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getTotalAssets() {
        return totalAssets;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double getRiskTolerance() {
        return riskTolerance;
    }
}
