import java.util.Scanner;


public class e6_25 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the number of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the number of c: ");
        double c = input.nextDouble();
        double[] eqn = {a, b, c};
        double[] roots = new double[2];
        int num = solveQuadratic(eqn, roots);
        System.out.println(num);
        if (num == 1)
            System.out.print(roots[0]);
        if (num == 2)
            System.out.print(roots[0] + " " + roots[1]);
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        if (Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2] == 0) {
            roots[0] = (-eqn[1]) / (2 * eqn[0]);
            return 1;
        } else if (Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2] < 0)
            return 0;
        else {
            roots[0] = (-eqn[1] + Math.sqrt(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt(Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2])) / (2 * eqn[0]);
            return 2;
        }
    }

}