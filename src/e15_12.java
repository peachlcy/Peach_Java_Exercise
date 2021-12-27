import javax.swing.*;
import java.awt.*;

public class e15_12 extends JFrame {
    public e15_12() {
        add(new NewSin());
    }

    public static void main(String[] args) {
        System.out.println("222020335220187 赖楚芸 智科一班");
        e15_12 frame = new e15_12();
        frame.setTitle("Exercise15_4");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


}

class NewSin extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Polygon p = new Polygon();
        for (int x = -100; x <= 100; x++) {
            p.addPoint(x + 200, 100 - (int) (50 * Math.sin((x / 100.0) * 2 * Math.PI)));
        }
        g.drawPolyline(p.xpoints, p.ypoints, p.npoints);
        g.drawLine(80, 100, 350, 100);
        g.drawLine(200, 30, 200, 190);
        g.drawLine(350, 100, 340, 90);
        g.drawLine(350, 100, 340, 110);
        g.drawLine(200, 30, 190, 40);
        g.drawLine(200, 30, 210, 40);
        g.drawString("-2\u03c0", 95, 115);
        g.drawString("2\u03c0", 305, 115);
        g.drawString("0", 200, 115);

    }
}

