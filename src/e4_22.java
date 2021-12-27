import java.util.Scanner;

public class e4_22 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();
        double n = input.nextDouble();
        double rate = input.nextDouble();
        double monthlyRate = rate / 1200;
        double month = n * 12;
        double monthlyPayment = (amount * monthlyRate * Math.pow((1 + monthlyRate), month)) /
                (Math.pow((1 + monthlyRate), month)-1);
        double totalPayment = 12 * monthlyPayment;
        double balance = amount;
        System.out.println("Loan Amount: "+amount);
        System.out.println("Number of years: "+n);
        System.out.println("Annual Interest Rate: "+rate+"%");
        System.out.print("\n");
        System.out.printf("Monthly Payment: %.2f\n",monthlyPayment);
        System.out.printf("Total Payment: %.2f\n",totalPayment);
        System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
        for (int i = 1; i <= month; i++) {
            double interest = monthlyRate * balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%8d\t\t", i);
            System.out.printf("%8.2f\t\t", interest);
            System.out.printf("%9.2f\t\t", principal);
            System.out.printf("%7.2f\t\t\n", balance);

        }
    }
}