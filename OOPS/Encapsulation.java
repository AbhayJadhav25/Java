public class Encapsulation {
  public static void main(String[] args) {
    BankAccount bank = new BankAccount();
    bank.setAccountNumber("ABC123");
    System.out.println("Bank Number : " + bank.getAccountNumber());

    bank.deposite(12000);
    System.out.println("Bank Balance : " + bank.getBalance());

    bank.withdraw(8000);
    System.out.println("Bank Balance after withrawl : " + bank.getBalance());
  }
}

class BankAccount {
  private String accountNumber;
  private double balance;

  public void setAccountNumber(String accNo) {
    if (accNo.length() == 6) {
      accountNumber = accNo;
    } else {
      System.out.println("Account number must be 6 characters");
    }
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  void deposite(double amount) {
    if (amount > 0) {
      balance += amount;
    }
  }

  void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
    }
  }

  double getBalance() {
    return balance;
  }

}
