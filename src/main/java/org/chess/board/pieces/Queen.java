package org.chess.board.pieces;

import static org.chess.board.pieces.Piece.pieces;

public class Queen {
    public Queen(){
        Piece bQueen = new Piece(3, 0, false, "queen", pieces);

        Piece wQueen = new Piece(3, 7, true, "queen", pieces);
    }
}
