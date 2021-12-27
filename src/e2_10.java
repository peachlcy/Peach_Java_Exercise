import javax.swing.*;
import java.util.Scanner;

public class e2_10 {
    public static void main(String[] args) {
        // Create a Scanner
//        Scanner input = new Scanner(System.in);
        // Receive the amount
        String input= JOptionPane.showInputDialog(
                "Enter an amount in double, for example 11.56: ");
        double amount = Double.parseDouble(input);
//        char amount = input.next();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        String output="智科1班 赖楚芸 222020335220187\n"+"Your amount " + amount + " consists of\n"+"    " + numberOfQuarters + " quarters \n"+"    " + numberOfQuarters + " quarters \n"+"    " + numberOfDimes + " dimes\n"+"    " + numberOfNickels + " nickels\n"+"    " + numberOfPennies + " pennies";
        JOptionPane.showMessageDialog(null,output);
    }
}


