package chess;

import bordgame.Board;
import bordgame.Piece;
import bordgame.Position;

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

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}