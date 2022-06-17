public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();
        System.out.println("Ежемесячный платеж при сумме кредита 1000000 рублей и сроке кредитования 1 год");
        System.out.println(calculate.calculatePayment(1, 1000000));
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1000000 рублей и сроке кредитования 2 года");
        System.out.println(calculate.calculatePayment(2, 1000000));
        System.out.println();
        System.out.println("Ежемесячный платеж при сумме кредита 1000000 рублей и сроке кредитования 3 года");
        System.out.println(calculate.calculatePayment(3, 1000000));

    }
}
