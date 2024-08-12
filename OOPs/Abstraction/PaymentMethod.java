public interface PaymentMethod {
    void authorizePayment(double amount);
    void procesRefund(double amount);
    void verifyUPI(final String upi);
}
