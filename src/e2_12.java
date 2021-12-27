import javax.swing.*;
import java.util.Scanner;


public class e2_12 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3for 3%):");
        double ba=input.nextDouble();
        double rate=input.nextDouble();
        double in =ba*(rate/1200);
        System.out.printf("The interest is %.5f",in);
//        String a= JOptionPane.showInputDialog("Enter balance and interest rate (e.g., 3for 3%):");
//        String ba=a.substring(0,a.indexOf(" "));
//        String rate=a.substring(ba.length()+1,a.length());
//        double ba1=Double.parseDouble(ba);
//        double rate1=Double.parseDouble(rate);
//        double in =ba1*(rate1/1200);
//        String output =String.format("The interest is %.5f",in);
//        JOptionPane.showMessageDialog(null,output);
    }
}

