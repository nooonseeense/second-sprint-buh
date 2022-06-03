import java.util.ArrayList;
import java.util.HashMap;

public class YearlyReportManager {
    ArrayList<YearlyReportData> records;
    HashMap<Integer, Integer> sumIncomeYearly = new HashMap<>();
    HashMap<Integer, Integer> sumExpenseYearly = new HashMap<>();

    public YearlyReportManager() {
        records = new ArrayList<>();
    }

    public void recordData(ArrayList<YearlyReportData> records) { // получил доступ к каждому полю записанному в каждый индекс
        for (YearlyReportData record : records) {
            if (record.isExpense) {
                sumExpenseYearly.put(record.month, record.amount);
            } else {
                sumIncomeYearly.put(record.month, record.amount);
            }
        }
    }
}
