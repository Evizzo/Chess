package org.chess.panel;

import org.chess.board.pieces.Piece;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class GamePanel extends JPanel {
    public GamePanel(){
        this.setPreferredSize(new Dimension(512, 512));

        repaint();
    }
    public static LinkedList<Piece> pieces = new LinkedList<>();
    @Override
    public void paint(Graphics g) {
        BufferedImage piecePack = null;
        try {
            piecePack = ImageIO.read(new File("/home/stefan/IdeaProjects/Chess/src/main/resources/chess.png"));
        } catch (IOException e) {
            System.out.println("Reading chess.png went wrong.");
            throw new RuntimeException(e);
        }
        Image images[] = new Image[12];
        int ind=0;
        for(int y=0;y<400;y+=200){
            for(int x=0;x<1200;x+=200){
                images[ind]=piecePack.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                ind++;
            }
        }
        Piece bRook = new Piece(0, 0, false, "rook", pieces);
        Piece bKinght = new Piece(1, 0, false, "knight", pieces);
        Piece bBishop = new Piece(2, 0, false, "bishop", pieces);
        Piece bQueen = new Piece(3, 0, false, "queen", pieces);
        Piece bKing = new Piece(4, 0, false, "king", pieces);
        Piece bBishop2 = new Piece(5, 0, false, "bishop", pieces);
        Piece bKinght2 = new Piece(6, 0, false, "knight", pieces);
        Piece bRook2 = new Piece(7, 0, false, "rook", pieces);
        Piece bPawn1 = new Piece(1, 1, false, "pawn", pieces);
        Piece bPawn2 = new Piece(2, 1, false, "pawn", pieces);
        Piece bPawn3 = new Piece(3, 1, false, "pawn", pieces);
        Piece bPawn4 = new Piece(4, 1, false, "pawn", pieces);
        Piece bPawn5 = new Piece(5, 1, false, "pawn", pieces);
        Piece bPawn6 = new Piece(6, 1, false, "pawn", pieces);
        Piece bPawn7 = new Piece(7, 1, false, "pawn", pieces);
        Piece bPawn8 = new Piece(0, 1, false, "pawn", pieces);

        Piece wRook = new Piece(0, 7, true, "rook", pieces);
        Piece wKinght = new Piece(1, 7, true, "knight", pieces);
        Piece wBishop = new Piece(2, 7, true, "bishop", pieces);
        Piece wQueen = new Piece(3, 7, true, "queen", pieces);
        Piece wKing = new Piece(4, 7, true, "king", pieces);
        Piece wBishop2 = new Piece(5, 7, true, "bishop", pieces);
        Piece wKight2 = new Piece(6, 7, true, "knight", pieces);
        Piece wRook2 = new Piece(7, 7, true, "rook", pieces);
        Piece wPawn1 = new Piece(1, 6, true, "pawn", pieces);
        Piece wPawn2 = new Piece(2, 6, true, "pawn", pieces);
        Piece wPawn3 = new Piece(3, 6, true, "pawn", pieces);
        Piece wPawn4 = new Piece(4, 6, true, "pawn", pieces);
        Piece wPawn5 = new Piece(5, 6, true, "pawn", pieces);
        Piece wPawn6 = new Piece(6, 6, true, "pawn", pieces);
        Piece wPawn7 = new Piece(7, 6, true, "pawn", pieces);
        Piece wPawn8 = new Piece(0, 6, true, "pawn", pieces);


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
        for (Piece p: pieces){
            int index = 0;
            if(p.pieceType.equalsIgnoreCase("king")){
                index = 0;
            }
            if(p.pieceType.equalsIgnoreCase("queen")){
                index = 1;
            }
            if(p.pieceType.equalsIgnoreCase("bishop")){
                index = 2;
            }
            if(p.pieceType.equalsIgnoreCase("knight")){
                index = 3;
            }
            if(p.pieceType.equalsIgnoreCase("rook")){
                index = 4;
            }
            if(p.pieceType.equalsIgnoreCase("pawn")){
                index = 5;
            }
            if(!p.isWhite){
                index += 6;
            }
            g.drawImage(images[index], p.xPosition, p.yPosition, this);
        }
    }
}

