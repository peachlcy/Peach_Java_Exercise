public class e2_15 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        int a = 100;
        double rate = 0.05;
        double b = 0;
        for (int i = 0; i < 6; i++) {
            double amount = (100 + b) * (rate / 12 + 1);
            b = amount;
            System.out.printf("%.3f\n", amount);
        }
    }
}
