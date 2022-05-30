import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileParser parser = new FileParser();
        YearlyReportManager yearlyReportManager = new YearlyReportManager();

        System.out.println("Добро пожаловать в «Автоматизация бухгалтерии [Build 1.0]»!");
        while (true) {
            printMenu();
            switch (scanner.nextInt()) {
                case 1:
                    parser.monthParser();
                    break;
                case 2:
                    parser.yearParser();
                    break;
                case 3:

                    System.out.println("SYSTEM: <ОПЕРАЦИЯ УСПЕШНО ВЫПОЛНЕНА>");
                    break;
                case 4:
                    // method
                    break;
                case 5:
                    yearlyReportManager.infoAboutTheYearlyReport();
                    break;
                case 1703:
                    scanner.close();
                    return;
                default:
                    System.out.println("SYSTEM: <ТАКОЙ КОМАНДЫ НЕ СУЩЕСТВУЕТ>\n");
            }
        }
    }
    private static void printMenu() {
        System.out.println(
                "Выберите команду из списка и нажмите Enter:\n" +
                "[1] Считать все месячные отчёты\n" +
                "[2] Считать годовой отчёт\n" +
                "[3] Сверить отчёты\n" +
                "[4] Вывести информацию о всех месячных отчётах\n" +
                "[5] Вывести информацию о годовом отчёте"
        );
    }
}