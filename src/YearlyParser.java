import java.util.ArrayList;

public class YearlyParser {
    FileReader reader = new FileReader();

    void yearParser(ArrayList<YearlyReportData> records) {
        String content = reader.readFileContentsOrNull("resources/y.2021.csv"); // Передаем в функцию путь до файла
        String[] lines = content.split("\n"); // данные, которые вернулись из функции сохраняем в массив и режем на строки

        for (int i = 1; i < lines.length; i++) { // Проходимся по массиву строк
            String line = lines[i]; // Сохраняем всю строку в переменную String
            String[] parts = line.split(","); // Сохраняем в массив разрезанную строку
            int month = Integer.parseInt(parts[0]);
            int amount = Integer.parseInt(parts[1]);
            boolean isExpense = Boolean.parseBoolean(parts[2]);

            YearlyReportData yearReportData = new YearlyReportData(month, amount, isExpense); // создаем объект и передаем данные
            records.add(yearReportData);
        }
        System.out.println("SYSTEM: <ГОДОВОЙ ОТЧЕТ СЧИТАН>\n");
    }
}
