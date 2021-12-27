import java.util.ArrayList;
import java.util.Scanner;

public class e9_11 {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string");
        String s= input.nextLine();
        System.out.println(sort(s));
    }

    public static String sort(String s) {
        char[] num = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            num[i] = (s.charAt(i));
        }
        char trans = '0';
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length()-1; j++) {
                if (num[j] >= num[j+1]) {
                    trans = num[j];
                    num[j] = num[j+1];
                    num[j+1] = trans;
                }
            }
        }
        String fin = "";
        for (int i = 0; i < s.length(); i++) {
            fin = fin + num[i];
        }
        return fin;
    }
}
