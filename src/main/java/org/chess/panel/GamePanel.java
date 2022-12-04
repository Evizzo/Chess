package org.chess.panel;

import org.chess.board.Board;
import org.chess.board.pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GamePanel extends JPanel {
    public static Piece selectedPiece = null;
    public GamePanel(){
        this.setPreferredSize(new Dimension(512, 512));
        new Pawn();
        new Rook();
        new Knight();
        new Bishop();
        new King();
        new Queen();
        repaint();
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                selectedPiece = Piece.getPiece(e.getX(), e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                selectedPiece.move(e.getX() / 64, e.getY() / 64);
                repaint();
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
                    selectedPiece.realMouseYPosition = e.getY() - 36;
                    repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }
    @Override
    public void paint(Graphics g) {
        new Board(g);

        Piece piece = new Piece();
        piece.drawAllThePIeces(g);
    }
}

