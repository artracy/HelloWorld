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
		int checkRow, checkColumn; 
		ArrayList<String> moves = null;
		String position;
		ChessPiece piece;
		
		//Test for legal moves to the upper right diagonal
		
		checkRow = row + 1;
		checkColumn = column +1;
		
		while(checkRow < 8 && checkColumn < 8) {
			position = posToString(checkRow, checkColumn);
			try {
				piece = board.getPiece(position);
				if (piece == null) {
					moves.add(position);
					continue;
				}
				if(piece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				
				e.printStackTrace();
			}
			checkRow++;
			checkColumn++;
		}
		
		//Test for legal moves to the upper Left diagonal
		
		checkRow = row + 1;
		checkColumn = column - 1;
		
		while(checkRow < 8 && checkColumn >= 0) {
			position = posToString(checkRow, checkColumn);
			try {
				piece = board.getPiece(position);
				if (piece == null) {
					moves.add(position);
					continue;
				}
				if(piece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				
				e.printStackTrace();
			}
			checkRow++;
			checkColumn--;
		}
		
		//Test for legal moves to the lower Right diagonal
		
		checkRow = row - 1;
		checkColumn = column + 1;
		
		while(checkRow >= 0 && checkColumn < 8) {
			position = posToString(checkRow, checkColumn);
			try {
				piece = board.getPiece(position);
				if (piece == null) {
					moves.add(position);
					continue;
				}
				if(piece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				
				e.printStackTrace();
			}
			checkRow--;
			checkColumn++;
		}
	
		
		//Test for legal moves to the lower Left diagonal
		
		checkRow = row - 1;
		checkColumn = column - 1;
				
		while(checkRow >= 0 && checkColumn >= 0) {
			position = posToString(checkRow, checkColumn);
			try {
				piece = board.getPiece(position);
				if (piece == null) {
					moves.add(position);
					continue;
				}
				if(piece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				e.printStackTrace();
			}
			checkRow--;
			checkColumn--;
		}
					
		// TODO Auto-generated method stub
		return moves;
	}

}
