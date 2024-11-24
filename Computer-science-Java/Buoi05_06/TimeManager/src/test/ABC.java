package test;

import javax.swing.*;
import java.awt.*;

public class ABC {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("JLayeredPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Tạo JLayeredPane
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400, 300));

        // Tạo JLabel 1 (ở lớp thấp)
        JLabel label1 = new JLabel("Label 1");
        label1.setOpaque(true);
        label1.setBackground(Color.CYAN);
        label1.setBounds(50, 50, 100, 50);
        layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);

        // Tạo JLabel 2 (ở lớp cao hơn)
        JLabel label2 = new JLabel("Label 2");
        label2.setOpaque(true);
        label2.setBackground(Color.YELLOW);
        label2.setBounds(100, 80, 100, 50);
        layeredPane.add(label2, JLayeredPane.PALETTE_LAYER);

        // Tạo JLabel 3 (ở lớp cao nhất)
        JLabel label3 = new JLabel("Label 3");
        label3.setOpaque(true);
        label3.setBackground(Color.RED);
        label3.setBounds(150, 110, 100, 50);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        // Thêm JLayeredPane vào JFrame
        frame.add(layeredPane);
        frame.pack();
        frame.setVisible(true);
    }
}
