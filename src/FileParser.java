public class FileParser {
    SimpleFileReader reader = new SimpleFileReader();
    MonthlyReport monthReport = new MonthlyReport();
    YearlyReport yearReport = new YearlyReport();

    void monthParser() {
        for (int i = 1; i <= 3; i++) {
        String content = reader.readFileContentsOrNull("resources/m.20210" + i + ".csv");
        String[] lines = content.split("\n");

            for (int j = 1; j < lines.length; j++) {
                String line = lines[j];
                String[] parts = line.split(",");

                String itemName = parts[0];
                boolean isExpense = Boolean.parseBoolean(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                int sumOfOne = Integer.parseInt(parts[3]);

                MonthlyReportRecord record = new MonthlyReportRecord(itemName, isExpense, quantity, sumOfOne);
                monthReport.add(record);
            }
        }
    }
    void yearParser() {
        String content = reader.readFileContentsOrNull("resources/y.2021.csv");
        String[] lines = content.split("\n");

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] parts = line.split(",");

            int month = Integer.parseInt(parts[0]);
            int amount = Integer.parseInt(parts[1]);
            boolean isExpense = Boolean.parseBoolean(parts[2]);

            YearlyReportRecord record = new YearlyReportRecord(month, amount, isExpense);
            yearReport.add(record);
        }
    }
}
