public class Main {
    public static void main(String[] args) {
        // Create the context
        SemesterFee cart = new SemesterFee();

        // Choose the payment strategy
        PaymentStrategy Semester = new Semester("221-134-029", "SWE", "Summer");
        PaymentStrategy BkashPayment = new BkashPayment("017*******");

        cart.setPaymentStrategy(Semester);
        cart.checkout(100);

        cart.setPaymentStrategy(BkashPayment);
        cart.checkout(50);
    }
}
