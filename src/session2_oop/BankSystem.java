package session2_oop;

public class BankSystem {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("5049",10);
        bankAccount.setAccountNumber("12345");
        bankAccount.setBalance(500);
        bankAccount.deposit(500);
        bankAccount.withdraw(500);
        System.out.println("Balance is: " + bankAccount.getBalance());
    }
}
