package com.wly.AllExercise.fouth;

public class FouthTest {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(0, 1, 0.2, 0, 0);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.withdrow(99);
        savingAccount.withdrow(100);
        savingAccount.withdrow(100);
        savingAccount.withdrow(20);
        savingAccount.earnMonthlyInterest();
        System.out.println(savingAccount.getBalance());
    }
}
