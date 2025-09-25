package BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {

//        creating a bank

        Bank bank = new Bank("My Bank");

//        creating customers

        Customer customer1 = new Customer("C001", "Akilan", "akilan.red@gmial.com");
        Customer customer2 = new Customer("C002", "Panda", "panda.black@gmial.com");
        Customer customer3 = new Customer("C003", "Karpagam", "karpagam.pink@gmial.com");

//        adding customers to the bank

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

//        creating account

        Account account1 = new SavingsAccount("A101" , customer1, 85000);
        Account account2 = new CurrentAccount("A102" , customer1, 90000 , 2.5);
        Account account3 = new SavingsAccount("A103" , customer1, 100000);

//        transactions

        account1.deposit(7500);
        account1.withdraw(5000);
        account2.deposit(8000);
        account2.withdraw(5000);
        account3.deposit(9000);
        account3.withdraw(4500);

//       display account info

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        bank.displayInfo();

    }
}
