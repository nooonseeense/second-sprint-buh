import java.util.HashMap;

public class StatForTheYear {

    public void stat(HashMap<Integer, Integer> sumIncomeYearly,
                     HashMap<Integer, Integer> sumExpenseYearly) {
        if (sumIncomeYearly.size() == 0 || sumExpenseYearly.size() == 0) {
            System.out.println("SYSTEM: <ГОДОВОЙ ОТЧЕТ НЕ СЧИТАН>");
        } else {
            System.out.println("[!] Рассматриваемый год: 2021");
            incomePerMonth(sumIncomeYearly, sumExpenseYearly);
            avrExpense(sumExpenseYearly, sumIncomeYearly);
        }
    }

    public void incomePerMonth(HashMap<Integer, Integer> sumIncomeYearly,
                               HashMap<Integer, Integer> sumExpenseYearly) {
        for (int month : sumExpenseYearly.keySet()) {
            System.out.println("Прибыль по " + month + " месяцу составила: " +
                    (sumIncomeYearly.get(month) - sumExpenseYearly.get(month)) + " рублей");
        }
    }

    public void avrExpense(HashMap<Integer, Integer> sumExpenseYearly,
                           HashMap<Integer, Integer> sumIncomeYearly) {
        int sumExpense = 0;
        int sumIncome = 0;

        for (int month : sumExpenseYearly.keySet()) {
            sumExpense += sumExpenseYearly.get(month);
        }
        for (int month : sumIncomeYearly.keySet()) {
            sumIncome += sumIncomeYearly.get(month);
        }
        System.out.println("Средний доход за все месяцы в году составил: " +
                sumIncome / sumIncomeYearly.size() + " рублей");
        System.out.println("Средний расход за все месяцы в году составил: " +
                sumExpense / sumExpenseYearly.size() + " рублей");
    }
}
