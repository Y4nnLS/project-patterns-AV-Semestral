package Q1;

public class DailyReportCreator extends ReportCreator {

    @Override
    protected OperationalReport createReport() {
        return new DailyOperationalReport();
    }
}
