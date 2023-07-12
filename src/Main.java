public class Main {

    public static void main(String[] args) {

        int price = 13_676;

        int bonus = price / 20;

        System.out.println("Бонус:" + bonus);
    }
}


public class Main {

    public static void main(String[] args) {
        int initialBalance = 1100;
        int addend = 900;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

            int finalBalance = initialBalance + addend + bonus;
            System.out.println("Итоговый счет:" + finalBalance);
            System.out.println("Бонус:" + bonus);

        }
    }