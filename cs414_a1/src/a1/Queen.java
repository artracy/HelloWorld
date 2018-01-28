package a1;

import java.util.ArrayList;


public class Queen extends ChessPiece {

	public Queen(ChessBoard board, Color color) {
		super(board, color);		
	}

	
	@Override
	public String toString() {
		if(color == Color.WHITE) {
			return "\u2655";
		}else if(color == Color.BLACK) {
			return "\u265B";
		}else
			return null;
	}

	
	//Return null as the queen does not move
	@Override
	public ArrayList<String> legalMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
