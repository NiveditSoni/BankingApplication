package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double>transactions = new ArrayList<Double>();

    public Customer(String name,double initialAmount) {
        this.name = name;
        addTransactions(initialAmount);
    }



    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }
}
