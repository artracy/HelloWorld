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
		ArrayList<String> moves = new ArrayList<String>();
		String position;
		ChessPiece otherPiece;
		
		//Test for legal moves to the upper right diagonal
		
		checkRow = row + 1;
		checkColumn = column +1;
		
		while(checkRow < 8 && checkColumn < 8) {
			position = posToString(checkRow, checkColumn);
			try {
				otherPiece = board.getPiece(position);
				if (otherPiece == null) {
					moves.add(position);
					checkRow++;
					checkColumn++;
					continue;
				}
				if(otherPiece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				
				e.printStackTrace();
			}
			
		}
		
		//Test for legal moves to the upper Left diagonal
		
		checkRow = row + 1;
		checkColumn = column - 1;
		
		while(checkRow < 8 && checkColumn >= 0) {
			position = posToString(checkRow, checkColumn);
			try {
				otherPiece = board.getPiece(position);
				if (otherPiece == null) {
					moves.add(position);
					checkRow++;
					checkColumn--;
					continue;
				}
				if(otherPiece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				
				e.printStackTrace();
			}
			
		}
		
		//Test for legal moves to the lower Right diagonal
		
		checkRow = row - 1;
		checkColumn = column + 1;
		
		while(checkRow >= 0 && checkColumn < 8) {
			position = posToString(checkRow, checkColumn);
			try {
				otherPiece = board.getPiece(position);
				if (otherPiece == null) {
					moves.add(position);
					checkRow--;
					checkColumn++;
					continue;
				}
				if(otherPiece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				
				e.printStackTrace();
			}
			
		}
	
		
		//Test for legal moves to the lower Left diagonal
		
		checkRow = row - 1;
		checkColumn = column - 1;
				
		while(checkRow >= 0 && checkColumn >= 0) {
			position = posToString(checkRow, checkColumn);
			try {
				otherPiece = board.getPiece(position);
				if (otherPiece == null) {
					moves.add(position);
					checkRow--;
					checkColumn--;
					continue;
				}
				if(otherPiece.getColor() == color) {
					break;
				}else {
					moves.add(position);
					break;
				}				
			} catch (IllegalPositionException e) {
				e.printStackTrace();
			}
			
		}
					
		// TODO Auto-generated method stub
		return moves;
	}

}
