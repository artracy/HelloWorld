package a1;
import java.util.*;

public abstract class ChessPiece {
	public enum Color {WHITE, BLACK};
	
	protected ChessBoard board; // the board it belongs to, default null
	protected int row; // the index of the horizontal rows 0..7
	protected int column; // the index of the vertical column 0..7
	protected Color color; // the color of the piece
	
	public ChessPiece(ChessBoard board, Color color) {
		
	}
	
	public Color getColor() {
		return null;
	}
	
	public String getPosition() {
		return null;
	}
	
	public void setPosition(String position) throws IllegalPositionException{
		
	}
	
	abstract public String toString();
	
	abstract public ArrayList<String> legalMoves();
	

}
