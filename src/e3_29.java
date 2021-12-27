import java.util.Scanner;

public class e3_29 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r1's center x-, y-coordinates, and radius: ");
        String a = input.nextLine();
        String[] r1 = a.split(" ");
        Double[] r1num = {Double.parseDouble(r1[0]), Double.parseDouble(r1[1]), Double.parseDouble(r1[2])};
        System.out.println("Enter r2's center x-, y-coordinates, and radius: ");
        String b = input.nextLine();
        String[] r2 = b.split(" ");
        Double[] r2num = {Double.parseDouble(r2[0]), Double.parseDouble(r2[1]), Double.parseDouble(r2[2])};
        double d1 = Math.abs(r1num[2] - r2num[2]);
        double d2 = Math.sqrt(Math.pow(r1num[0] - r2num[0], 2) + Math.pow(r1num[1] - r2num[1], 2));
        double d3 = r1num[2] + r2num[2];
        if (d2 <= d1)
            System.out.println("circle2 is inside circle1");
        else if (d2 <= d3)
            System.out.println("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");


    }
}