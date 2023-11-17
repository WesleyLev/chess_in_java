package aplication;


import chess.ChessException;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

       ChessMath chessMath = new ChessMath();
       try {

           while (true) {
               UI.clearScreen();
               UI.printBoard(chessMath.getPieces());
               System.out.println();
               System.out.print("Source: ");
               ChessPosition source = UI.readChessPosition(sc);


               boolean[][] possibleMoves = chessMath.posibleMoves(source);
               UI.clearScreen();
               UI.printBoard(chessMath.getPieces(), possibleMoves);

               System.out.println();
               System.out.print("Target: ");
               ChessPosition target = UI.readChessPosition(sc);

               ChessPiece capturedPiece =  chessMath.performChessMove(source, target);


           }
       }
           catch(ChessException o1) {
               System.out.println(o1.getMessage());
               sc.nextLine();
           }


        catch(InputMismatchException o){
               System.out.println(o.getMessage());
               sc.nextLine();
           }


       }

    }

