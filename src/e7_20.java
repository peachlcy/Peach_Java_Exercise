import java.util.Scanner;

public class e7_20 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        int r = 0;
        int c = 0;
        int[][] checkerboard = new int[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                checkerboard[i][j] = 0;
            }
        }
        print(checkerboard);
        while (1 > 0) {
            System.out.print("Drop a red disk at column (0-6) : ");
            c = input.nextInt();
            play(checkerboard, c, 1);
            print(checkerboard);
            if (!win(checkerboard))
                break;
            System.out.print("Drop a yellow disk at column (0-6) : ");
            c = input.nextInt();
            play(checkerboard, c, 2);
            print(checkerboard);
            if (!win(checkerboard))
                break;
        }
    }

    public static void play(int[][] checkerboard, int c, int palyer) {
        for (int i = 0; i < 6; i++) {
            if (checkerboard[i][c] != 0) {
                if (palyer == 1) {
                    checkerboard[i - 1][c] = 1;
                    break;
                }
                if (palyer == 2) {
                    checkerboard[i - 1][c] = 2;
                    break;
                }
            } else if (checkerboard[5][c] == 0) {
                if (palyer == 1) {
                    checkerboard[5][c] = 1;
                    break;
                }
                if (palyer == 2) {
                    checkerboard[5][c] = 2;
                    break;
                }
            }
        }
    }

    public static void print(int[][] checkerboard) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (checkerboard[i][j] == 1)
                    System.out.print("| R ");
                else if (checkerboard[i][j] == 2)
                    System.out.print("| Y ");
                else
                    System.out.print("|   ");
            }
            System.out.print("|");
            System.out.println(" ");
        }
        System.out.println("----------------------------");
    }

    public static boolean win(int[][] checkerboard) {
        String a = "1111";
        String b = "2222";
        int[] b1 = new int[7];
        int[] b2 = new int[7];
        int[] b3 = new int[7];
        int[] b4 = new int[7];
        int[] b5 = new int[7];
        int[] b6 = new int[7];
        int[] c7 = new int[7];
        int[] c1 = new int[6];
        int[] c2 = new int[6];
        int[] c3 = new int[6];
        int[] c4 = new int[6];
        int[] c5 = new int[6];
        int[] c6 = new int[6];
        int[] d1 = new int[6];
        int[] d2 = new int[6];
        int[] d3 = new int[5];
        int[] d4 = new int[4];
        int[] d5 = new int[5];
        int[] d6 = new int[4];
        int[] d7 = new int[6];
        int[] d8 = new int[6];
        int[] d9 = new int[5];
        int[] d10 = new int[4];
        int[] d11 = new int[5];
        int[] d12 = new int[4];


        for (int i = 0; i < 7; i++) {
            b1[i] = checkerboard[0][i];
            b2[i] = checkerboard[1][i];
            b3[i] = checkerboard[2][i];
            b4[i] = checkerboard[3][i];
            b5[i] = checkerboard[4][i];
            b6[i] = checkerboard[5][i];
        }
        for (int i = 0; i < 6; i++) {
            c1[i] = checkerboard[i][0];
            c2[i] = checkerboard[i][1];
            c3[i] = checkerboard[i][2];
            c4[i] = checkerboard[i][3];
            c5[i] = checkerboard[i][4];
            c6[i] = checkerboard[i][5];
            c7[i] = checkerboard[i][5];
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j)
                    d1[i] = checkerboard[i][j];
                if (i == j - 1)
                    d2[i] = checkerboard[i][j];
                if (i == j - 2)
                    d3[i] = checkerboard[i][j];
                if (i == j - 3)
                    d4[i] = checkerboard[i][j];
                if (i == j + 1)
                    d5[j] = checkerboard[i][j];
                if (i == j + 2)
                    d6[j] = checkerboard[i][j];
                if (i == 6 - j)
                    d7[i] = checkerboard[i][j];
                if (i == 5 - j)
                    d8[i] = checkerboard[i][j];
                if (i == 4 - j)
                    d9[i] = checkerboard[i][j];
                if (i == 3 - j)
                    d10[i] = checkerboard[i][j];
                if (i == 7 - j)
                    d11[6 - j] = checkerboard[i][j];
                if (i == 8 - j)
                    d12[6 - j] = checkerboard[i][j];
            }

        }
        if (trans(b1).contains(a) || trans(b2).contains(a) || trans(b3).contains(a) || trans(b4).contains(a)
                || trans(b5).contains(a) || trans(b6).contains(a) || trans(c7).contains(a) || trans(c1).contains(a)
                || trans(c2).contains(a) || trans(c3).contains(a) || trans(c4).contains(a) || trans(c5).contains(a)
                || trans(c6).contains(a) || trans(d1).contains(a) || trans(d2).contains(a) || trans(d3).contains(a)
                || trans(d4).contains(a) || trans(d5).contains(a) || trans(d6).contains(a) || trans(d7).contains(a)
                || trans(d8).contains(a) || trans(d9).contains(a) || trans(d10).contains(a) || trans(d11).contains(a)
                || trans(d12).contains(a)) {
            System.out.print("X player won");
            return false;
        } else if (trans(b1).contains(b) || trans(b2).contains(b) || trans(b3).contains(b) ||
                trans(b4).contains(b) || trans(b5).contains(b) || trans(b6).contains(b) || trans(c7).contains(b)
                || trans(c1).contains(b) || trans(c2).contains(b) || trans(c3).contains(b) || trans(c4).contains(b)
                || trans(c5).contains(b) || trans(c6).contains(b) || trans(d1).contains(b) || trans(d2).contains(b)
                || trans(d3).contains(b) || trans(d4).contains(b) || trans(d5).contains(b) || trans(d6).contains(b)
                || trans(d7).contains(b) || trans(d8).contains(b) || trans(d9).contains(b) || trans(d10).contains(b)
                || trans(d11).contains(b) || trans(d12).contains(b)) {
            System.out.print("O player won");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (b1[i] == 0 || b2[i] == 0 || b3[i] == 0)
                return true;
        }
        System.out.print("It is a draw");
        return false;
    }

    public static String trans(int[] a) {
        String b = "0";
        int len = a.length;
        for (int i = 0; i < len; i++) {
            String c = String.valueOf(a[i]);
            b = b + c;
        }
        return b;
    }
}