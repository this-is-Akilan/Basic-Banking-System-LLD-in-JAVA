package BankingSystem;

import java.util.*;
import java.util.ArrayList;


public class Bank {
    private String name;
    private final List<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void displayInfo(){
        System.out.println("Name of the Customer:" + name);
        System.out.println("Number of Customers:" + customers.size());
        System.out.println("Customers:");

        for(Customer customer : customers){
            System.out.println("- :" + customer.getName());
        }
    }
}
