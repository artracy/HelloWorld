package a1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import a1.ChessPiece.Color;

class QueenTest {
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
	 * Test to see if the Queen can be created as a white and as a black piece
	 * Test to see if the getColor function works.
	 */
		
	@Test
	void testCreateWhiteQueen() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertTrue( testQueen1 != null, "White Queen is null");
		assertTrue(testQueen1.getClass() == Queen.class, "Piece is not a Queen");
		assertTrue(testQueen1.getColor() == Color.WHITE, "Queen is the wrong color");		
	}
	
	@Test
	void testCreateBlackQueen() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertTrue(testQueen1 != null, "White Queen is null");
		assertTrue(testQueen1.getClass() == Queen.class, "Piece is not a Queen");
		assertTrue(testQueen1.getColor() == Color.BLACK, "Queen is the wrong color");
	}
	
	/*
	 * test for when the Queen is created with no color or no board
	 */
	
	@Test
	void testNoBoard() {
		Queen testQueen1 = new Queen(null, Color.BLACK);
		assertTrue(testQueen1 != null, "White Queen is null");
		assertTrue(testQueen1.getClass() == Queen.class, "Piece is not a Queen");
		assertTrue(testQueen1.getColor() == Color.BLACK, "Queen is the wrong color");
	}
	
	@Test
	void testNoColor() {
		Queen testQueen1 = new Queen(board, null);
		assertTrue(testQueen1 != null, "White Queen is null");
		assertTrue(testQueen1.getClass() == Queen.class, "Piece is not a Queen");
		assertTrue(testQueen1.getColor() == null, "Queen color is not null");
	}
	
	/*
	 * Test the toString method for the Queen
	 */
	
	@Test
	void testWhiteQueenToString() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertEquals(testQueen1.toString(), "\u2655", "White Queen has wrong string");
	}
	
	@Test
	void testBlackQueenToString() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertEquals(testQueen1.toString(), "\u265B", "Black Queen has wrong string");		
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
		Queen testQueen1 = new Queen(board, Color.WHITE);
		
		try{
			testQueen1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testQueen1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		
		try{
			testQueen1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		
		try{
			testQueen1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		
		try{
			testQueen1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		
		try{
			testQueen1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
		
	@Test
	void testSetPositionA1Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		
		try{
			testQueen1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testQueen1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		
		try{
			testQueen1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		
		try{
			testQueen1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		
		try{
			testQueen1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		
		try{
			testQueen1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testQueen1.getPosition(),  "No position should have been set");
	}
	
	/*
	 * Test Position can be moved
	 */
	@Test
	void testSetPositionD5toD8Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		
		try{
			testQueen1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testQueen1.getPosition(),  "No position should have been set");
		
		try{
			testQueen1.setPosition("d8");
		}catch (Exception e){
			
		}		
		assertEquals("d8" ,testQueen1.getPosition());
	}
	
	
	
	
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDWhite() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5White() {
		Queen testQueen1 = new Queen(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDBlack() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5Black() {
		Queen testQueen1 = new Queen(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testQueen1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testQueen1.getPosition() == null, "No position should have been set");
	}
	
	
	/*
	 * Test the Queen for the list of legal moves on an open board 
	 */
	
	
	@Test
	void testQueenA1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		Queen testQueen1 = new Queen(board, Color.WHITE);
		board.placePiece(testQueen1, "a1");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);		
	}
	
	@Test
	void testQueenA8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.WHITE);
		board.placePiece(testQueen1, "a8");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenH1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.WHITE);
		board.placePiece(testQueen1, "h1");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenH8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.WHITE);
		board.placePiece(testQueen1, "h8");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenE4OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.WHITE);
		board.placePiece(testQueen1, "e4");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);		
	}
	
	
	
	@Test
	void testQueenA1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.BLACK);
		board.placePiece(testQueen1, "a1");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenA8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.BLACK);
		board.placePiece(testQueen1, "a8");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenH1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.BLACK);
		board.placePiece(testQueen1, "h1");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenH8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.BLACK);
		board.placePiece(testQueen1, "h8");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenE4OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.BLACK);
		board.placePiece(testQueen1, "e4");
		moves = testQueen1.legalMoves();
		assertTrue(moves == null);		
	}
	
	
	/*
	 * Test to see if the Queen will return the correct set of legal move on an occupied board.
	 */
	
	
	@Test
	void testQueenE4OcuppiedBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.WHITE);
		Queen testQueen2 = new Queen(board, Color.WHITE);
		Queen testQueen3 = new Queen(board, Color.WHITE);
		Queen testQueen4 = new Queen(board, Color.BLACK);
		Queen testQueen5 = new Queen(board, Color.BLACK);
		
		board.placePiece(testQueen1, "e4");
		board.placePiece(testQueen2, "b4");
		board.placePiece(testQueen3, "g4");
		board.placePiece(testQueen4, "e3");
		board.placePiece(testQueen5, "e7");
		moves = testQueen1.legalMoves();
		
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testQueenF6OcuppiedBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		Queen testQueen1 = new Queen(board, Color.BLACK);
		Queen testQueen2 = new Queen(board, Color.WHITE);
		Queen testQueen3 = new Queen(board, Color.WHITE);
		Queen testQueen4 = new Queen(board, Color.BLACK);
		Queen testQueen5 = new Queen(board, Color.BLACK);
		
		board.placePiece(testQueen1, "f6");
		board.placePiece(testQueen2, "f8");
		board.placePiece(testQueen3, "c6");
		board.placePiece(testQueen4, "f3");
		board.placePiece(testQueen5, "g6");
		moves = testQueen1.legalMoves();
		
		assertTrue(moves == null);	
		
	}
	
	/*
	 * Test move rook to enemy piece location
	 */
	@Test
	void testQueenSetPositionToTakePieceWhite() {
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.WHITE);
		Queen testQueen2 = new Queen(board, Color.BLACK);
		
		board.placePiece(testQueen1, "b2");
		board.placePiece(testQueen2, "b2");			
			
		assertEquals("b2" ,testQueen1.getPosition(),  "No position should have been set");
		
		board.placePiece(testQueen1,"b3");
				
		assertEquals("b3" ,testQueen1.getPosition());
	}
	
	@Test
	void testQueenSetPositionToTakePieceBlack() {
		board = new ChessBoard();
		Queen testQueen1 = new Queen(board, Color.BLACK);
		Queen testQueen2 = new Queen(board, Color.WHITE);
		
		
			board.placePiece(testQueen1,"e5");
			board.placePiece(testQueen2,"g5");
		
		assertEquals("e5" ,testQueen1.getPosition(),  "No position should have been set");		
		
			board.placePiece(testQueen1,"g5");
			
		assertEquals("g5" ,testQueen1.getPosition());
	}

}
