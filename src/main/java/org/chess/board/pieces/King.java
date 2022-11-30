package org.chess.board.pieces;

import static org.chess.board.pieces.Piece.pieces;

public class King {
    public King(){
        Piece bKing = new Piece(4, 0, false, "king", pieces);

        Piece wKing = new Piece(4, 7, true, "king", pieces);
    }
}
