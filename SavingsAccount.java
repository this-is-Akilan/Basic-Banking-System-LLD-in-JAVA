package BankingSystem;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, Customer customer, double balance){
        super(accountNumber,customer,balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("This is your Balance amount as of now :" + balance + "from this account :" + getAccountNumber() );
        }
        else{
            System.out.println("Invaid amount or Insufficient balance");
        }
    }
    public void applyInterest(){
        double interest = interestRate * balance;
        deposit(interestRate);
        System.out.println("Your interest is :" + interest);
    }
}
