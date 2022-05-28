// Класс, который хранит в себе данные считанных месяцев из файлов
public class MonthlyReportRecord {
    private String itemName;
    private boolean isExpense; // Обозначает, является ли запись тратой (TRUE) или доходом (FALSE);
    private int quantity; // количество закупленного или проданного товара;
    private int sumOfOne; // стоимость одной единицы товара. Целое число.

    public MonthlyReportRecord(String itemName, boolean isExpense, int quantity, int sumOfOne) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }
}
