public class MonthlyReportData { // Класс, который хранит в себе данные считанных месяцев из файлов
    String itemName;
    boolean isExpense; // Обозначает, является ли запись тратой (TRUE) или доходом (FALSE);
    int quantity; // количество закупленного или проданного товара;
    int sumOfOne; // стоимость одной единицы товара. Целое число.

    public MonthlyReportData(String itemName, boolean isExpense, int quantity, int sumOfOne) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }
    @Override
    public String toString() {
        return "MonthlyReportData{" +
                "itemName='" + itemName + '\'' +
                ", isExpense=" + isExpense +
                ", quantity=" + quantity +
                ", sumOfOne=" + sumOfOne +
                '}';
    }
}
