package BankingSystem;

class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, Customer customer, double balance , double overDraftLimit){
        super(accountNumber,customer,balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= (balance + overDraftLimit)){
            balance -= balance;
            System.out.println("withdrew amount :" + amount + "from account number :" + getAccountNumber());
        }
        else{
            System.out.println("Invalid");
        }
    }
}
