package org.chess.panel;

import org.chess.board.Board;
import org.chess.board.pieces.*;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){
        this.setPreferredSize(new Dimension(512, 512));
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        new Board(g);

        Piece piece = new Piece();
        piece.drawAllThePIeces(g);
    }
}

