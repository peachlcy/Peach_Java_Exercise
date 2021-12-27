package e11_3;

import e11_2.myDate;

public class checkingAccount extends Account {
    double taking = 0;

    public double getTaking() {
        return taking;
    }

    public void setTaking(double taking) {
        this.taking = taking;
    }

    public checkingAccount() {
    }

    public checkingAccount(long account, double amount, double rate, myDate date, double taking) {
        super(account, amount, rate, date);
        this.taking = taking;
    }


    public boolean isOver() {
        return !((amount - taking) > amount);
    }

    public double take() {
        if (isOver())
            amount = amount - taking;
        return amount;
    }

    public String toString() {
        if (isOver())
            return super.toString() + "The amount = " + amount + "The take money = " + taking;
        else
            return super.toString() + "Sorry you can not take money";
    }

}
