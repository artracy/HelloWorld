package a1;

import java.util.ArrayList;

import a1.ChessPiece.Color;

public class Bishop extends ChessPiece {

	public Bishop(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color == Color.WHITE) {
			return "\u2657";
		}else if(color == Color.BLACK) {
			return "\u265D";
		}else
			return null;
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
