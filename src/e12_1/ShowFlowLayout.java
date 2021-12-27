package e12_1;

import java.awt.*;
import javax.swing.*;

public class ShowFlowLayout extends JFrame {
    public ShowFlowLayout(){
        setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        add(new JPanel());
        add(new JButton("button 1"));
        add(new JButton("button 2"));
        add(new JButton("button 3"));
        add(new JPanel());
        add(new JButton("button 4"));
        add(new JButton("button 5"));
        add(new JButton("button 6"));

    }
}
