package Q1;

public class DailyOperationalReport extends OperationalReport {

    public DailyOperationalReport() {
        super("Relatório Diário");
    }

    @Override
    protected void collectData() {
        System.out.println("[Diário] Coletando dados de entregas e ocorrências do dia...");
    }

    @Override
    protected void applyBusinessRules() {
        System.out.println("[Diário] Aplicando regras de priorização para SLA e atrasos críticos...");
    }

    @Override
    protected void formatReport() {
        System.out.println("[Diário] Formatando relatório em layout compacto (PDF A4, 1 página)...");
    }
}
