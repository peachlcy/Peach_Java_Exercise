package e11_6;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new Loan(1000));
        arrayList.add(new Circle(3));
        arrayList.add(new JFrame("peach"));
        arrayList.add(new Date("2021-12-10"));
        for (int i = 0; i < 4; i++) {
            System.out.println(arrayList.get(i).toString());
        }

    }
}
