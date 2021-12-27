import java.util.Scanner;


public class e7_6 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextDouble();
            }
        }
        double[][] c = multipliedMatrix(matrix1, matrix2);
        System.out.println("The matrices are multiplied as follows: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3.1f ", matrix1[i][j]);
            }
            if (i == 1)
                System.out.print("  *  ");
            else
                System.out.print("     ");
            for (int k = 0; k < 3; k++) {
                System.out.printf("%3.1f ", matrix2[i][k]);
            }
            if (i == 1)
                System.out.print("  =  ");
            else
                System.out.print("     ");
            for (int p = 0; p < 3; p++) {
                System.out.printf("%3.1f ", c[i][p]);
            }
            System.out.println(" ");
        }
    }

    public static double[][] multipliedMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] = a[i][k] * b[k][j] + c[i][j];
                }
            }
        }
        return c;
    }
}