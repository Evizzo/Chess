package org.chess.board.pieces;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Piece {
    public int xFieldPosition; // from 1 to 8
    public int yFieldPosition; // ^^
    public int realMouseXPosition; // from 1 to 512
    public int realMouseYPosition; // ^^

    public boolean isWhite; // Im using other colors than white, but this is for reference.
    public static LinkedList<Piece> pieces = new LinkedList<>();
    public String pieceType;
    public Piece(){
    }
    public Piece(int xFieldPosition, int yFieldPosition, boolean isWhite, String pieceType, LinkedList<Piece> pieces) {
        this.xFieldPosition = xFieldPosition;
        this.yFieldPosition = yFieldPosition;
        this.realMouseXPosition = xFieldPosition * 64;
        this.realMouseYPosition = yFieldPosition * 64;
        this.isWhite = isWhite;
        this.pieceType = pieceType;
        this.pieces = pieces;
        pieces.add(this);
    }

    public void move(int xPosition, int yPosition){
        for(Piece p: pieces){
            if(p.xFieldPosition == xPosition && p.yFieldPosition == yPosition){
                p.killThePiece();
            }
        }
    }

    public void killThePiece(){
        pieces.remove(this);
    }
    public void drawAllThePIeces(Graphics g){
        new Pawn();
        new Rook();
        new Knight();
        new Bishop();
        new King();
        new Queen();

        BufferedImage piecePack = null;
        try {
            piecePack = ImageIO.read(new File("src/main/resources/chess.png"));
        } catch (IOException e) {
            System.out.println("Reading chess.png went wrong.");
            throw new RuntimeException(e);
        }
        Image[] images = new Image[12];
        int ind=0;
        for(int y=0;y<400;y+=200){
            for(int x=0;x<1200;x+=200){
                images[ind]=piecePack.getSubimage(x, y, 200, 200).getScaledInstance(64, 64, BufferedImage.SCALE_SMOOTH);
                ind++;
            }
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
            g.drawImage(images[index], p.realMouseXPosition, p.realMouseYPosition, null);
        }
    }

    public static Piece getPiece(int x, int y){
        int xp = x / 64;
        int yp = y / 64;

        for (Piece p: pieces){
            if (p.xFieldPosition == xp && p.yFieldPosition == yp){
                return p;
            }
        }
        return null;
    }
}
