import java.util.ArrayList;
// Класс для работы с месячными отчетами
class MonthlyReport {
    ArrayList<MonthlyReportRecord> records = new ArrayList<>(); // Строка с итеррацией хранится здесь

    public void add(MonthlyReportRecord record) {
        records.add(record);
    }

    public void infoInTheReport() {

        System.out.println(records.get(0));
    }
}

