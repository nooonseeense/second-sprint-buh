import java.util.ArrayList;
import java.util.HashMap;

class YearlyReportManager {
    public ArrayList<YearlyReportData> records; // теперь здесь 6 строк данных из листа

    YearlyReportManager() {
        records = new ArrayList<>();
    }

    public void add(YearlyReportData record) {
        records.add(record);
    }

    public void infoAboutTheYearlyReport() {
        yearName();

    }
    public void yearName() {
        final int YEAR_NAME = 2021;
        System.out.println("[!] Рассматриваемый год: " + YEAR_NAME);
    }

    public void profitPerMonth() {

    }
}
//Прибыль по каждому месяцу. Прибыль — это разность доходов и расходов;
//Средний расход за все месяцы в году;
//Средний доход за все месяцы в году.

// is_expense: true - трата, false - доход

/*
month,amount,is_expense
01,1593150,false - доход
01,350000,true - расход
02,810000,false - доход
02,14000,true - расход
03,90000,true - расход
03,2430000,false - доход
 */