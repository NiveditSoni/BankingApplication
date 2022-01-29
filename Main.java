package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("SBI");
        bank.addBranch("Jaipur");
        bank.addCustomer("Jaipur","Nivedit",1200.45);
        bank.addCustomer("Jaipur","Amit",340005.6778);
        bank.addCustomer("Jaipur","Amita",3454457.675);

        bank.addBranch("Delhi");
        bank.addCustomer("Delhi","Sunny",453.78);
        bank.addCustomer("Delhi","Amrik",6745.67);
        bank.addCustomer("Delhi","Sakshi",23667.9);

        bank.addCustomerTransactions("Jaipur","Nivedit",50000.00);
        bank.addCustomerTransactions("Jaipur","Nivedit",45477.90);
        bank.addCustomerTransactions("Jaipur","Amita",1200.45);

        bank.listCustomers("Jaipur",true);
        bank.listCustomers("Delhi",true);

        bank.addBranch("Lucknow");

        if(!bank.addCustomer("Lucknow","Sita",0.0)){
            System.out.println("Error melbourne branch does not exist");
        }
        if(!bank.addBranch("Jaipur")){
            System.out.println("This branch already exist");
        }
        if(!bank.addCustomerTransactions("Jaipur","Mohit",90.00)){
            System.out.println("Customer doesn't exist");
        }
        if(!bank.addCustomer("Jaipur","Nivedit",890.90)){
            System.out.println("Customer nivedit already exists");
        }

    }
}
