import java.util.Scanner;
import java.util.Random;

public class e5_31 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of card: ");
        long number = input.nextLong();
        String num = String.valueOf(number);
        int len = num.length();
        int a = (num.charAt(0) - '0');
        if (isValid(number) && prefixMatched(number, a))
            System.out.println("The number is valid");
        else
            System.out.println("The number is not valid");
    }

    public static boolean isValid(long number) {
        int a = sumOfDoubleEvenPlace(number);
        int b = sumOfOddPlace(number);
        int c = a + b;
        if (c % 10 == 0)
            return true;
        else
            return false;

    }

    public static int sumOfDoubleEvenPlace(long number) {
        String num = String.valueOf(number);
        int len = num.length();
        int c = 0;
        for (int i = len - 2; i >= 0; i = i - 2) {
            int a = (num.charAt(i) - '0') * 2;
            a = getDigit(a);
            c = a + c;
        }
        return c;

    }


    public static int getDigit(int number) {
        if (number >= 10) {
            int b = number % 10;
            int c = number / 10;
            return b + c;
        } else
            return number;
    }


    public static int sumOfOddPlace(long number) {
        String num = String.valueOf(number);
        int len = num.length();
        int c = 0;
        for (int i = len - 1; i >= 0; i = i - 2) {
            int a = (num.charAt(i) - '0');
            a = getDigit(a);
            c = a + c;
        }
        return c;
    }


    public static boolean prefixMatched(long number, int d) {
        if (d == 4 || d == 5 || d == 37 || d == 6)
            return true;
        else
            return false;
    }


    public static long getPrefix(long number, int k) {
        String num = String.valueOf(number);
        long a = Long.parseLong(num.substring(0, k));
        return a;
    }

}
