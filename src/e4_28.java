import java.util.Scanner;

public class e4_28 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of year: ");
        int year = input.nextInt();
        System.out.println("Please enter the number of the first day:(0-6) ");
        int weekNumber = input.nextInt();
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
        String[] month={"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("January 1,  "+year+" is "+week[weekNumber]);
        for (int i = 1; i < 12; i++) {
            int a=day(i);
            weekNumber=(a+weekNumber)%7;
            System.out.println(month[i]+" 1,  "+year+" is "+week[weekNumber]);
        }
    }

    public static int day(int month) {
        if (month == 2)
            return 28;
        else if (month > 7) {
            if (month % 2 == 0)
                return 31;
            else
                return 30;
        } else
            return month % 2 == 0 ? 30 : 31;
    }
}