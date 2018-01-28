package a1;

import java.util.ArrayList;

public class ChessBoard {
	
	public static void main(String[] args) {
		ChessBoard board = new ChessBoard();
		String thing = board.toString();
		System.out.print(thing);
	}
	
	
////////////////////////////////////////////////////////////////////////////	
	
	
	
	//[Row][Coulmn]
	private ChessPiece[][] board;
	
	//The no-arg constructor ChessBoard() initializes the board to an 8X8 array with all empty squares. An empty square is null.
	ChessBoard() {
		board = new ChessPiece[8][8];
		for(int x =0; x <= 7; x++) {
			for(int y = 0; y <= 7; y++) {
				board[x][y] = null;
			}
		}
		initialize();
	}
	
	//In the initial position, the white king at e1 is at index [0][4]. The black queen at d8 is at index [7][3].
	
	/*This method initializes the board to the standard chess opening state with indexing as shown in the 
	 * figure. This method should use the constructors of the appropriate pieces, and call placePiece 
	 * below to place the newly constructed pieces in the right position.
	 */	
	public void initialize() {
		
		placePiece(new Rook(this, ChessPiece.Color.WHITE), "a1");
		placePiece(new Knight(this, ChessPiece.Color.WHITE), "b1");
		placePiece(new Bishop(this, ChessPiece.Color.WHITE), "c1");
		placePiece(new Queen(this, ChessPiece.Color.WHITE), "d1");
		placePiece(new King(this, ChessPiece.Color.WHITE), "e1");
		placePiece(new Bishop(this, ChessPiece.Color.WHITE), "f1");
		placePiece(new Knight(this, ChessPiece.Color.WHITE), "g1");
		placePiece(new Rook(this, ChessPiece.Color.WHITE), "h1");		
		
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "a2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "b2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "c2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "d2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "e2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "f2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "g2");
		placePiece(new Pawn(this, ChessPiece.Color.WHITE), "h2");
		
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "a7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "b7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "c7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "d7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "e7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "f7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "g7");
		placePiece(new Pawn(this, ChessPiece.Color.BLACK), "h7");
		
		placePiece(new Rook(this, ChessPiece.Color.BLACK), "a8");
		placePiece(new Knight(this, ChessPiece.Color.BLACK), "b8");
		placePiece(new Bishop(this, ChessPiece.Color.BLACK), "c8");
		placePiece(new Queen(this, ChessPiece.Color.BLACK), "d8");
		placePiece(new King(this, ChessPiece.Color.BLACK), "e8");
		placePiece(new Bishop(this, ChessPiece.Color.BLACK), "f8");
		placePiece(new Knight(this, ChessPiece.Color.BLACK), "g8");
		placePiece(new Rook(this, ChessPiece.Color.BLACK), "h8");		
		
		
	}
	
	
	/*This method returns the chess piece at a given position. The position is represented as a two-character
	 *  string (e.g., e8) as described above. The first letter is in lowercase (a..h) and the second letter 
	 *  is a digit (1..8). If the position is illegal because the string contains illegal characters or 
	 *  represents a position outside the board, the exception is thrown.
	 */	
	public ChessPiece getPiece(String position) throws IllegalPositionException {
		int newRow, newColumn;
				
		positionCheck(position);
		
		newColumn = position.charAt(0) - 'a';
		newRow = position.charAt(1) - '1';
		
		return board[newRow][newColumn];
		
	}
	
	
	
	/*This method tries to place the given piece at a given position, and returns true if successful, 
	 * and false if there is already a piece of the same player in the given position or the position was 
	 * illegal for any of the two reasons mentioned in the description of getPiece. If an opponent's piece 
	 * exists, that piece is captured. If successful, this method should call an appropriate method in the 
	 * ChessPiece class (i.e., setPosition) to set the piece's position.
	 */	
	public boolean placePiece(ChessPiece piece, String position) {
		int newRow, newColumn;
		
		if(piece != null) {
			try {
				positionCheck(position);
			
				if (getPiece(position) != null)
					if (piece.getColor() == getPiece(position).getColor()) {
						return false;
					}
			
				piece.setPosition(position);
			
			}catch (IllegalPositionException e) {
				return false;
			}		
		}
		
		newColumn = position.charAt(0) - 'a';
		newRow = position.charAt(1) - '1';
		
		board[newRow][newColumn] = piece;			
		
		return true;
	}
	
	
	/* This method checks if moving the piece from the fromPosition to toPosition is a legal move. 
	 * Legality is defined based on the rules described above in Section 2.1. If the move is legal, 
	 * it executes the move, changing the value of the board as needed. Otherwise, the stated exception is thrown.
	 */
	public void move(String fromPosition, String toPosition) throws IllegalMoveException{
		ChessPiece piece;
		int oldRow, oldColumn;
		ArrayList<String> moves;
		
		try {			
			piece = getPiece(fromPosition);
			positionCheck(toPosition);
			
		}catch (IllegalPositionException e) {
			throw new IllegalMoveException(e.getMessage());
		}
		
		
		if (piece == null)
			throw new IllegalMoveException("No piece at start location");
		moves = piece.legalMoves();
		
		
		if (moves.contains(toPosition)) {
			if(placePiece(piece, toPosition)) {
				oldColumn = fromPosition.charAt(0) - 'a';
				oldRow = fromPosition.charAt(1) - '1';
				board[oldRow][oldColumn] = null;
			}else {
				throw new IllegalMoveException("Unable to make the move");
			}
			
		}else {
			throw new IllegalMoveException("Not a legal Move");
		}
			
		
		
	}
	
	private void positionCheck(String position)  throws IllegalPositionException{
		int newRow, newColumn;
		
		if(position.length() != 2)
			throw new IllegalPositionException("Invalid string size");
		
		newColumn = position.charAt(0) - 'a';
		newRow = position.charAt(1) - '1';
		
		if( (newRow < 0) || (7 < newRow) )
			throw new IllegalPositionException("Invalid row");
		
		if( (newColumn < 0) || (7 < newColumn) )
			throw new IllegalPositionException("Invalid column");		
		
		
	}
	
	public String toString() {
		String chess="";
	    String upperLeft = "\u250C";
	    String upperRight = "\u2510";
	    String horizontalLine = "\u2500";
	    String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
	    String verticalLine = "\u2502";
	    String upperT = "\u252C";
	    String bottomLeft = "\u2514";
	    String bottomRight = "\u2518";
	    String bottomT = "\u2534";
	    String plus = "\u253C";
	    String leftT = "\u251C";
	    String rightT = "\u2524";

	    String topLine = upperLeft;
	    for (int i = 0; i<7; i++){
	        topLine += horizontal3 + upperT;
	    }
	    topLine += horizontal3 + upperRight;

	    String bottomLine = bottomLeft;
	    for (int i = 0; i<7; i++){
	        bottomLine += horizontal3 + bottomT;
	    }
	    bottomLine += horizontal3 + bottomRight;
	    chess+=topLine + "\n";

	    for (int row = 7; row >=0; row--){
	        String midLine = "";
	        for (int col = 0; col < 8; col++){
	            if(board[row][col]==null) {
	                midLine += verticalLine + " \u3000 ";
	            } else {midLine += verticalLine + " "+board[row][col]+" ";}
	        }
	        midLine += verticalLine;
	        String midLine2 = leftT;
	        for (int i = 0; i<7; i++){
	            midLine2 += horizontal3 + plus;
	        }
	        midLine2 += horizontal3 + rightT;
	        chess+=midLine+ "\n";
	        if(row>=1)
	            chess+=midLine2+ "\n";
	    }

	    chess+=bottomLine;
	    return chess;
	}
	

}
