public class Main {
    public static void main(String[] args) {
        int initBalance = 800;                           //Начальный баланс
        int payment = 200;                           //Сумма платежа
        int fBonus = (initBalance + payment) >= 1000 ? (initBalance + payment) / 100 : 0;
        System.out.println("Текущий баланс: " + (initBalance + payment + fBonus) + " руб., в том числе бонус: " + (fBonus) + " руб.");
    }
}