package a1;

/*   
 *   File: BishopTest.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  JUnit test class to test the Bishop class
 * 
 * 
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import a1.ChessPiece.Color;


class BishopTest {

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
	 * Test to see if the Bishop can be created as a white and as a black piece
	 * Test to see if the getColor function works.
	 */
	
	@Test	
	void testCreateWhiteBishop() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertTrue( testBishop1 != null, "White Bishop is null");
		assertTrue(testBishop1.getClass() == Bishop.class, "Piece is not a Bishop");
		assertTrue(testBishop1.getColor() == Color.WHITE, "Bishop is the wrong color");		
	}
	
	@Test
	void testCreateBlackBishop() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertTrue(testBishop1 != null, "White Bishop is null");
		assertTrue(testBishop1.getClass() == Bishop.class, "Piece is not a Bishop");
		assertTrue(testBishop1.getColor() == Color.BLACK, "Bishop is the wrong color");
	}
	
	/*
	 * test for when the Bishop is created with no color or no board
	 */
	
	@Test
	void testNoBoard() {
		Bishop testBishop1 = new Bishop(null, Color.BLACK);
		assertTrue(testBishop1 != null, "White Bishop is null");
		assertTrue(testBishop1.getClass() == Bishop.class, "Piece is not a Bishop");
		assertTrue(testBishop1.getColor() == Color.BLACK, "Bishop is the wrong color");
	}
	
	@Test
	void testNoColor() {
		Bishop testBishop1 = new Bishop(board, null);
		assertTrue(testBishop1 != null, "White Bishop is null");
		assertTrue(testBishop1.getClass() == Bishop.class, "Piece is not a Bishop");
		assertTrue(testBishop1.getColor() == null, "Bishop color is not null");
	}
	
	/*
	 * Test the toString method for the Bishop
	 */
	
	@Test
	void testWhiteBishopToString() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertEquals(testBishop1.toString(), "\u2657", "White Bishop has wrong string");
	}
	
	@Test
	void testBlackBishopToString() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertEquals(testBishop1.toString(), "\u265D", "Black Bishop has wrong string");		
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
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		
		try{
			testBishop1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testBishop1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		
		try{
			testBishop1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		
		try{
			testBishop1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		
		try{
			testBishop1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		
		try{
			testBishop1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
		
	@Test
	void testSetPositionA1Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		
		try{
			testBishop1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testBishop1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		
		try{
			testBishop1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		
		try{
			testBishop1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		
		try{
			testBishop1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		
		try{
			testBishop1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testBishop1.getPosition(),  "No position should have been set");
	}
	
	/*
	 * Test Position can be moved
	 */
	@Test
	void testSetPositionD5toD8Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		
		try{
			testBishop1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testBishop1.getPosition(),  "No position should have been set");
		
		try{
			testBishop1.setPosition("d8");
		}catch (Exception e){
			
		}		
		assertEquals("d8" ,testBishop1.getPosition());
	}
	
	
	
	
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDWhite() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5White() {
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDBlack() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5Black() {
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testBishop1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testBishop1.getPosition() == null, "No position should have been set");
	}
	
	
	/*
	 * Test the Bishop for the list of legal moves on an open board 
	 */
	
	
	@Test
	void testBishopA1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		board.placePiece(testBishop1, "a1");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("b2"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("f6"));
		assertTrue(moves.contains("g7"));
		assertTrue(moves.contains("h8"));		
		
	}
	
	@Test
	void testBishopA8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		board.placePiece(testBishop1, "a8");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("b7"));
		assertTrue(moves.contains("c6"));
		assertTrue(moves.contains("d5"));
		assertTrue(moves.contains("e4"));
		assertTrue(moves.contains("f3"));
		assertTrue(moves.contains("g2"));
		assertTrue(moves.contains("h1"));		
		
	}
	
	@Test
	void testBishopH1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		board.placePiece(testBishop1, "h1");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("g2"));
		assertTrue(moves.contains("f3"));
		assertTrue(moves.contains("e4"));
		assertTrue(moves.contains("d5"));
		assertTrue(moves.contains("c6"));
		assertTrue(moves.contains("b7"));
		assertTrue(moves.contains("a8"));		
		
	}
	
	@Test
	void testBishopH8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		board.placePiece(testBishop1, "h8");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("g7"));
		assertTrue(moves.contains("f6"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("b2"));
		assertTrue(moves.contains("a1"));
		
	}
	
	@Test
	void testBishopC7OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		board.placePiece(testBishop1, "c7");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 9);
		assertTrue(moves.contains("b8"));
		assertTrue(moves.contains("d8"));
		assertTrue(moves.contains("b6"));
		assertTrue(moves.contains("d6"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("a5"));
		assertTrue(moves.contains("f4"));
		assertTrue(moves.contains("g3"));
		assertTrue(moves.contains("h2"));
	
	}
	
	
	
	@Test
	void testBishopA1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		board.placePiece(testBishop1, "a1");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("b2"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("f6"));
		assertTrue(moves.contains("g7"));
		assertTrue(moves.contains("h8"));	
		
	}
	
	@Test
	void testBishopA8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		board.placePiece(testBishop1, "a8");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("b7"));
		assertTrue(moves.contains("c6"));
		assertTrue(moves.contains("d5"));
		assertTrue(moves.contains("e4"));
		assertTrue(moves.contains("f3"));
		assertTrue(moves.contains("g2"));
		assertTrue(moves.contains("h1"));
		
	}
	
	@Test
	void testBishopH1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		board.placePiece(testBishop1, "h1");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("g2"));
		assertTrue(moves.contains("f3"));
		assertTrue(moves.contains("e4"));
		assertTrue(moves.contains("d5"));
		assertTrue(moves.contains("c6"));
		assertTrue(moves.contains("b7"));
		assertTrue(moves.contains("a8"));	
		
	}
	
	@Test
	void testBishopH8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		board.placePiece(testBishop1, "h8");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);
		assertTrue(moves.contains("g7"));
		assertTrue(moves.contains("f6"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("b2"));
		assertTrue(moves.contains("a1"));
		
	}
	
	@Test
	void testBishopE4OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		board.placePiece(testBishop1, "d4");
		moves = testBishop1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 13);
		assertTrue(moves.contains("c5"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("b6"));
		assertTrue(moves.contains("f6"));
		assertTrue(moves.contains("a7"));
		assertTrue(moves.contains("g7"));
		assertTrue(moves.contains("h8"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("e3"));
		assertTrue(moves.contains("b2"));
		assertTrue(moves.contains("f2"));
		assertTrue(moves.contains("a1"));
		assertTrue(moves.contains("g1"));
		
	}
	
	
	/*
	 * Test to see if the Bishop will return the correct set of legal move on an occupied board.
	 */
	
	
	@Test
	void testBishopC4OcuppiedBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		Bishop testBishop2 = new Bishop(board, Color.WHITE);
		Bishop testBishop3 = new Bishop(board, Color.WHITE);
		Bishop testBishop4 = new Bishop(board, Color.BLACK);
		Bishop testBishop5 = new Bishop(board, Color.BLACK);
		
		board.placePiece(testBishop1, "c4");
		board.placePiece(testBishop2, "e2");
		board.placePiece(testBishop3, "a6");
		board.placePiece(testBishop4, "a2");
		board.placePiece(testBishop5, "d5");
		moves = testBishop1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 5);		
		assertTrue(moves.contains("b5"));
		assertTrue(moves.contains("b3"));
		assertTrue(moves.contains("a2"));
		assertTrue(moves.contains("d5"));
		assertTrue(moves.contains("d3"));
		
	}
	
	@Test
	void testBishopF6OcuppiedBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		Bishop testBishop2 = new Bishop(board, Color.WHITE);
		Bishop testBishop3 = new Bishop(board, Color.WHITE);
		Bishop testBishop4 = new Bishop(board, Color.BLACK);
		Bishop testBishop5 = new Bishop(board, Color.BLACK);
		
		board.placePiece(testBishop1, "f6");
		board.placePiece(testBishop2, "h8");
		board.placePiece(testBishop3, "b2");
		board.placePiece(testBishop4, "h4");
		board.placePiece(testBishop5, "e7");
		moves = testBishop1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 7);		
		assertTrue(moves.contains("g7"));
		assertTrue(moves.contains("h8"));
		assertTrue(moves.contains("e5"));
		assertTrue(moves.contains("d4"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("b2"));
		assertTrue(moves.contains("g5"));
		
	}
	
	/*
	 * Test move rook to enemy piece location
	 */
	@Test
	void testBishopSetPositionToTakePieceWhite() {
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.WHITE);
		Bishop testBishop2 = new Bishop(board, Color.BLACK);
		
		board.placePiece(testBishop1, "b2");
		board.placePiece(testBishop2, "b2");			
			
		assertEquals("b2" ,testBishop1.getPosition(),  "No position should have been set");
		
		board.placePiece(testBishop1,"b3");
				
		assertEquals("b3" ,testBishop1.getPosition());
	}
	
	@Test
	void testBishopSetPositionToTakePieceBlack() {
		board = new ChessBoard();
		Bishop testBishop1 = new Bishop(board, Color.BLACK);
		Bishop testBishop2 = new Bishop(board, Color.WHITE);
		
		
			board.placePiece(testBishop1,"e5");
			board.placePiece(testBishop2,"g5");
		
		assertEquals("e5" ,testBishop1.getPosition(),  "No position should have been set");		
		
			board.placePiece(testBishop1,"g5");
			
		assertEquals("g5" ,testBishop1.getPosition());
	}

}
