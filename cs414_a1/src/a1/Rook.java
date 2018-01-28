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
		int checkRow, checkColumn;
		ArrayList<String> moves = null;
		String position;
		ChessPiece piece;
		
		
		//Test for legal moves moving up
		
		for (checkRow = row + 1; checkRow < 8; checkRow ++) {
			position = posToString(checkRow, column);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		//Test for legal moves moving down
		
		for (checkRow = row - 1; checkRow >= 0; checkRow --) {
			position = posToString(checkRow, column);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Test for legal moves moving right
		
		for (checkColumn = column + 1; checkColumn < 8; checkColumn ++) {
			position = posToString(checkRow, column);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Test for legal moves moving left
		
		for (checkColumn = column - 1; checkColumn >= 0; checkColumn --) {
			position = posToString(checkRow, column);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub
		return moves;
	}

}
