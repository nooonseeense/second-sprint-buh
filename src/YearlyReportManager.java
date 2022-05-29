import java.util.ArrayList;
import java.util.HashMap;

class YearlyReportManager {
    public HashMap<Integer, ArrayList<YearlyReportData>> yearlyData = new HashMap<>();
    public ArrayList<YearlyReportData> records = new ArrayList<>(); // теперь здесь 6 строк данных из листа

    public void add(YearlyReportData record) {
        records.add(record);
    }
}
