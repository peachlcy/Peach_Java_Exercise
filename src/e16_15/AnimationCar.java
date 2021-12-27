package e16_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationCar extends JFrame {
    public AnimationCar() {
        add(new MovingCarPanel());
    }

    public static void main(String[] args) {
        AnimationCar frame = new AnimationCar();
        System.out.println("222020335220187 赖楚芸 智科一班");
        frame.setTitle("Exercise16_15");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    static class MovingCarPanel extends JPanel {
        public int xCoordinate = 20;
        public int yCoordinate = 80;

        public MovingCarPanel() {
            Timer timer = new Timer(1000, new TimeListener());
            timer.start();

        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            xCoordinate+=5;
            g.setColor(Color.black);
            g.fillOval(xCoordinate + 10, yCoordinate-10 , 10, 10);
            g.setColor(Color.black);
            g.fillOval(xCoordinate + 30, yCoordinate-10 , 10, 10);

            g.setColor(Color.gray);
            g.fillRect(xCoordinate, yCoordinate - 20, 50, 10);

            g.setColor(Color.black);
            int[] a = {xCoordinate + 20, xCoordinate + 30, xCoordinate + 40, xCoordinate + 10};
            int[] b = {yCoordinate - 30, yCoordinate - 30, yCoordinate - 20, yCoordinate - 20};
            g.fillPolygon(a, b, a.length);
        }

        class TimeListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        }
    }
}