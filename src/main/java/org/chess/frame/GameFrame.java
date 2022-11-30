package org.chess.frame;

import org.chess.panel.GamePanel;
import org.chess.board.pieces.Piece;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

import static org.chess.panel.GamePanel.pieces;

public class GameFrame extends JFrame {
    GamePanel panel;
    static final Dimension SCREEN_SIZE = new Dimension(512,512);
    public static Piece getPiece(int x, int y){
        int xp = x / 64;
        int yp = y / 64;

        for (Piece p: pieces){
            if (p.realXPosition == xp && p.realYPosition == yp){
                return p;
            }
        }
        return null;
    }
    public GameFrame(){
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Chess");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SCREEN_SIZE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println(getPiece(e.getX(), e.getY()).pieceType);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }
}
