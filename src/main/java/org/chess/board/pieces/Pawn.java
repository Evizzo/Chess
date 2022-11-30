package org.chess.board.pieces;

import static org.chess.board.pieces.Piece.pieces;

public class Pawn {
    public Pawn(){
        Piece bPawn1 = new Piece(1, 1, false, "pawn", pieces);
        Piece bPawn2 = new Piece(2, 1, false, "pawn", pieces);
        Piece bPawn3 = new Piece(3, 1, false, "pawn", pieces);
        Piece bPawn4 = new Piece(4, 1, false, "pawn", pieces);
        Piece bPawn5 = new Piece(5, 1, false, "pawn", pieces);
        Piece bPawn6 = new Piece(6, 1, false, "pawn", pieces);
        Piece bPawn7 = new Piece(7, 1, false, "pawn", pieces);
        Piece bPawn8 = new Piece(0, 1, false, "pawn", pieces);

        Piece wPawn1 = new Piece(1, 6, true, "pawn", pieces);
        Piece wPawn2 = new Piece(2, 6, true, "pawn", pieces);
        Piece wPawn3 = new Piece(3, 6, true, "pawn", pieces);
        Piece wPawn4 = new Piece(4, 6, true, "pawn", pieces);
        Piece wPawn5 = new Piece(5, 6, true, "pawn", pieces);
        Piece wPawn6 = new Piece(6, 6, true, "pawn", pieces);
        Piece wPawn7 = new Piece(7, 6, true, "pawn", pieces);
        Piece wPawn8 = new Piece(0, 6, true, "pawn", pieces);
    }

}
