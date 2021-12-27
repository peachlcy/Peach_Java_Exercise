import java.util.Scanner;

public class e4_34 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        int a = 0;
        int b = 0;
        while (a < 2 && b < 2) {
            int com = (int) (Math.random() * 100);
            int comp = com % 3;
            Scanner input = new Scanner(System.in);
            System.out.print("scissor(0),rock(1),paper(2): ");
            int user = input.nextInt();
            if (comp == 0 && user == 2) {
                System.out.println("The computer is scissor.You are paper.Computer won.");
                a=a+1;
            }
            if (comp == 0 && user == 1) {
                System.out.println("The computer is scissor.You are rock.You won.");
                b=b+1;
            }
            if (comp == 0 && user == 0)
                System.out.println("The computer is scissor.You are scissor too.It is a draw.");
            if (comp == 1 && user == 0) {
                System.out.println("The computer is rock.You are scissor.computer won.");
                a=a+1;
            }
            if (comp == 1 && user == 2) {
                System.out.println("The computer is rock.You are paper.You won.");
                b=b+1;
            }
            if (comp == 1 && user == 1)
                System.out.println("The computer is rock.You are rock too.It is a draw.");
            if (comp == 2 && user == 1) {
                System.out.println("The computer is paper.You are rock.computer won.");
                a=a+1;
            }
            if (comp == 2 && user == 0) {
                System.out.println("The computer is paper.You are scissor.You won.");
                b=b+1;
            }
            if (comp == 2 && user == 2)
                System.out.println("The computer is paper.You are paper too.It is a draw.");
            System.out.println(a+"  "+b);
        }
    }
}