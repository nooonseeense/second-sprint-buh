import java.util.ArrayList;
import java.util.HashMap;

public class MonthlyReportManager {
    public HashMap<Integer, ArrayList<MonthlyReportData>> monthData; // ВСЕ ДАННЫЕ СОХРАНЕНЫ ТУТ
    public ArrayList<Integer> incomeMonth = new ArrayList<>(); // СЮДА сохраняем доходы за месяц
    public ArrayList<Integer> spendingMonth = new ArrayList<>(); // СЮДА сохраняем траты за месяц

    public MonthlyReportManager() {
        monthData = new HashMap<>();
    }


}
