import java.util.ArrayList;
import java.util.HashMap;

public class MonthParser {
    FileReader reader = new FileReader();

    void monthParser(HashMap<Integer, ArrayList<MonthlyReportData>> monthData) {
        for (int month = 1; month <= 3; month++) {
            String content = reader.readFileContentsOrNull("resources/m.20210" + month + ".csv");
            String[] lines = content.split("\n");
            ArrayList<MonthlyReportData> records = new ArrayList<>();

            for (int i = 1; i < lines.length; i++) {
                String line = lines[i].trim();
                String[] parts = line.split(",");
                String itemName = parts[0];
                boolean isExpense = Boolean.parseBoolean(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                int sumOfOne = Integer.parseInt(parts[3]);

                MonthlyReportData monthlyReportData = new MonthlyReportData(itemName, isExpense, quantity, sumOfOne);
                records.add(monthlyReportData);
            }
            monthData.put(month, records);
        }
        System.out.println("SYSTEM: <МЕСЯЧНЫЕ ОТЧЕТЫ СЧИТАНЫ>\n");
    }
}
