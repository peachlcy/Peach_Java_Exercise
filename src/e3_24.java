import java.util.Scanner;

public class e3_24 {
    public static void main(String[] args) {
        System.out.println("智科1班 赖楚芸 222020335220187");
        Scanner input = new Scanner(System.in);
        String[] flower = {"Clubs", "Diamond", "Heart", "Spades"};
        String[] number = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int com1 = (int) (Math.random() * 100);
        int com2 = (int) (Math.random() * 100);
        int num1 = com1 % flower.length;
        int num2 = com2 % number.length;
        System.out.println("The card you picked is " + number[num2] + " of " + flower[num1]);
    }
}