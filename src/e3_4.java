import java.util.Scanner;

public class e3_4 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() * 7 % 10);
        System.out.println(number1+"  "+number2);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        if(answer == number1+number2){
            System.out.println("true");}
        else{
            System.out.println("false");
        }
    }
}