import javax.swing.*;
import java.util.Scanner;

public class e2_11 {
    public static void main(String[] args){
        System.out.println("智科1班 赖楚芸 222020335220187");
//        String a= JOptionPane.showInputDialog("Enter employee's name:");
//        String b= JOptionPane.showInputDialog("Enter number of hours worked in a week:");
//        String c= JOptionPane.showInputDialog("Enter hourly pay rate:");
//        String d= JOptionPane.showInputDialog("Enter federal tax withholding rate:");
//        String e= JOptionPane.showInputDialog("Enter state tax withholding rate:");

        Scanner input=new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String a=input.nextLine();
        System.out.print("Enter number of hours worked in a week:");
        int b=input.nextInt();
        System.out.print("Enter hourly pay rate:");
        double c=input.nextDouble();
        System.out.print("Enter federal tax withholding rate:");
        double d=input.nextDouble();
        System.out.print("Enter state tax withholding rate:");
        double e=input.nextDouble();

        System.out.println("Employee Name: "+a);
        System.out.println("Hours Worked: "+b);
        System.out.println("Pay Rate: $"+c);
        System.out.println("Gross Pay: $"+c*b);
        System.out.println("Deductions:");
        System.out.printf("  Federal Withholding (%.1f%%) : $%.1f\n",d*100,c*b*d);
        System.out.printf("  State Withholding (%.1f%%) : $%.2f\n",e*100,c*b*e-0.005);
        System.out.printf("  Total Deduction :  $%.2f\n",c*b*(d+e)-0.005);
        System.out.printf("Net Pay :  $%.2f",c*b*(1-d-e)-0.005);
//        int b1=Integer.parseInt(b);
//        double c1=Double.parseDouble(c);
//        double d1=Double.parseDouble(d);
//        double e1=Double.parseDouble(e);
//        String f="Employee Name: "+a+"\n";
//        String g="Hours Worked: "+b1+"\n";
//        String h="Pay Rate: $"+c1+"\n";
//        String i="Gross Pay: $"+c1*b1+"\n";
//        String j="Deductions:\n";
//        String k=String.format("  Federal Withholding (%.1f%%) : $%.1f\n",d1*100,c1*b1*d1);
//        String l=String.format("  State Withholding (%.1f%%) : $%.2f\n",e1*100,c1*b1*e1-0.005);
//        String m=String.format("  Total Deduction :  $%.2f\n",c1*b1*(d1+e1)-0.005);
//        String n=String.format("Net Pay :  $%.2f",c1*b1*(1-d1-e1)-0.005);
//
//        String output = f + g + h + i + j + k + l + m + n;
//        JOptionPane.showMessageDialog(null, output);
    }
}
