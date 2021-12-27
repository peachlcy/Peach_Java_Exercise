package e16_3;

import javax.swing.*;
import java.awt.*;

class BallPanel extends JPanel {
    private int radius = 50;
    private int x =20;
    private int y = 80;


    public void Left() {
        x=x-5;
        repaint();
    }

    public void Right() {
        x=x+5;
        repaint();
    }

    public void Up() {
        y=y-5;
        repaint();
    }

    public void Down() {
        y=y+5;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(x, y, 2 * radius, 2 * radius);
    }
}
