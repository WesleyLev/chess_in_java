package chess;

import chess.chess.chess.ChessPiece;

public class ChessException extends RuntimeException{
    private static final long serialVersionUID = 1L;


    public ChessException(String msg){
        super(msg);
    }
}
