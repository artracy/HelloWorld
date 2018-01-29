package a1;
import java.util.*;

public abstract class ChessPiece {
	public enum Color {WHITE, BLACK};
	
	
	protected ChessBoard board = null; // the board it belongs to, default null
	protected int row = 8; // the index of the horizontal rows 0..7
	protected int column = 8; // the index of the vertical column 0..7
	protected Color color = null; // the color of the piece
	
	public ChessPiece(ChessBoard board, Color color) {
		this.board = board;
		this.color = color;		
	}
	
	//This method returns the color of the piece.
	public Color getColor() {
		return color;
	}
	
	//This method returns the position of the piece in the format single letter (a..h) followed by a single digit (1..8).
	public String getPosition() {
		if (row == 8 || column == 8)
			return null;
		
		String position = "";
		position += (char) ('a'+ column);
		position += (char) ('1'+ row);
		
		return position;
		
	}
	
	/*This method sets the position of the piece to the appropriate row and column based on the argument, 
	 *which in the format single letter (a..h) followed by a single digit (1..8). 
	
	 *If the position is illegal because the string contains illegal characters or represents a position 
	 *outside the board, the exception is thrown.
	 */
	public void setPosition(String position) throws IllegalPositionException{
		int newRow, newColumn;
		ArrayList<String> moves;
		
		if(position.length() != 2)
			throw new IllegalPositionException("Invalid string size");
		
		newColumn = position.charAt(0) - 'a';
		newRow = position.charAt(1) - '1';
		
		if( (newRow < 0) || (7 < newRow) )
			throw new IllegalPositionException("Invalid row");
		
		if( (newColumn < 0) || (7 < newColumn) )
			throw new IllegalPositionException("Invalid column");
		
	/*	moves = this.legalMoves();
		
		if(moves.contains(position)) {
			row = newRow;
			column = newColumn;
		}
			*/

	}
	
	abstract public String toString();
	
	abstract public ArrayList<String> legalMoves();	
	
	protected String posToString(int row, int column) {
		String position = "";
		position += (char) ('a'+ column);
		position += (char) ('1'+ row);
		
		return position;
	}
		

}
