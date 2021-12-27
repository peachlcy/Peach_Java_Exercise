import java.util.Scanner;

public class e2_6{
	public static void main(String[] args){
	System.out.println("智科1班 赖楚芸 222020335220187");
	Scanner input=new Scanner(System.in);
	System.out.print("Enter a number 0 and 1000:");
	int n=input.nextInt();
	int p=0;
	while(n>10){
		int a=n%10;
		n=n/10;
		p=p+a;
	}
	p=p+n;
	System.out.println("The sum of the digits is "+p);
	}
}