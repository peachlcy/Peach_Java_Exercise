package e11_3;

import e11_2.myDate;

public class Account {
    public long account = 0;
    public double amount = 0;
    public double rate = 0.3;
    public myDate date=new myDate();

    public long getAccount() {
        return account;
    }

    public void setAccount(long account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public myDate getDate() {
        return date;
    }

    public void setDate(myDate date) {
        this.date = date;
    }

    public Account() {
    }

    public Account(long account, double amount, double rate, myDate date) {
        setAccount(account);
        setAmount(amount);
        setRate(rate);
        setDate(date);
    }

    public double saving(double save) {
        amount = amount + save;
        return amount;
    }

    public double taking(double take) {
        amount = amount - take;
        return account;
    }

    public String toString() {
        return "The account = " + account + " The amount = " + amount + "The rate = " + rate + date.toString();

    }

}