public class e6_23 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        boolean[] num = new boolean[100];
        for (int i = 1; i <= 100; i++) {
            cabinet(num, i);
        }
        for (int i = 0; i < 100; i++) {
            if (num[i])
                System.out.print("L" + (i + 1) + " ");
        }
    }

    public static void cabinet(boolean[] num, int student) {
        for (int i = student - 1; i < 100; i++) {
            if ((i + 1) % student == 0)
                num[i] = !num[i];
        }
    }
}