import java.util.Scanner;

public class e2_5{
	public static void main(String[] args){
	System.out.println("智科1班 赖楚芸 222020335220187");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the subtotal and a gratuity rate:");
	double subtotal=input.nextDouble();
	double rate=input.nextDouble()*0.01;
	double gratuity=subtotal*rate;
	double total=subtotal+gratuity;
	System.out.printf("The gratuityr is %.2f and total is %.2f",gratuity,total);
	}
}