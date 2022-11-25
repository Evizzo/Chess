package org.example;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    static final Dimension SCREEN_SIZE = new Dimension(512,548);
    GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Chess");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SCREEN_SIZE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
