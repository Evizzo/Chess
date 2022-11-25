package org.example;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel(){
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        boolean colorSwitcher = true;
        for(int y = 0; y<8; y++){
            for(int x = 0; x<8; x++){
                if(colorSwitcher){
                    g.setColor(new Color(243, 243, 186));
                }else{
                    g.setColor(new Color(85, 148, 133));
                }
                g.fillRect(x * 64, y * 64, 64, 64);
                colorSwitcher = !colorSwitcher;
            }
            colorSwitcher = !colorSwitcher;
        }
    }
}

