import java.util.Random;


public class e4_44 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        int n = 0;
        for (int i = 0; i < 10000000; i++) {
            double x = Math.random()*4;
            double y = Math.random()*4;
            if (x < 2)
                n = n + 1;
            else if (x > 2 && y > 2 && y <= -x + 6)
                n = n + 1;
        }
        System.out.println(n / 10000000d);
    }
}