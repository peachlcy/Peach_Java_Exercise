import java.util.Scanner;

public class e3_28 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        String a = input.nextLine();
        String[] r1 = a.split(" ");
        Double[] r1num = {Double.parseDouble(r1[0]), Double.parseDouble(r1[1]), Double.parseDouble(r1[2]), Double.parseDouble(r1[3])};
        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        String b = input.nextLine();
        String[] r2 = b.split(" ");
        Double[] r2num = {Double.parseDouble(r2[0]), Double.parseDouble(r2[1]), Double.parseDouble(r2[2]), Double.parseDouble(r2[3])};
        double d1 = Math.abs(r1num[0] - r2num[0]);
        double d2 = Math.abs(r1num[1] - r2num[1]);
        double d3 = Math.abs(r1num[2] - r2num[2] / 2);
        double d4 = Math.abs(r1num[3] - r2num[3] / 2);
        if (d1 <= d3 && d2 <= d4)
            System.out.println("r2 is inside r1");
        else if (d1 <= d3 ||
                d2 <= d4)
            System.out.println("r2 overlaps r1");
        else
            System.out.println("r2 does not overlaps r1");

    }
}
