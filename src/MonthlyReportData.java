public class MonthlyReportData {
    String itemName;
    boolean isExpense;
    int quantity;
    int sumOfOne;

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
