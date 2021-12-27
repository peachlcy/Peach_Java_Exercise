import java.util.Scanner;


public class e6_1 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        System.out.print("Enter " + num + " scores: ");
        input.nextLine();
        String score = input.nextLine();
        String[] scores = score.split(" ");
        int best=best(scores,num);
        for (int i = 0; i < num; i++) {
            System.out.println("Student "+i+" score is "+scores[i]+" and grade is "+eva(scores[i],best));
        }
    }

    public static int best(String[] scores, int num) {
        int best = 0;
        for (int i = 0; i < num; i++) {
            int a = Integer.parseInt(scores[i]);
            if (best < a)
                best = a;
        }
        return best;
    }

    public static String eva(String s, int best) {
        String[] eva = {"A", "B", "C", "D"};
        int a = Integer.parseInt(s);
        if (a >= best - 10)
            return eva[0];
        else if (a >= best - 20)
            return eva[1];
        else if (a >= best - 30)
            return eva[2];
        else
            return eva[3];


    }
}