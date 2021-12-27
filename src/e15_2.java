import javax.swing.*;
import java.awt.*;

public class e15_2 extends JPanel {
    public e15_2(){
//        setLayout(new GridLayout(100, 400,200,200));
        OvalButton button1=new OvalButton("OK");
        OvalButton button2=new OvalButton("Cancel");
        add(button1);
        add(button2);
    }
    public static void main(String[] args){
        System.out.println("222020335220187 赖楚芸 智科一班");
        JFrame frame=new JFrame();
        frame.add(new e15_2());
        frame.setTitle("Exercise15_2");
        frame.setSize(200,100);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class OvalButton extends JButton{
    public OvalButton() {
    }

    public OvalButton(String text) {
        super(text);
    }

    protected void paintComponent(Graphics g) {
        // Draw an oval
        super.paintComponent(g);
        g.drawOval(5, 5, getWidth() - 10, getHeight() - 10);
    }
}

