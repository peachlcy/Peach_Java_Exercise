package e9_3;

import java.util.ArrayList;

public class Check {
    public static boolean check(String password) {

        ArrayList<String> num = new ArrayList<>();
        ArrayList<String> letter = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
                num.add(String.valueOf(password.charAt(i)));
            else if ((password.charAt(i) <= 'Z' && password.charAt(i) >= 'A')
                    || (password.charAt(i) <= 'z' && password.charAt(i) >= 'a'))
                letter.add(String.valueOf(password.charAt(i)));
            else
                other.add(String.valueOf(password.charAt(i)));
        }
        if (num.size() < 2 || letter.size() < 1 || other.size() > 0 || password.length() < 8)
            return false;
        else
            return true;
    }
}
