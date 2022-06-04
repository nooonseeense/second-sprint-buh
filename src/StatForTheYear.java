import java.util.HashMap;

public class StatForTheYear {

    public void stat(HashMap<Integer, Integer> sumIncomeYearly,
                     HashMap<Integer, Integer> sumExpenseYearly) {
        System.out.println("[!] Рассматриваемый год: 2021");
        incomePerMonth(sumIncomeYearly, sumExpenseYearly);
        avrExpense(sumExpenseYearly);
        avrIncome(sumIncomeYearly);
    }

    public void incomePerMonth(HashMap<Integer, Integer> sumIncomeYearly,
                               HashMap<Integer, Integer> sumExpenseYearly) {
        for (int month : sumExpenseYearly.keySet()) {
            System.out.println("Прибыль по " + month + " месяцу составила: " +
                    (sumIncomeYearly.get(month) - sumExpenseYearly.get(month)) + " рублей");
        }
    }

    public void avrExpense(HashMap<Integer, Integer> sumExpenseYearly) {
        int sum = 0;
        for (int month : sumExpenseYearly.keySet()) {
            sum += sumExpenseYearly.get(month);
        }
        System.out.println("Средний расход за все месяцы в году составил: " +
                sum / sumExpenseYearly.size() + " рублей");
    }

    public void avrIncome(HashMap<Integer, Integer> sumIncomeYearly) {
        int sum = 0;
        for (int month : sumIncomeYearly.keySet()) {
            sum += sumIncomeYearly.get(month);
        }
        System.out.println("Средний доход за все месяцы в году составил: " +
                sum / sumIncomeYearly.size() + " рублей");
    }
}
