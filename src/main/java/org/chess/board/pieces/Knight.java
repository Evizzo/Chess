package org.chess.board.pieces;

import static org.chess.board.pieces.Piece.pieces;
public class Knight {
    public Knight(){
        Piece bKnight = new Piece(1, 0, false, "knight", pieces);
        Piece bKnight2 = new Piece(6, 0, false, "knight", pieces);

        Piece wKnight = new Piece(1, 7, true, "knight", pieces);
        Piece wKnight2 = new Piece(6, 7, true, "knight", pieces);

    }
}
