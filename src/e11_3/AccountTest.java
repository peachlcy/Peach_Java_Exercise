package e11_3;

import e11_2.*;

public class AccountTest {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        Account account = new Account(22201, 10000, 0.5, new myDate(2021, 12, 10));
        System.out.println(account);
        checkingAccount checkingAccount = new checkingAccount(22201, 10000, 0.5,
                new myDate(2021, 12, 10), 500);
        System.out.println(checkingAccount);
        SavingAccount savingAccount = new SavingAccount(22201,10000,0.5,new myDate(2021,
                12,10),10000);
        System.out.println(savingAccount);
    }
}
