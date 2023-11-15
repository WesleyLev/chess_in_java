package chess.pieces;

import bordgame.Board;
import chess.ChessPiece;

import java.awt.*;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "K";
    }


    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRow()][getBoard().getColumn()];
        return mat;
    }
}
