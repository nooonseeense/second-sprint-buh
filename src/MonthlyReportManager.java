import java.util.ArrayList;
import java.util.HashMap;

class MonthlyReportManager { // Класс, который хранит в себе данные считанных месяцев из файлов
    String itemName;
    boolean isExpense; // Обозначает, является ли запись тратой (TRUE) или доходом (FALSE);
    int quantity; // количество закупленного или проданного товара;
    int sumOfOne; // стоимость одной единицы товара. Целое число.

    public MonthlyReportManager(String itemName, boolean isExpense, int quantity, int sumOfOne) {
        this.itemName = itemName;
        this.isExpense = isExpense;
        this.quantity = quantity;
        this.sumOfOne = sumOfOne;
    }
}
