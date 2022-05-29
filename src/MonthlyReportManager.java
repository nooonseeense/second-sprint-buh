import java.util.ArrayList;
import java.util.HashMap;

class MonthlyReportManager {
    public HashMap<Integer, ArrayList<MonthlyReportData>> monthlyData = new HashMap<>();
    public ArrayList<MonthlyReportData> records = new ArrayList<>();

    public void add(MonthlyReportData record) {
        records.add(record);
    }
}
