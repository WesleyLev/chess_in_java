package chess;

import bordgame.Board;
import bordgame.Piece;

import java.awt.*;
import java.awt.Color;

public abstract class ChessPiece extends Piece {


    private java.awt.Color color;

    public ChessPiece(Board board, java.awt.Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
