package org.chess.pieces;

import java.util.LinkedList;

public class Piece {
    public int realXPosition;
    public int realYPosition;
    public int xPosition;
    public int yPosition;

    public boolean isWhite; // Im using other colors than white, but this is for reference.
    LinkedList<Piece> pieces;
    public String pieceType;
    public Piece(int realXPosition, int realYPosition, boolean isWhite, String pieceType, LinkedList<Piece> pieces) {
        this.realXPosition = realXPosition;
        this.realYPosition = realYPosition;
        this.xPosition = realXPosition * 64;
        this.yPosition = realYPosition * 64;
        this.isWhite = isWhite;
        this.pieceType = pieceType;
        this.pieces = pieces;
        pieces.add(this);
    }

    public void move(int xPosition, int yPosition){
        for(Piece p: pieces){
            if(p.realXPosition == xPosition && p.realYPosition == yPosition){
                p.killThePiece();
            }
        }
        this.realXPosition = xPosition;
        this.realYPosition = yPosition;
        this.xPosition = realXPosition * 64;
        this.yPosition = realYPosition * 64;
    }

    public void killThePiece(){
        pieces.remove(this);
    }
}
