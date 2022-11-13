package com.wly.AllExercise.fouth;

public class BankAccount {
    private double balance;//余额
    private double charge = 1;//手续费
    private double rate;//月利率

    public BankAccount(double balance,double charge,double rate) {
        this.balance = balance;
        this.charge = charge;
        this.rate = rate;
    }
    //存款
    public void deposit(double amount) {
        balance +=amount;
        balance = balance-charge;
    }
    //取款
    public void withdrow(double amount) {
        balance -=amount;
        balance = balance-charge;
    }
    //产生利息
    public void earnMonthlyInterest(){
        balance = balance*rate+balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
