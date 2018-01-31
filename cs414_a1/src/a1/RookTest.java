package a1;

import java.util.ArrayList;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import a1.ChessPiece.Color;

import org.junit.Before;
import org.junit.After;
import org.junit.rules.ExpectedException;


class RookTest {
	
	ChessBoard board;
	
	@Before
	void newBoard() {
		board = new ChessBoard();
	}
	
	@After
	void clearBoard() {
		board = null;
	}
	
	/*
	 * Test to see if the Rook can be created as a white and as a black piece
	 * Test to see if the getColor function works.
	 */
		
	@Test
	void testCreateWhiteRook() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertTrue( testRook1 != null, "White Rook is null");
		assertTrue(testRook1.getClass() == Rook.class, "Piece is not a Rook");
		assertTrue(testRook1.getColor() == Color.WHITE, "Rook is the wrong color");		
	}
	
	@Test
	void testCreateBlackRook() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertTrue(testRook1 != null, "White Rook is null");
		assertTrue(testRook1.getClass() == Rook.class, "Piece is not a Rook");
		assertTrue(testRook1.getColor() == Color.BLACK, "Rook is the wrong color");
	}
	
	/*
	 * test for when the Rook is created with no color or no board
	 */
	
	@Test
	void testNoBoard() {
		Rook testRook1 = new Rook(null, Color.BLACK);
		assertTrue(testRook1 != null, "White Rook is null");
		assertTrue(testRook1.getClass() == Rook.class, "Piece is not a Rook");
		assertTrue(testRook1.getColor() == Color.BLACK, "Rook is the wrong color");
	}
	
	@Test
	void testNoColor() {
		Rook testRook1 = new Rook(board, null);
		assertTrue(testRook1 != null, "White Rook is null");
		assertTrue(testRook1.getClass() == Rook.class, "Piece is not a Rook");
		assertTrue(testRook1.getColor() == null, "Rook color is not null");
	}
	
	/*
	 * Test the toString method for the Rook
	 */
	
	@Test
	void testWhiteRookToString() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertEquals(testRook1.toString(), "\u2656", "White Rook has wrong string");
	}
	
	@Test
	void testBlackRookToString() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertEquals(testRook1.toString(), "\u265C", "Black Rook has wrong string");		
	}
	
	/*
	 * Set of test for the sePosition function
	 * These test will also in turn test the getPosition function in order to verify the position 
	 */
	
	/*
	 * Valid position tests
	 */
	
	@Test
	void testSetPositionA1White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		
		try{
			testRook1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testRook1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		
		try{
			testRook1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		
		try{
			testRook1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		
		try{
			testRook1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		
		try{
			testRook1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testRook1.getPosition(),  "No position should have been set");
	}
	
		
	@Test
	void testSetPositionA1Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		
		try{
			testRook1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testRook1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		
		try{
			testRook1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		
		try{
			testRook1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		
		try{
			testRook1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		
		try{
			testRook1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testRook1.getPosition(),  "No position should have been set");
	}
	
	/*
	 * Test Position can be moved
	 */
	@Test
	void testSetPositionD5toD8Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		
		try{
			testRook1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testRook1.getPosition(),  "No position should have been set");
		
		try{
			testRook1.setPosition("d8");
		}catch (Exception e){
			
		}		
		assertEquals("d8" ,testRook1.getPosition());
	}
	
	
	
	
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDWhite() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5White() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDBlack() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5Black() {
		Rook testRook1 = new Rook(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	
	/*
	 * Test the Rook for the list of legal moves on an open board 
	 */
	
	
	@Test
	void testRookA1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		board.placePiece(testRook1, "a1");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("a3"));
		assertTrue(moves.contains("a4"));
		assertTrue(moves.contains("a5"));
		assertTrue(moves.contains("a6"));
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("a8"));
		assertTrue(moves.contains("b1"));
		assertTrue(moves.contains("c1"));
		assertTrue(moves.contains("d1"));
		assertTrue(moves.contains("e1"));
		assertTrue(moves.contains("f1"));
		assertTrue(moves.contains("g1"));
		assertTrue(moves.contains("h1"));
		
	}
	
	@Test
	void testRookA8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		board.placePiece(testRook1, "a8");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("a3"));
		assertTrue(moves.contains("a4"));
		assertTrue(moves.contains("a5"));
		assertTrue(moves.contains("a6"));
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("a1"));
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("c8"));
		assertTrue(moves.contains("d8"));
		assertTrue(moves.contains("e8"));
		assertTrue(moves.contains("f8"));
		assertTrue(moves.contains("g8"));
		assertTrue(moves.contains("h8"));
		
	}
	
	@Test
	void testRookH1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		board.placePiece(testRook1, "h1");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("h3"));
		assertTrue(moves.contains("h4"));
		assertTrue(moves.contains("h5"));
		assertTrue(moves.contains("h6"));
		assertTrue(moves.contains("h7"));
		assertTrue(moves.contains("h8"));
		assertTrue(moves.contains("b1"));
		assertTrue(moves.contains("c1"));
		assertTrue(moves.contains("d1"));
		assertTrue(moves.contains("e1"));
		assertTrue(moves.contains("f1"));
		assertTrue(moves.contains("g1"));
		assertTrue(moves.contains("a1"));
		
	}
	
	@Test
	void testRookH8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		board.placePiece(testRook1, "h8");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("h3"));
		assertTrue(moves.contains("h4"));
		assertTrue(moves.contains("h5"));
		assertTrue(moves.contains("h6"));
		assertTrue(moves.contains("h7"));
		assertTrue(moves.contains("h1"));
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("c8"));
		assertTrue(moves.contains("d8"));
		assertTrue(moves.contains("e8"));
		assertTrue(moves.contains("f8"));
		assertTrue(moves.contains("g8"));
		assertTrue(moves.contains("a8"));
		
	}
	
	@Test
	void testRookE4OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		board.placePiece(testRook1, "e4");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("e1"));
		assertTrue(moves.contains("e2"));
		assertTrue(moves.contains("e3"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("e6"));
		assertTrue(moves.contains("e7"));
		assertTrue(moves.contains("e8"));
		assertTrue(moves.contains("a4"));
		assertTrue(moves.contains("b4"));
		assertTrue(moves.contains("c4"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("f4"));
		assertTrue(moves.contains("g4"));
		assertTrue(moves.contains("h4"));		
	}
	
	
	
	@Test
	void testRookA1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.BLACK);
		board.placePiece(testRook1, "a1");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("a3"));
		assertTrue(moves.contains("a4"));
		assertTrue(moves.contains("a5"));
		assertTrue(moves.contains("a6"));
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("a8"));
		assertTrue(moves.contains("b1"));
		assertTrue(moves.contains("c1"));
		assertTrue(moves.contains("d1"));
		assertTrue(moves.contains("e1"));
		assertTrue(moves.contains("f1"));
		assertTrue(moves.contains("g1"));
		assertTrue(moves.contains("h1"));
		
	}
	
	@Test
	void testRookA8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.BLACK);
		board.placePiece(testRook1, "a8");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("a3"));
		assertTrue(moves.contains("a4"));
		assertTrue(moves.contains("a5"));
		assertTrue(moves.contains("a6"));
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("a1"));
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("c8"));
		assertTrue(moves.contains("d8"));
		assertTrue(moves.contains("e8"));
		assertTrue(moves.contains("f8"));
		assertTrue(moves.contains("g8"));
		assertTrue(moves.contains("h8"));
		
	}
	
	@Test
	void testRookH1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.BLACK);
		board.placePiece(testRook1, "h1");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("h3"));
		assertTrue(moves.contains("h4"));
		assertTrue(moves.contains("h5"));
		assertTrue(moves.contains("h6"));
		assertTrue(moves.contains("h7"));
		assertTrue(moves.contains("h8"));
		assertTrue(moves.contains("b1"));
		assertTrue(moves.contains("c1"));
		assertTrue(moves.contains("d1"));
		assertTrue(moves.contains("e1"));
		assertTrue(moves.contains("f1"));
		assertTrue(moves.contains("g1"));
		assertTrue(moves.contains("a1"));
		
	}
	
	@Test
	void testRookH8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.BLACK);
		board.placePiece(testRook1, "h8");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("h3"));
		assertTrue(moves.contains("h4"));
		assertTrue(moves.contains("h5"));
		assertTrue(moves.contains("h6"));
		assertTrue(moves.contains("h7"));
		assertTrue(moves.contains("h1"));
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("c8"));
		assertTrue(moves.contains("d8"));
		assertTrue(moves.contains("e8"));
		assertTrue(moves.contains("f8"));
		assertTrue(moves.contains("g8"));
		assertTrue(moves.contains("a8"));
		
	}
	
	@Test
	void testRookE4OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.BLACK);
		board.placePiece(testRook1, "e4");
		moves = testRook1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 14);
		assertTrue(moves.contains("e1"));
		assertTrue(moves.contains("e2"));
		assertTrue(moves.contains("e3"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("e6"));
		assertTrue(moves.contains("e7"));
		assertTrue(moves.contains("e8"));
		assertTrue(moves.contains("a4"));
		assertTrue(moves.contains("b4"));
		assertTrue(moves.contains("c4"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("f4"));
		assertTrue(moves.contains("g4"));
		assertTrue(moves.contains("h4"));		
	}
	
	
	/*
	 * Test to see if the Rook will return the correct set of legal move on an occupied board.
	 */
	
	
	@Test
	void testRookE4OcuppiedBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		Rook testRook2 = new Rook(board, Color.WHITE);
		Rook testRook3 = new Rook(board, Color.WHITE);
		Rook testRook4 = new Rook(board, Color.BLACK);
		Rook testRook5 = new Rook(board, Color.BLACK);
		
		board.placePiece(testRook1, "e4");
		board.placePiece(testRook2, "b4");
		board.placePiece(testRook3, "g4");
		board.placePiece(testRook4, "e3");
		board.placePiece(testRook5, "e7");
		moves = testRook1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);		
		assertTrue(moves.contains("e3"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("e6"));
		assertTrue(moves.contains("e7"));
		assertTrue(moves.contains("c4"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("f4"));
		
	}
	
	@Test
	void testRookF6OcuppiedBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		Rook testRook1 = new Rook(board, Color.BLACK);
		Rook testRook2 = new Rook(board, Color.WHITE);
		Rook testRook3 = new Rook(board, Color.WHITE);
		Rook testRook4 = new Rook(board, Color.BLACK);
		Rook testRook5 = new Rook(board, Color.BLACK);
		
		board.placePiece(testRook1, "f6");
		board.placePiece(testRook2, "f8");
		board.placePiece(testRook3, "c6");
		board.placePiece(testRook4, "f3");
		board.placePiece(testRook5, "g6");
		moves = testRook1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);		
		assertTrue(moves.contains("f7"));
		assertTrue(moves.contains("f8"));
		assertTrue(moves.contains("f4"));
		assertTrue(moves.contains("f5"));
		assertTrue(moves.contains("c6"));
		assertTrue(moves.contains("d6"));
		assertTrue(moves.contains("e6"));
		
	}
	
	/*
	 * Test move rook to enemy piece location
	 */
	@Test
	void testRookSetPositionToTakePieceWhite() {
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.WHITE);
		Rook testRook2 = new Rook(board, Color.BLACK);
		
		board.placePiece(testRook1, "b2");
		board.placePiece(testRook2, "b2");			
			
		assertEquals("b2" ,testRook1.getPosition(),  "No position should have been set");
		
		board.placePiece(testRook1,"b3");
				
		assertEquals("b3" ,testRook1.getPosition());
	}
	
	@Test
	void testRookSetPositionToTakePieceBlack() {
		board = new ChessBoard();
		Rook testRook1 = new Rook(board, Color.BLACK);
		Rook testRook2 = new Rook(board, Color.WHITE);
		
		
			board.placePiece(testRook1,"e5");
			board.placePiece(testRook2,"g5");
		
		assertEquals("e5" ,testRook1.getPosition(),  "No position should have been set");		
		
			board.placePiece(testRook1,"g5");
			
		assertEquals("g5" ,testRook1.getPosition());
	}

}
