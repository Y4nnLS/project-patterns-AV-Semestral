package Q1;

public abstract class OperationalReport {

    private final String name;

    protected OperationalReport(String name) {
        this.name = name;
    }

    public final void generate() {
        collectData();
        applyBusinessRules();
        formatReport();
        System.out.println("Relatório \"" + name + "\" gerado com sucesso.\n");
    }

    protected abstract void collectData();

    protected abstract void applyBusinessRules();

    protected abstract void formatReport();
}
