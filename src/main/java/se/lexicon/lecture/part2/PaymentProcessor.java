package se.lexicon.lecture.part2;

public class PaymentProcessor {
    // Process Credit Card
    public static void processPayment(String cardNumber, String cvv, double amount) {
        IO.println("Processing Card: " + cardNumber);
    }

    // Process Bank Transfer
    public static void processPayment(String bankAccount, String swift, double amount, String currency) {
        IO.println("Processing Bank Transfer");
        IO.println("Bank Account: " + bankAccount + ", Amount: " + amount + " " + currency);
        
    }

    void main() {
        processPayment("1234567890", "123", 100.0);
        processPayment("1234567890", "123", 100.0, "SEK");
    }
}