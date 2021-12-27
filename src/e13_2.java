import java.util.InputMismatchException;
import java.util.Scanner;

public class e13_2 {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integer: ");
        try{
            if (!input.hasNext())
                throw new InputMismatchException("input must be integer");
            int num1=input.nextInt();
            int num2= input.nextInt();
            System.out.println(num1+num2);

        }catch (InputMismatchException e){
            System.out.println("Exception:an Integer");
        }
        System.out.println("Execution continues...");
    }
}
