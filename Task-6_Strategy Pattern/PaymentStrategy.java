// Strategy interface
interface PaymentStrategy {
    void payment(float amount);
}


class Semester implements PaymentStrategy {
    private String StudentId;
    private String Department;
    private String Season;

    public Semester(String StudentId, String Department, String Season) {
        this.StudentId = StudentId;
        this.Department = Department;
        this.Season = Season;
    }

    @Override
    public void payment(float amount) {
        System.out.println("Paid " + amount + " by using  Cash Payment Method.");
        // Add code to process the payment using the Cash.
    }
}

class SemesterFee {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(float amount) {
        paymentStrategy.payment(amount);
    }
}