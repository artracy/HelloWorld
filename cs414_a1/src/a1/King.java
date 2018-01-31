package a1;

/*   
 *   File: King.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  Class for the King chess piece
 * 
 * 
 */
import java.util.ArrayList;

import a1.ChessPiece.Color;

public class King extends ChessPiece {

	public King(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color == Color.WHITE) {
			return "\u2654";
		}else if(color == Color.BLACK) {
			return "\u265A";
		}else
			return null;
	}

	@Override
	public ArrayList<String> legalMoves() {

		int checkRow, checkColumn; 
		ArrayList<String> moves = new ArrayList<String>();
		String position;
		ChessPiece otherPiece;
		
		for (checkRow = row -1 ; checkRow <= row +1; checkRow++) {
			for (checkColumn = column -1; checkColumn <= column +1; checkColumn++) {				
				
				if((checkRow == row && checkColumn == column) ||
						checkRow <  0 || checkRow >= 8 ||
						checkColumn < 0 || checkColumn >= 8) {					
					
					continue;
				}
					
				position = posToString(checkRow, checkColumn);
				
				try {
					otherPiece = board.getPiece(position);
					if (otherPiece == null) {
						moves.add(position);
						continue;
					}
					
					if(otherPiece.getColor() != color) {
						moves.add(position);
					}								
					
				} catch (IllegalPositionException e) {					
					e.printStackTrace();
				}
			}
		}
		
		
		return moves;
	}

}
