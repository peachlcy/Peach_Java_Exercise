import java.util.Scanner;

public class e3_21 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year:(e.g., 2008) : ");
        int year = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31 : ");
        int q = input.nextInt();
        int m = 0;
        if (month == 1){
            m = 13;
            year--;}
        else if (month == 2){
            m = 14;
            year--;}
        else
            m = month;
        int j = Math.abs(year / 100);
        int k = year % 100;
        int h = (q + ((26 * (m + 1)) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;
        String[] week = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        System.out.print("Day of the week is " + week[h]);
    }
}