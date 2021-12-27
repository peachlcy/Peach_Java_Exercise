package e11_3;

import e11_2.myDate;

public class SavingAccount extends Account {
    public double saving = 0;

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    public SavingAccount() {

    }

    public SavingAccount(long account, double amount, double rate, myDate date, double saving) {
        super(account, amount, rate, date);setSaving(saving);

    }

    public double saving() {
        amount = amount + saving;
        return amount;
    }

    public String toString() {
        return super.toString() + "The save money = " + saving + "The amount = " + amount;
    }
}
