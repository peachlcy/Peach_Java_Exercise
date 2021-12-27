import javax.swing.*;
import java.awt.*;

public class e12_10 extends JFrame {
    public e12_10() {
        setLayout(new GridLayout(10, 10));
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a = a + 1;
                if (a % 2 != 0) {
                    for (int j = 0; j < 5; j++) {
                        JButton white = new JButton("█");
                        white.setForeground(Color.white);
                        JButton black = new JButton("█");
                        black.setForeground(Color.black);
                        add(white);
                        add(black);
                    }
                } else {
                    for (int j = 0; j < 5; j++) {
                    JButton black = new JButton("█");
                    black.setForeground(Color.black);
                    JButton white = new JButton("█");
                    white.setForeground(Color.white);
                    add(black);
                    add(white);
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("222020335220187 赖楚芸 智科一班");
        JFrame frame=new e12_10();
        frame.setTitle("chessboard");
        frame.setSize(200,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
