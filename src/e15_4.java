import javax.swing.*;
import java.awt.*;

public class e15_4 extends JFrame {
    public e15_4() {
        add(new NewPanel());
    }
    public static void main(String[] args){
        System.out.println("222020335220187 赖楚芸 智科一班");
        e15_4 frame=new e15_4();
        frame.setTitle("Exercise15_4");
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}

class NewPanel extends JPanel{
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Multiplication Table",40,30);
        for (int i = 1; i < 10; i++) {
            String num=String.valueOf(i);
            g.drawString(num,10,i*20+50);
            g.drawString(num,i*20+20,50);
        }
        g.drawRect(30,55,200,200);
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <10 ; j++) {
                String num=String.valueOf(i*j);
                g.drawString(num,j*20+20,i*20+50);
            }
        }
    }
}
