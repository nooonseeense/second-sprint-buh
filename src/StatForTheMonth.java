import java.util.ArrayList;
import java.util.HashMap;

public class StatForTheMonth {

    public void stat(HashMap<Integer, ArrayList<MonthlyReportData>> monthData) {
        if (monthData.size() == 0) {
            System.out.println("SYSTEM: <МЕСЯЧНЫЕ ОТЧЕТЫ НЕ СЧИТАНЫ>");
        } else {
            System.out.println("[!] Статистика по месяцам:");
            statCalculation(monthData);
        }
    }

    public void statCalculation(HashMap<Integer, ArrayList<MonthlyReportData>> monthData) {
        ArrayList<MonthlyReportData> listMonth;

        for (int month : monthData.keySet()) {
            String nameMaxIncome = " ";
            String nameMaxExpense = " ";
            int maxIncome = 0;
            int maxExpense = 0;
            listMonth = monthData.get(month);

            for (MonthlyReportData record : listMonth) {
                if (!record.isExpense) {
                    int sumIncome = record.quantity * record.sumOfOne;
                    if (sumIncome > maxIncome) {
                        maxIncome = sumIncome;
                        nameMaxIncome = record.itemName;
                    }
                } else {
                    int sumExpense = record.quantity * record.sumOfOne;
                    if (sumExpense > maxExpense) {
                        maxExpense = sumExpense;
                        nameMaxExpense = record.itemName;
                    }
                }
            }
            System.out.println("Статистика за месяц: " + nameMonth(month));
            System.out.println("Самый прибыльный товар " + nameMaxIncome + " на сумму: " + maxIncome + " рублей");
            System.out.println("Самая большая трата " + nameMaxExpense + " на сумму: " + maxExpense + " рублей\n");
        }
    }

    public String nameMonth(int month) {
        if (month == 1) {
            return "Январь";
        } else if (month == 2) {
            return "Февраль";
        }
        return "Март";
    }
}