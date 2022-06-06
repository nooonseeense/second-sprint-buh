import java.util.ArrayList;
import java.util.HashMap;

public class MonthlyReportManager {
    HashMap<Integer, ArrayList<MonthlyReportData>> monthData;
    HashMap<Integer, Integer> sumIncomeMonth = new HashMap<>();
    HashMap<Integer, Integer> sumExpenseMonth = new HashMap<>();

    public MonthlyReportManager() {
        monthData = new HashMap<>();
    }

    public void recordData(HashMap<Integer, ArrayList<MonthlyReportData>> monthData) {
        ArrayList<MonthlyReportData> dataListMonth;

        for (int month : monthData.keySet()) {
            int sumIncome = 0;
            int sumExpense = 0;
            dataListMonth = monthData.get(month);

            for (MonthlyReportData record : dataListMonth) {
                if (record.isExpense) {
                    sumExpense += record.quantity * record.sumOfOne;
                } else {
                    sumIncome += record.quantity * record.sumOfOne;
                }
            }
            sumIncomeMonth.put(month, sumIncome);
            sumExpenseMonth.put(month, sumExpense);
        }
    }
}
