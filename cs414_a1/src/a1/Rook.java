package a1;

import java.util.ArrayList;

import a1.ChessPiece.Color;

public class Rook extends ChessPiece {
		
	public Rook(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color == Color.WHITE) {
			return "\u2656";
		}else if(color == Color.BLACK) {
			return "\u265C";
		}else
			return null;
	}

	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
