package org.chess.frame;

import org.chess.panel.GamePanel;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    static final Dimension SCREEN_SIZE = new Dimension(512, 512);
    public GameFrame() {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Chess");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SCREEN_SIZE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

}
