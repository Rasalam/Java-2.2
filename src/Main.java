public class Main {
    public static void main(String[] args) {
        int initialBalance = 800;                           //Начальный баланс
        int amountOfPayment = 200;                           //Сумма платежа
        int balance = initialBalance + amountOfPayment;
        int fBonus = balance >= 1000 ? balance / 100 : 0;
        System.out.println("Текущий баланс счета: " + (balance + fBonus) + " руб., в том числе сумма бонусных рублей: " + (fBonus) + " руб.");
    }
}