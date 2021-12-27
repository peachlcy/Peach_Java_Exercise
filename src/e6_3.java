import java.util.Arrays;
import java.util.Scanner;


public class e6_3 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        String num = input.nextLine();
        String[] numbers = num.split(" ");
        int len = numbers.length;
        int[] times=new int[101];
        for (int i : num(numbers)) {
            ++times[i];
        }
        for (int i = 0; i < 101; i++) {
            if (times[i]==1)
                System.out.println(i+" occurs 1 time");
            else if (times[i]>1)
                System.out.println(i+" occurs "+times[i]+" times");
        }
        }



    public static  int[] num(String[] number){
        int len = number.length;
        int[] num=new int[len-1];
        for (int i = 0; i < len-1; i++) {
            int b = Integer.parseInt(number[i]);
            num[i]=b;
        }
        Arrays.sort(num);
        return num;
    }

}