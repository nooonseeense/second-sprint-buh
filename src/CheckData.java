import java.util.ArrayList;
import java.util.HashMap;

public class CheckData {
    YearlyReportManager yearlyReportManager = new YearlyReportManager();
    MonthlyReportManager monthlyReportManager = new MonthlyReportManager();

    public void recordData(HashMap<Integer, ArrayList<MonthlyReportData>> monthData,
                           ArrayList<YearlyReportData> records) {
        if (monthData.size() == 0 || records.size() == 0) {
            System.out.println("SYSTEM: <ОТЧЕТЫ СЧИТАНЫ НЕУДАЧНО>");
        } else {
            yearlyReportManager.recordData(records);
            monthlyReportManager.recordData(monthData);
            System.out.println("SYSTEM: <ОТЧЕТЫ СЧИТАНЫ УСПЕШНО>");
        }
    }

    public void checkData(HashMap<Integer, Integer> sumIncomeMonth,
                          HashMap<Integer, Integer> sumExpenseMonth,
                          HashMap<Integer, Integer> sumIncomeYearly,
                          HashMap<Integer, Integer> sumExpenseYearly) {
        boolean isNone = false;
        for (Integer month : sumIncomeMonth.keySet()) {
            if (!(sumIncomeMonth.get(month).equals(sumIncomeYearly.get(month)))) {
                isNone = true;
                System.out.println("SYSTEM: <ДОХОДЫ В " + month + " МЕСЯЦЕ НЕСООТВЕТСТВУЮТ>");
            }
        }
        for (Integer month : sumExpenseMonth.keySet()) {
            isNone = true;
            if (!(sumExpenseMonth.get(month).equals(sumExpenseYearly.get(month)))) {
                System.out.println("SYSTEM: <РАСХОДЫ В " + month + " МЕСЯЦЕ НЕСООТВЕТСТВУЮТ>");
            }
        }
        if (!isNone) {
            System.out.println("SYSTEM: <НЕСООТВЕТСТВИЙ НЕОБНАРУЖЕНО>");
        }
    }
}
