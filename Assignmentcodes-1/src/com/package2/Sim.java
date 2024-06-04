package com.package2;

public class Sim {
    private int simId;
    private String customerName;
    private double balance;
    private double ratePerSecond;
    private String circle;

 
    public Sim(int simId,String customerName,double balance,double ratePerSecond,String circle) {
        this.simId=simId;
        this.customerName=customerName;
        this.balance=balance;
        this.ratePerSecond=ratePerSecond;
        this.circle=circle;
    }

    public int getSimId(){
        return simId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getBalance(){
        return balance;
    }

    public double getRatePerSecond(){
        return ratePerSecond;
    }

    public String getCircle(){
        return circle;
    }


    public void setSimId(int simId) {
        this.simId=simId;
    }

    public void setCustomerName(String customerName) {
        this.customerName=customerName;
    }

    public void setBalance(double balance) {
        this.balance=balance;
    }

    public void setRatePerSecond(double ratePerSecond) {
        this.ratePerSecond=ratePerSecond;
    }

    public void setCircle(String circle){
        this.circle=circle;
    }
}
