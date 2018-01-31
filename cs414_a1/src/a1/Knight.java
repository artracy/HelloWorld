package a1;

/*   
 *   File: Knight.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  Class for the Knight chess piece
 * 
 * 
 */

import java.util.ArrayList;

import a1.ChessPiece.Color;

public class Knight extends ChessPiece {

	public Knight(ChessBoard board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(color == Color.WHITE) {
			return "\u2658";
		}else if(color == Color.BLACK) {
			return "\u265E";
		}else
			return null;
	}

	@Override
	public ArrayList<String> legalMoves() {
		
		return null;
	}

}
