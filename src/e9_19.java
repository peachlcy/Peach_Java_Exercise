import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class e9_19 {
    public static void main(String[] args) throws IOException {
        System.out.println("222020335220187 赖楚芸 智科一班");
        File file = new File("Exercise9_19.txt");
        FileOutputStream fop = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
        for (int i = 0; i < 100; i++) {
            String num = String.valueOf((int)(Math.random() * 100));
            writer.append(num).append(" ");
        }
        writer.close();
        fop.close();
        InputStream is = new FileInputStream(new File("Exercise9_19.txt"));
        Scanner input=new Scanner(new File("Exercise9_19.txt"));
        int[] numbers=new int[100];
        for (int i = 0; i <100; i++) {
           numbers[i]=input.nextInt();
        }
        is.close();
        Arrays.sort(numbers);
        for (int i :numbers) {
            System.out.print(i+"  ");
        }


    }
}
