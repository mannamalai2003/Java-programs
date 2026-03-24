import java.util.Scanner;

public class PaymentHandler {
    public static void processPayment(Scanner sc, int amount) {
        System.out.println("Select payment method:\n1. G-pay\n2. UPI\n3. Phone pay");
        int ch = sc.nextInt();
        if (ch == 1 || ch == 2 || ch == 3) {
            System.out.println("Enter your UPI ID: ");
            String upiId = sc.next();
            String correctUpiId = "ANNA3838";
            if (upiId.equals(correctUpiId)) {
                String otp = String.valueOf((int)(Math.random() * 9000 + 1000));
                System.out.println("The generated otp is: " + otp);
                System.out.println("Enter the otp: ");
                String enteredOtp = sc.next();
                if (enteredOtp.equals(otp)) {
                    int pinNumber = 1234;
                    System.out.println("OTP verified successfully! Proceeding to payment.");
                    System.out.println("Your amount is: " + amount + " INR. \nPlease enter your pin number to complete the payment.");
                    int enteredPin = sc.nextInt();
                    if (enteredPin == pinNumber) {
                        System.out.println("Payment successful! Your order is confirmed.");
                    } else {
                        System.out.println("Invalid pin number. Payment failed.");
                    }
                } else {
                    System.out.println("Invalid OTP. Payment failed.");
                }
            } else {
                System.out.println("Invalid UPI ID. Payment failed.");
            }
        } else {
            System.out.println("Invalid payment method.");
        }
    }
}