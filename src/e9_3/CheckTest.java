package e9_3;

import java.util.Scanner;

public class CheckTest {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your password ");
        String password= input.nextLine();
        if (Check.check(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");

    }
}
