import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class e12_6 extends JFrame {
    private ImageIcon Icon1 = new ImageIcon("src/IMG_5694_副本.jpg");
    private ImageIcon Icon2 = new ImageIcon("src/IMG_5695_副本.jpg");
    private ImageIcon Icon3 = new ImageIcon("src/IMG_5892.JPG");
    private ImageIcon Icon4 = new ImageIcon("src/IMG_5893.JPG");

    public e12_6() {
        setLayout(new GridLayout(2, 2, 5, 5));
        JLabel l1 = new JLabel(Icon1);
        JLabel l2 = new JLabel(Icon2);
        JLabel l3 = new JLabel(Icon3);
        JLabel l4 = new JLabel(Icon4);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        Border lineBorder=new LineBorder(Color.BLACK,2);
        l1.setBorder(lineBorder);
        l2.setBorder(lineBorder);
        l3.setBorder(lineBorder);
        l4.setBorder(lineBorder);


    }

    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        e12_6 frame = new e12_6();
        frame.setTitle("图片");
        frame.setSize(800, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

