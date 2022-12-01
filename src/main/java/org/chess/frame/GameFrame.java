package org.chess.frame;

import org.chess.board.pieces.Piece;
import org.chess.panel.GamePanel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel;
    static final Dimension SCREEN_SIZE = new Dimension(512, 512);
    public static Piece selectedPiece = null;

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

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                selectedPiece = Piece.getPiece(e.getX(), e.getY() - 36);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                int getY = e.getY() - 36;
                selectedPiece.move(e.getX() / 64, getY / 64);
                panel.repaint();
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
                if (selectedPiece != null){
                    selectedPiece.realMouseXPosition = e.getX() - 36;
                    selectedPiece.realMouseYPosition = e.getY() - 69;
                    panel.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }

}
