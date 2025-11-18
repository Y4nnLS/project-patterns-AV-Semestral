package Q1;

public abstract class ReportCreator {

    protected abstract OperationalReport createReport();

    public void run() {
        OperationalReport report = createReport();
        report.generate();
    }
}
