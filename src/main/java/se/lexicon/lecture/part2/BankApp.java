package se.lexicon.lecture.part2;

public class BankApp {
    void main() {
        // Working with Instance members
        BankAccount acc1 = new BankAccount();
        acc1.accountHolder = "Anna";
        acc1.deposit(500);

        BankAccount acc2 = new BankAccount();
        acc2.accountHolder = "Björn";
        acc2.deposit(1000);

        // Working with Static members (Call using Class Name)
        BankAccount.setInterestRate(5.0);
        IO.println(BankAccount.calculateLoanRepayment(1000, 5));
                
    }
}