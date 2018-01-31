package a1;

import java.util.ArrayList;

import a1.ChessPiece.Color;

public class Pawn extends ChessPiece {

	public Pawn(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color == Color.WHITE) {
			return "\u2659";
		}else if(color == Color.BLACK) {
			return "\u265F";
		}else
			return null;
	}

	@Override
	public ArrayList<String> legalMoves() {
		
		int checkRow, checkColumn, direction; 
		ArrayList<String> moves = new ArrayList<String>();
		String position;
		ChessPiece otherPiece;
		
		
		direction = (color == Color.WHITE) ? 1 : -1;
		
		if( !((row == 0) && (color == Color.BLACK)) && !((row == 7) && (color == Color.WHITE))) {
			
			position = posToString(row + direction, column);
			try {
				otherPiece = board.getPiece(position);
				
				if (otherPiece == null) {
					moves.add(position);
					
					if (((row == 1) && (color == Color.WHITE)) || ((row == 6) && (color == Color.BLACK))) {
						position = posToString(row + (direction*2), column);
						otherPiece = board.getPiece(position);
						
						if (otherPiece == null) {
							moves.add(position);
						}
					}
				}	
				
				if (column < 7 ) {
					position = posToString(row + direction, column + 1);
					otherPiece = board.getPiece(position);
					
					if (otherPiece != null) {
						if(otherPiece.color != color)
							moves.add(position);
					}
				}
				
				if (column > 0 ) {
					position = posToString(row + direction, column - 1);
					otherPiece = board.getPiece(position);
					
					if (otherPiece != null) {
						if(otherPiece.color != color)
							moves.add(position);
					}
				}				
				
	
			} catch (IllegalPositionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
				
		return moves;
	}

}
