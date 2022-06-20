public class CreditPaymentService {

    public double calculatePayment(double term, double amount) {
        double rate = 9.99;
        double rateMonth = rate / 100 / 12;
        double payment = amount * (rateMonth + (rateMonth / (Math.pow(1 + rateMonth, term * 12) - 1)));
        return payment;

    }

}
