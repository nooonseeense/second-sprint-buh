public class MonthParser {
    FileReader reader = new FileReader();

    void monthParser() {
        MonthlyReportManager monthlyReportManager = new MonthlyReportManager();

        for (int month = 1; month <= 3; month++) {
            String content = reader.readFileContentsOrNull("resources/m.20210" + month + ".csv");
            String[] lines = content.split("\n");

            for (int i = 1; i < lines.length; i++) {
                String line = lines[i].trim();
                String[] parts = line.split(",");
                String itemName = parts[0];
                boolean isExpense = Boolean.parseBoolean(parts[1]);
                int quantity = Integer.parseInt(parts[2]);
                int sumOfOne = Integer.parseInt(parts[3]);

                MonthlyReportData monthlyReportData = new MonthlyReportData(itemName, isExpense, quantity, sumOfOne);
                monthlyReportManager.records.add(monthlyReportData);
            }
            monthlyReportManager.monthData.put(month, monthlyReportManager.records);
        }
        System.out.println("SYSTEM: <МЕСЯЧНЫЕ ОТЧЕТЫ СЧИТАНЫ>\n");
    }
}
