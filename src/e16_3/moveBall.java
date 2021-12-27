package e16_3;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class moveBall extends JFrame {
    private JButton jButton1 = new JButton("Left");
    private JButton jButton2 = new JButton("Right");
    private JButton jButton3 = new JButton("Up");
    private JButton jButton4 = new JButton("Down");
    private BallPanel canvas=new BallPanel();

    public moveBall() {
        JPanel panel = new JPanel();
        panel.add(jButton1);
        panel.add(jButton2);
        panel.add(jButton3);
        panel.add(jButton4);

        this.add(canvas);
        this.add(panel,BorderLayout.SOUTH);

        jButton1.addActionListener(new LeftListener());
        jButton2.addActionListener(new RightListener());
        jButton3.addActionListener(new UpListener());
        jButton4.addActionListener(new DownListener());
    }

    class LeftListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            canvas.Left();
        }
    }
        class RightListener implements ActionListener{
            public void actionPerformed(ActionEvent e){
                canvas.Right();

            }
    }
    class UpListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            canvas.Up();

        }
    }
    class DownListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            canvas.Down();

        }
    }
}