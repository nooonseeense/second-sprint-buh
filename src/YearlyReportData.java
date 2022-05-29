class YearlyReportData { // Класс, который записывает в себя данные с годового отчета
    int month; // с этими данными можно рабоать в этом классе
    int amount;
    boolean isExpense;

    public YearlyReportData(int month, int amount, boolean isExpense) {  // Конструктор принимает значения и передает в поля класса
        this.month = month;
        this.amount = amount;
        this.isExpense = isExpense;
    }
}

/*
*******************Данные этого класса мы передаем в хешмап класса YearlyReportManager********************************
 */