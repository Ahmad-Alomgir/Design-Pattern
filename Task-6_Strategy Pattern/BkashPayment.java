public class BkashPayment implements PaymentStrategy {
    private String PhoneNumber;

    public BkashPayment(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public void payment(float amount) {
        System.out.println("Paid " + amount + " by using Bkash.");
        // Add code to process the payment using Bkash.
    }
}