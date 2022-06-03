import java.util.ArrayList;
import java.util.HashMap;

public class MonthlyReportManager {
    HashMap<Integer, ArrayList<MonthlyReportData>> monthData; // ВСЕ ДАННЫЕ СОХРАНЕНЫ ТУТ
    HashMap<Integer, Integer> sumIncomeMonth = new HashMap<>();
    HashMap<Integer, Integer> sumExpenseMonth = new HashMap<>();

    public MonthlyReportManager() {
        monthData = new HashMap<>();
    }

    public void recordData(HashMap<Integer, ArrayList<MonthlyReportData>> monthData) {
        ArrayList<MonthlyReportData> dataListMonth;

        for (int month : monthData.keySet()) { // Проходимся по КЛЮЧАМ(МЕСЯЦЫ) хеш-таблицы
            int sumIncome = 0;
            int sumExpense = 0;
            dataListMonth = monthData.get(month); // записываем в лист все значения KEY(month)

            for (MonthlyReportData record : dataListMonth) { // идем по всем значением в листе
                if (record.isExpense) { // проверяем ТРАТА ЛИ
                    sumExpense += record.quantity * record.sumOfOne;// если да, то прибавляем
                } else {
                    sumIncome += record.quantity * record.sumOfOne;// в ином случае записываем в трату
                }
            }
            sumIncomeMonth.put(month, sumIncome);
            sumExpenseMonth.put(month, sumExpense);
        }
    }
}
