import java.util.Scanner;

public class e4_30 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount: ");
        double amount = input.nextDouble();
        System.out.println("Please enter the rate: ");
        double rate = input.nextDouble();
        System.out.println("Please enter the number of month: ");
        int n = input.nextInt();
        double b = 0;
        double a = 0;
        for (int i = 0; i < n; i++) {
            a = (amount + b) * (rate / 1200 + 1);
            b = a;
            if (i == n - 1)
                System.out.printf("%.3f\n", a);
        }
    }
}