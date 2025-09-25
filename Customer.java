package BankingSystem;

public class Customer {
    String customerID;
    String name;
    String email;

    public Customer(String customerID, String name, String email){
        this.customerID = customerID;
        this.name = name;
        this.email = email;
    }

    public String getCustomerID(){
        return customerID;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


