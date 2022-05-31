import java.util.ArrayList;
import java.util.HashMap;

class MonthlyReportManager {
    public HashMap<Integer, ArrayList<MonthlyReportData>> monthData = new HashMap<>();
    public ArrayList<MonthlyReportData> records;

    public MonthlyReportManager() {
        records = new ArrayList<>();
    }
}
