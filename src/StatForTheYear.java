import java.util.HashMap;

public class StatForTheYear {

    public void stat(HashMap<Integer, Integer> sumIncomeYearly,
                     HashMap<Integer, Integer> sumExpenseYearly) {
        final String MSG_INCOME = "Средний доход в рублях за все месяцы в году составил: ";
        final String MSH_EXPENSE = "Средний расход в рублях за все месяцы в году составил: ";

        if (sumIncomeYearly.size() == 0 || sumExpenseYearly.size() == 0) {
            System.out.println("SYSTEM: <ГОДОВОЙ ОТЧЕТ НЕ СЧИТАН>");
        } else {
            System.out.println("[!] Рассматриваемый год: 2021");
            incomePerMonth(sumIncomeYearly, sumExpenseYearly);
            avrExpenseAndIncome(
                    sumExpenseYearly, sumIncomeYearly,
                    MSG_INCOME, MSH_EXPENSE
            );
        }
    }

    public void incomePerMonth(HashMap<Integer, Integer> sumIncomeYearly,
                               HashMap<Integer, Integer> sumExpenseYearly) {
        for (int month : sumExpenseYearly.keySet()) {
            System.out.println("Прибыль по " + month + " месяцу составила: " +
                    (sumIncomeYearly.get(month) - sumExpenseYearly.get(month)) + " рублей");
        }
    }

    public void avrExpenseAndIncome(HashMap<Integer, Integer> sumExpenseYearly,
                                    HashMap<Integer, Integer> sumIncomeYearly,
                                    String MSG_INCOME, String MSG_EXPENSE) {
        int sumExpense = 0;
        int sumIncome = 0;

        for (int month : sumExpenseYearly.keySet()) {
            sumExpense += sumExpenseYearly.get(month);
        }
        for (int month : sumIncomeYearly.keySet()) {
            sumIncome += sumIncomeYearly.get(month);
        }
        System.out.println(MSG_INCOME + sumIncome / sumIncomeYearly.size());
        System.out.println(MSG_EXPENSE + sumExpense / sumExpenseYearly.size());
    }
}
