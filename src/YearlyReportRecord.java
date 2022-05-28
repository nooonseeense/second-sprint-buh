// Класс, который записывает в себя данные с годового отчета
class YearlyReportRecord {
    private int month;
    private int amount;
    private boolean isExpense;
    // Конструктор принимает значения и передает в поля класса
    public YearlyReportRecord(int month, int amount, boolean isExpense) {
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }
}