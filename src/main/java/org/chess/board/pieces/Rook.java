package org.chess.board.pieces;

import static org.chess.board.pieces.Piece.pieces;

public class Rook {
    public Rook(){
        Piece bRook = new Piece(0, 0, false, "rook", pieces);
        Piece bRook2 = new Piece(7, 0, false, "rook", pieces);

        Piece wRook = new Piece(0, 7, true, "rook", pieces);
        Piece wRook2 = new Piece(7, 7, true, "rook", pieces);
    }
}
