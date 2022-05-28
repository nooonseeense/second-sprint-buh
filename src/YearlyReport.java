import java.util.ArrayList;
// Класс для работы с годовым отчетом
class YearlyReport {
    ArrayList<YearlyReportRecord> records = new ArrayList<>();

    public void add(YearlyReportRecord record) { // Метод, который записывает данные в лист
        records.add(record);
    }
    public void infoInTheReport() {
        System.out.println(records);
    }
}
