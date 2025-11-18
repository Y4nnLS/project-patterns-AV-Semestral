package Q1;

public class Q1Main {

    public static void main(String[] args) {
        ReportCreator dailyCreator = new DailyReportCreator();
        ReportCreator weeklyCreator = new WeeklyReportCreator();

        System.out.println("=== Gerando relatório diário ===");
        dailyCreator.run();

        System.out.println("=== Gerando relatório semanal ===");
        weeklyCreator.run();
    }
}
