package OOPS.Introduction;

public class AbsstractClassEg {

    public interface PaymentProcessor{
        boolean processPayment(double amount);
        void refund(double amount);
    }

    public static abstract class BasePaymentProcessor implements PaymentProcessor{

        protected double totalProcessed = 0.0;

        public void logTransaction(double amount) {
            totalProcessed += amount;
            System.out.println("Logged: " + amount + " | Running total: " + totalProcessed);
        }

        public boolean processPayment(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid amount");
                return false;
            }
            boolean success = executeGatewayCall(amount);   // subclass fills this in
            if (success) logTransaction(amount);
            return success;
        }

        // ABSTRACT method — no body, forces every subclass to define its own logic
        protected abstract boolean executeGatewayCall(double amount);
    }

    public static class RazorpayProcessor extends BasePaymentProcessor{

        @Override
        protected boolean executeGatewayCall(double amount) {
            System.out.println("Calling Razorpay API for $" + amount);
            return true;
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refunding $" + amount + " via Razorpay");
        }
    }

    public static class StripeProcessor extends BasePaymentProcessor {

        @Override
        protected boolean executeGatewayCall(double amount) {
            System.out.println("Calling Stripe API for $" + amount);
            return true;
        }

        @Override
        public void refund(double amount) {
            System.out.println("Refunding $" + amount + " via Stripe");
        }

        public static void main(String[] args) {
            PaymentProcessor razorpay = new RazorpayProcessor();
            razorpay.processPayment(500.0);
            razorpay.refund(100.0);

            PaymentProcessor stripe = new StripeProcessor();
            stripe.processPayment(20.0);
        }
    }
}
