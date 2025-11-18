package Q1;

public class WeeklyReportCreator extends ReportCreator {

    @Override
    protected OperationalReport createReport() {
        return new WeeklyOperationalReport();
    }
}
