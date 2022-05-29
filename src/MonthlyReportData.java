class MonthlyReportData { // Класс, который хранит в себе данные считанных месяцев из файлов
    private String itemName;
    private boolean isExpense; // Обозначает, является ли запись тратой (TRUE) или доходом (FALSE);
    private int quantity; // количество закупленного или проданного товара;
    private int sumOfOne; // стоимость одной единицы товара. Целое число.

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
