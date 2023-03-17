
public class Main {
    public static void main(String[] args) {
        int initialAmount = 500;
        int replenishment = 900;

        if (replenishment > 1000) {
            int bonus = replenishment / 100;
            int total = initialAmount + replenishment + bonus;

            System.out.println("итоговый баланс:" + total);
        }
        if (replenishment < 1000) {
            int bonus = 0;
            int total = initialAmount + replenishment + bonus;

            System.out.println("итоговый баланс:" + total);
            // Объявляете переменные для входных данных и
            // параметров программы: начального счёта,
            // суммы пополнения и тп

            // Условным оператором проверяете, превысила ли
            // сумма пополнения порог, и для этих двух разных
            // сценариев рассчитываете сумму бонуса и выводите
            // на экран.
        }

    }
}