import java.io.File;
import java.util.ArrayList;

public class YearlyParser {

    void yearParser(ArrayList<YearlyReportData> records) {
        String content = FileReader.readFileContentsOrNull("resources" + File.separator + "y.2021.csv");
        if (content == null) {
            System.out.println(" ");
            return;
        } else {
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
        }
        System.out.println("SYSTEM: <ГОДОВОЙ ОТЧЕТ СЧИТАН>\n");
    }
}
