class FileParser {
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
    void yearParser() {
        YearlyReportManager yearlyReportManager = new YearlyReportManager();
        String content = reader.readFileContentsOrNull("resources/y.2021.csv"); // Передаем в функцию путь до файла
        String[] lines = content.split("\n"); // данные, которые вернулись из функции сохраняем в массив и режем на строки

        for (int i = 1; i < lines.length; i++) { // Проходимся по массиву строк
            String line = lines[i]; // Сохраняем всю строку в переменную String
            String[] parts = line.split(","); // Сохраняем в массив разрезанную строку
            int month = Integer.parseInt(parts[0]);
            int amount = Integer.parseInt(parts[1]);
            boolean isExpense = Boolean.parseBoolean(parts[2]);

            YearlyReportData yearReportData = new YearlyReportData(month, amount, isExpense); // создаем объект и передаем данные
            yearlyReportManager.records.add(yearReportData);
        }
        System.out.println("SYSTEM: <ГОДОВОЙ ОТЧЕТ СЧИТАН>\n");
    }
}
