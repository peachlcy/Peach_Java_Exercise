import java.util.Scanner;

public class e2_7{
	public static void main(String[] args){
	System.out.println("智科1班 赖楚芸 222020335220187");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter a number of minutes:");
	int m=input.nextInt();
	int a=m/525600;
	int b=(m%525600)/1440;
	System.out.println(m+" minutes is approximately "+a+" years and "+b+" days");
	}
}