package com.wly.AllExercise.fouth;

public class SavingAccount extends BankAccount{
    private int savAccount;//存钱次数
    private int withAccount;//取款次数

    public SavingAccount(double balance, double charge, double rate,int savAccount,int withAccount) {
        super(balance, charge, rate);
        this.savAccount = savAccount;
        this.withAccount = withAccount;
    }

    @Override
    public void deposit(double amount) {
        savAccount++;//每次存款次数都加1
        if(savAccount>3) {//如果存钱次数大于3次就收取手续费
            super.deposit(amount);
            return;
        }
        //存钱次数小于3次就不收取手续费
        super.setBalance(super.getBalance()+amount);
    }

    @Override
    public void withdrow(double amount) {
        withAccount++;//每次取款次数加1
        if(withAccount>3){//如果取款次数大于3次就收取手续费
            super.withdrow(amount);
            return;
        }
        //取款次数小于3次就不收取手续费
        super.setBalance(super.getBalance()-amount);
    }

    @Override
    public void earnMonthlyInterest() {
        super.earnMonthlyInterest();
        this.withAccount=0;
        this.savAccount=0;
    }
}
