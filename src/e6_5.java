import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class e6_5 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        String num = input.nextLine();
        String[] numbers = num.split(" ");
        int len = numbers.length;
        int[] number=num(numbers);
//        int[] n=new int[len];
        ArrayList<Integer> n=new ArrayList<>();
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < len; i++) {
            if (!in(number[i], n))
                n.add(number[i]);
        }
        for (int i :n) {
            System.out.print(i+" ");
        }
    }

    public static int[] num(String[] number) {
        int len = number.length;
        int[] num = new int[len];
        for (int i = 0; i < len; i++) {
            int b = Integer.parseInt(number[i]);
            num[i] = b;
        }
        return num;
    }

    public static boolean in(int a,ArrayList<Integer> number) {
        for (int i :number) {
           if (a==i)
            return true;
        }
        return false;
    }
}