package chess.pieces;

import bordgame.Board;
import chess.chess.chess.ChessPiece;

import java.awt.*;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }
}
