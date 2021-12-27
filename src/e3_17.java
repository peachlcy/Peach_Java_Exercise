import java.util.Scanner;

public class e3_17 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        int com = (int) (Math.random() * 100);
        int comp = com % 3;
        Scanner input = new Scanner(System.in);
        System.out.print("scissor(0),rock(1),paper(2): ");
        int user = input.nextInt();
        if (comp == 0 && user == 2)
            System.out.print("The computer is scissor.You are paper.Computer won.");
        if (comp == 0 && user == 1)
            System.out.print("The computer is scissor.You are rock.You won.");
        if (comp == 0 && user == 0)
            System.out.print("The computer is scissor.You are scissor too.It is a draw.");
        if (comp == 1 && user == 0)
            System.out.print("The computer is rock.You are scissor.computer won.");
        if (comp == 1 && user == 2)
            System.out.print("The computer is rock.You are paper.You won.");
        if (comp == 1 && user == 1)
            System.out.print("The computer is rock.You are rock too.It is a draw.");
        if (comp == 2 && user == 1)
            System.out.print("The computer is paper.You are rock.computer won.");
        if (comp == 2 && user == 0)
            System.out.print("The computer is paper.You are scissor.You won.");
        if (comp == 2 && user == 2)
            System.out.print("The computer is paper.You are paper too.It is a draw.");
    }
}
