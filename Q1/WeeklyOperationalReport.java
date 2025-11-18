package Q1;

public class WeeklyOperationalReport extends OperationalReport {

    public WeeklyOperationalReport() {
        super("Relatório Semanal");
    }

    @Override
    protected void collectData() {
        System.out.println("[Semanal] Coletando dados agregados dos últimos 7 dias...");
    }

    @Override
    protected void applyBusinessRules() {
        System.out.println("[Semanal] Calculando médias, tendências e indicadores de capacidade...");
    }

    @Override
    protected void formatReport() {
        System.out.println("[Semanal] Formatando relatório com seções de gráficos e tabelas detalhadas...");
    }
}
