package org.example;

import java.util.LinkedList;

public class Piece {
    int xPosition;
    int yPosition;
    boolean isWhite; // Im using other colors than white, but this is for reference.
    LinkedList<Piece> pieces;
    public Piece(int xPosition, int yPosition, boolean isWhite, LinkedList<Piece> pieces) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isWhite = isWhite;
        this.pieces = pieces;
        pieces.add(this);
    }

    public void move(int xPosition, int yPosition){
        for(Piece p: pieces){
            if(p.xPosition == xPosition && p.yPosition == yPosition){
                p.killingThePiece();
            }
        }
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void killingThePiece(){
        pieces.remove(this);
    }
}
