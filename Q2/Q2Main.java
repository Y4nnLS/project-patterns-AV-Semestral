package Q2;

public class Q2Main {

    public static void main(String[] args) {
        ClientData client = new ClientData("João", 30, 200_000.0, 8_000.0, 0.8);

        RiskAnalyzer analyzer = new RiskAnalyzer(new AggressiveRiskStrategy());
        System.out.println("== Modelo agressivo ==");
        System.out.println(analyzer.analyze(client));

        System.out.println("\n== Modelo moderado ==");
        analyzer.setStrategy(new ModerateRiskStrategy());
        System.out.println(analyzer.analyze(client));

        System.out.println("\n== Modelo conservador ==");
        analyzer.setStrategy(new ConservativeRiskStrategy());
        System.out.println(analyzer.analyze(client));

    }
}
