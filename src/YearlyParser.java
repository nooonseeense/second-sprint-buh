import java.util.ArrayList;

public class YearlyParser {
    FileReader reader = new FileReader();

    void yearParser(ArrayList<YearlyReportData> records) {
        String content = reader.readFileContentsOrNull("resources/y.2021.csv");
        String[] lines = content.split("\n");

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i].trim();
            String[] parts = line.split(",");
            int month = Integer.parseInt(parts[0]);
            int amount = Integer.parseInt(parts[1]);
            boolean isExpense = Boolean.parseBoolean(parts[2]);

            YearlyReportData yearReportData = new YearlyReportData(month, amount, isExpense);
            records.add(yearReportData);
        }
        System.out.println("SYSTEM: <ГОДОВОЙ ОТЧЕТ СЧИТАН>\n");
    }
}
