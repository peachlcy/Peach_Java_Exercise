import java.util.Scanner;

public class e2_13 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        double amount = input.nextDouble();
        System.out.print("Enter monthly interest rate:");
        double rate = input.nextDouble();
        System.out.print("Enter number of years:");
        double year = input.nextDouble();
        double value =amount*(Math.pow(1+rate/100,year*12));
        System.out.printf("Accumulated value is %.2f",value);
    }
}
