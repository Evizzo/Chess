package org.chess.board.pieces;

import static org.chess.board.pieces.Piece.pieces;

public class Bishop {
    public Bishop(){
        Piece bBishop = new Piece(2, 0, false, "bishop", pieces);
        Piece bBishop2 = new Piece(5, 0, false, "bishop", pieces);

        Piece wBishop = new Piece(2, 7, true, "bishop", pieces);
        Piece wBishop2 = new Piece(5, 7, true, "bishop", pieces);
    }
}
