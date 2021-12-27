

public class e4_7 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        double a = 10000;
        double rate = 0.05;
        double s = 0;
        for (int i = 0; i < 14; i++) {
            double amount = (rate + 1) * a;
            a = amount;
            if (i == 9)
                System.out.printf("%.3f\n", amount);
            if (i > 9)
                s = s + amount;
            if (i == 13)
                System.out.printf("%.3f\n", s);
        }

    }
}