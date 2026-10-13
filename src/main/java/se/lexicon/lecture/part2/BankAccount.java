package se.lexicon.lecture.part2;

public class BankAccount {
    // 1. Instance Fields (Unique to each account)
    String accountHolder;
    double balance;
  
    // 2. Static Field (Shared by ALL accounts)
    static double interestRate = 4.5;


    // 3. Instance Method (Operates on specific account)
    public void deposit(double amount) {
      this.balance += amount;
      IO.println(accountHolder + " deposited " + amount);
    }
  
    // 4. Static Method (Utility: shared logic)
    public static void setInterestRate(double newRate) {
      interestRate = newRate;
      IO.println("Global interest rate updated to: " + interestRate + "%");
    }
  
    public static double calculateLoanRepayment(double amount, int years) {
      // Calculate the total repayment amount for a loan.
      // Formula: Total = Principal + (Principal * Rate * Time)
      return amount + (amount * (interestRate / 100) * years);
    }


}