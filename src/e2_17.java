import java.util.Scanner;

public class e2_17 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit:");
        double tem = input.nextDouble();
        System.out.print("Enter the wind speed miles per hour:");
        double v = input.nextDouble();
       if (tem<41&&tem>-58&&v>2){
         double t=35.74+0.6215*tem-35.75*(Math.pow(v,0.16))+0.4275*tem*(Math.pow(v,0.16));
           System.out.printf("The wind chill index is %.5f",t);}
       else
           System.out.print("Please enter the temperature which is between -58 and 41,and enter the wind speed miles per hour which is higher than 2mph.");


    }
}
