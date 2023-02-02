public class Main {
    public static void main(String[] args) {
        int account = 100; // на счету у клиента 100 руб
        int deposit = 1100; // сумма пополнения
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        int totalAmount = account + deposit + bonus;
        System.out.println("Total amount:");
        System.out.println(totalAmount);
        System.out.println("Bonus:");
        System.out.println(bonus);


    }
}
