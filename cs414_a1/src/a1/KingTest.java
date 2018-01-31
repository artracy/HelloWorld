package a1;

/*   
 *   File: KingTest.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  JUnit test class to test the King class
 * 
 * 
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import a1.ChessPiece.Color;

class KingTest {

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
	 * Test to see if the King can be created as a white and as a black piece
	 * Test to see if the getColor function works.
	 */
		
	@Test
	void testCreateWhiteKing() {
		King testKing1 = new King(board, Color.WHITE);
		assertTrue( testKing1 != null, "White King is null");
		assertTrue(testKing1.getClass() == King.class, "Piece is not a King");
		assertTrue(testKing1.getColor() == Color.WHITE, "King is the wrong color");		
	}
	
	@Test
	void testCreateBlackKing() {
		King testKing1 = new King(board, Color.BLACK);
		assertTrue(testKing1 != null, "White King is null");
		assertTrue(testKing1.getClass() == King.class, "Piece is not a King");
		assertTrue(testKing1.getColor() == Color.BLACK, "King is the wrong color");
	}
	
	/*
	 * test for when the King is created with no color or no board
	 */
	
	@Test
	void testNoBoard() {
		King testKing1 = new King(null, Color.BLACK);
		assertTrue(testKing1 != null, "White King is null");
		assertTrue(testKing1.getClass() == King.class, "Piece is not a King");
		assertTrue(testKing1.getColor() == Color.BLACK, "King is the wrong color");
	}
	
	@Test
	void testNoColor() {
		King testKing1 = new King(board, null);
		assertTrue(testKing1 != null, "White King is null");
		assertTrue(testKing1.getClass() == King.class, "Piece is not a King");
		assertTrue(testKing1.getColor() == null, "King color is not null");
	}
	
	/*
	 * Test the toString method for the King
	 */
	
	@Test
	void testWhiteKingToString() {
		King testKing1 = new King(board, Color.WHITE);
		assertEquals(testKing1.toString(), "\u2654", "White King has wrong string");
	}
	
	@Test
	void testBlackKingToString() {
		King testKing1 = new King(board, Color.BLACK);
		assertEquals(testKing1.toString(), "\u265A", "Black King has wrong string");		
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
		King testKing1 = new King(board, Color.WHITE);
		
		try{
			testKing1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testKing1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8White() {
		King testKing1 = new King(board, Color.WHITE);
		
		try{
			testKing1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1White() {
		King testKing1 = new King(board, Color.WHITE);
		
		try{
			testKing1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8White() {
		King testKing1 = new King(board, Color.WHITE);
		
		try{
			testKing1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5White() {
		King testKing1 = new King(board, Color.WHITE);
		
		try{
			testKing1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testKing1.getPosition(),  "No position should have been set");
	}
	
		
	@Test
	void testSetPositionA1Black() {
		King testKing1 = new King(board, Color.BLACK);
		
		try{
			testKing1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testKing1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8Black() {
		King testKing1 = new King(board, Color.BLACK);
		
		try{
			testKing1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1Black() {
		King testKing1 = new King(board, Color.BLACK);
		
		try{
			testKing1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8Black() {
		King testKing1 = new King(board, Color.BLACK);
		
		try{
			testKing1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5Black() {
		King testKing1 = new King(board, Color.BLACK);
		
		try{
			testKing1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testKing1.getPosition(),  "No position should have been set");
	}
	
	/*
	 * Test Position can be moved
	 */
	@Test
	void testSetPositionD5toD8Black() {
		King testKing1 = new King(board, Color.BLACK);
		
		try{
			testKing1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testKing1.getPosition(),  "No position should have been set");
		
		try{
			testKing1.setPosition("d8");
		}catch (Exception e){
			
		}		
		assertEquals("d8" ,testKing1.getPosition());
	}
	
	
	
	
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0White() {
		King testKing1 = new King(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9White() {
		King testKing1 = new King(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1White() {
		King testKing1 = new King(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8White() {
		King testKing1 = new King(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDWhite() {
		King testKing1 = new King(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5White() {
		King testKing1 = new King(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0Black() {
		King testKing1 = new King(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9Black() {
		King testKing1 = new King(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1Black() {
		King testKing1 = new King(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8Black() {
		King testKing1 = new King(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDBlack() {
		King testKing1 = new King(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5Black() {
		King testKing1 = new King(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKing1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testKing1.getPosition() == null, "No position should have been set");
	}
	
	
	/*
	 * Test the King for the list of legal moves on an open board 
	 */
	
	
	@Test
	void testKingA1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		board.placePiece(testKing1, "a1");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("b1"));
		assertTrue(moves.contains("b2"));		
		
	}
	
	@Test
	void testKingA8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		board.placePiece(testKing1, "a8");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("b7"));
		
		
	}
	
	@Test
	void testKingH1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		board.placePiece(testKing1, "h1");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("g1"));
		assertTrue(moves.contains("g2"));
		
		
	}
	
	@Test
	void testKingH8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		board.placePiece(testKing1, "h8");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("h7"));
		assertTrue(moves.contains("g8"));
		assertTrue(moves.contains("g7"));
		
		
	}
	
	@Test
	void testKingE4OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		board.placePiece(testKing1, "e4");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 8);
		assertTrue(moves.contains("d3"));
		assertTrue(moves.contains("e3"));
		assertTrue(moves.contains("f3"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("f4"));
		assertTrue(moves.contains("d5"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("f5"));		
	}
	
	
	
	@Test
	void testKingA1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.BLACK);
		board.placePiece(testKing1, "a1");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("b1"));
		assertTrue(moves.contains("b2"));
		
	}
	
	@Test
	void testKingA8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.BLACK);
		board.placePiece(testKing1, "a8");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("b7"));
		
	}
	
	@Test
	void testKingH1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.BLACK);
		board.placePiece(testKing1, "h1");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("g1"));
		assertTrue(moves.contains("g2"));
		
	}
	
	@Test
	void testKingH8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.BLACK);
		board.placePiece(testKing1, "h8");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);
		assertTrue(moves.contains("h7"));
		assertTrue(moves.contains("g8"));
		assertTrue(moves.contains("g7"));
		
	}
	
	@Test
	void testKingB6OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.BLACK);
		board.placePiece(testKing1, "b6");
		moves = testKing1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 8);
		assertTrue(moves.contains("a5"));
		assertTrue(moves.contains("b5"));
		assertTrue(moves.contains("c5"));
		assertTrue(moves.contains("a6"));
		assertTrue(moves.contains("c6"));
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("b7"));
		assertTrue(moves.contains("c7"));
				
	}
	
	
	/*
	 * Test to see if the King will return the correct set of legal move on an occupied board.
	 */
	
	
	@Test
	void testKingG2OcuppiedBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		King testKing2 = new King(board, Color.WHITE);
		King testKing3 = new King(board, Color.WHITE);
		King testKing4 = new King(board, Color.BLACK);
		King testKing5 = new King(board, Color.BLACK);
		
		board.placePiece(testKing1, "g2");
		board.placePiece(testKing2, "g1");
		board.placePiece(testKing3, "f3");
		board.placePiece(testKing4, "h2");
		board.placePiece(testKing5, "h3");
		moves = testKing1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 6);		
		assertTrue(moves.contains("f1"));
		assertTrue(moves.contains("f2"));
		assertTrue(moves.contains("g3"));
		assertTrue(moves.contains("h1"));
		assertTrue(moves.contains("h2"));
		assertTrue(moves.contains("h3"));
		
	}
	
	@Test
	void testKingF6OcuppiedBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		King testKing1 = new King(board, Color.BLACK);
		King testKing2 = new King(board, Color.WHITE);
		King testKing3 = new King(board, Color.WHITE);
		King testKing4 = new King(board, Color.BLACK);
		King testKing5 = new King(board, Color.BLACK);
		
		board.placePiece(testKing1, "f6");
		board.placePiece(testKing2, "f7");
		board.placePiece(testKing3, "e6");
		board.placePiece(testKing4, "g5");
		board.placePiece(testKing5, "g6");
		moves = testKing1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 6);		
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("e6"));
		assertTrue(moves.contains("e7"));
		assertTrue(moves.contains("f5"));
		assertTrue(moves.contains("f7"));
		assertTrue(moves.contains("g7"));

		
	}
	
	/*
	 * Test move rook to enemy piece location
	 */
	@Test
	void testKingSetPositionToTakePieceWhite() {
		board = new ChessBoard();
		King testKing1 = new King(board, Color.WHITE);
		King testKing2 = new King(board, Color.BLACK);
		
		board.placePiece(testKing1, "b2");
		board.placePiece(testKing2, "b2");			
			
		assertEquals("b2" ,testKing1.getPosition(),  "No position should have been set");
		
		board.placePiece(testKing1,"b3");
				
		assertEquals("b3" ,testKing1.getPosition());
	}
	
	@Test
	void testKingSetPositionToTakePieceBlack() {
		board = new ChessBoard();
		King testKing1 = new King(board, Color.BLACK);
		King testKing2 = new King(board, Color.WHITE);
		
		
			board.placePiece(testKing1,"e5");
			board.placePiece(testKing2,"g5");
		
		assertEquals("e5" ,testKing1.getPosition(),  "No position should have been set");		
		
			board.placePiece(testKing1,"g5");
			
		assertEquals("g5" ,testKing1.getPosition());
	}

}