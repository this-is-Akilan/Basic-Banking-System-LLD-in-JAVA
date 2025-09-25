package BankingSystem;

class Account {
    private String accountNumber;
    private Customer customer;
    protected double balance;

    public Account(String accountNumber, Customer customer , double balance){
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("The balance is this : " + balance);
        }
        else{
            System.out.println("Insufficient amount or Invalid amount");
        }
    }

    public void withdraw(double amount) {

    }

    public void displayAccountInfo(){
        System.out.println("This is the Customer's Account Number : " + accountNumber);
        System.out.println("This is the Customer :" + customer.getName());
        System.out.println("Balance amount is :" + balance);
    }

//    getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getbalance(){
        return balance;
    }

}
