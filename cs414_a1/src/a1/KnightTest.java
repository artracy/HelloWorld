package a1;

/*   
 *   File: KnightTest.java
 *   Name: Andrew Tracy
 *   Data: 20180121
 *   Course: CS 414
 *   Assignment: A1
 *   Desc:  JUnit test class to test the Knight class
 * 
 * 
 */


import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import a1.ChessPiece.Color;

class KnightTest {
	
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
	 * Test to see if the Knight can be created as a white and as a black piece
	 * Test to see if the getColor function works.
	 */
		
	@Test
	void testCreateWhiteKnight() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertTrue( testKnight1 != null, "White Knight is null");
		assertTrue(testKnight1.getClass() == Knight.class, "Piece is not a Knight");
		assertTrue(testKnight1.getColor() == Color.WHITE, "Knight is the wrong color");		
	}
	
	@Test
	void testCreateBlackKnight() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertTrue(testKnight1 != null, "White Knight is null");
		assertTrue(testKnight1.getClass() == Knight.class, "Piece is not a Knight");
		assertTrue(testKnight1.getColor() == Color.BLACK, "Knight is the wrong color");
	}
	
	/*
	 * test for when the Knight is created with no color or no board
	 */
	
	@Test
	void testNoBoard() {
		Knight testKnight1 = new Knight(null, Color.BLACK);
		assertTrue(testKnight1 != null, "White Knight is null");
		assertTrue(testKnight1.getClass() == Knight.class, "Piece is not a Knight");
		assertTrue(testKnight1.getColor() == Color.BLACK, "Knight is the wrong color");
	}
	
	@Test
	void testNoColor() {
		Knight testKnight1 = new Knight(board, null);
		assertTrue(testKnight1 != null, "White Knight is null");
		assertTrue(testKnight1.getClass() == Knight.class, "Piece is not a Knight");
		assertTrue(testKnight1.getColor() == null, "Knight color is not null");
	}
	
	/*
	 * Test the toString method for the Knight
	 */
	
	@Test
	void testWhiteKnightToString() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertEquals(testKnight1.toString(), "\u2658", "White Knight has wrong string");
	}
	
	@Test
	void testBlackKnightToString() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertEquals(testKnight1.toString(), "\u265E", "Black Knight has wrong string");		
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
		Knight testKnight1 = new Knight(board, Color.WHITE);
		
		try{
			testKnight1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testKnight1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		
		try{
			testKnight1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		
		try{
			testKnight1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		
		try{
			testKnight1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		
		try{
			testKnight1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
		
	@Test
	void testSetPositionA1Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		
		try{
			testKnight1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testKnight1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		
		try{
			testKnight1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		
		try{
			testKnight1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		
		try{
			testKnight1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		
		try{
			testKnight1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testKnight1.getPosition(),  "No position should have been set");
	}
	
	/*
	 * Test Position can be moved
	 */
	@Test
	void testSetPositionD5toD8Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		
		try{
			testKnight1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testKnight1.getPosition(),  "No position should have been set");
		
		try{
			testKnight1.setPosition("d8");
		}catch (Exception e){
			
		}		
		assertEquals("d8" ,testKnight1.getPosition());
	}
	
	
	
	
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDWhite() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5White() {
		Knight testKnight1 = new Knight(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDBlack() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5Black() {
		Knight testKnight1 = new Knight(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testKnight1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testKnight1.getPosition() == null, "No position should have been set");
	}
	
	
	/*
	 * Test the Knight for the list of legal moves on an open board 
	 */
	
	
	@Test
	void testKnightA1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		Knight testKnight1 = new Knight(board, Color.WHITE);
		board.placePiece(testKnight1, "a1");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);		
	}
	
	@Test
	void testKnightA8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.WHITE);
		board.placePiece(testKnight1, "a8");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightH1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.WHITE);
		board.placePiece(testKnight1, "h1");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightH8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.WHITE);
		board.placePiece(testKnight1, "h8");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightE4OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.WHITE);
		board.placePiece(testKnight1, "e4");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);		
	}
	
	
	
	@Test
	void testKnightA1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.BLACK);
		board.placePiece(testKnight1, "a1");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightA8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.BLACK);
		board.placePiece(testKnight1, "a8");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightH1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.BLACK);
		board.placePiece(testKnight1, "h1");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightH8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.BLACK);
		board.placePiece(testKnight1, "h8");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightE4OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.BLACK);
		board.placePiece(testKnight1, "e4");
		moves = testKnight1.legalMoves();
		assertTrue(moves == null);		
	}
	
	
	/*
	 * Test to see if the Knight will return the correct set of legal move on an occupied board.
	 */
	
	
	@Test
	void testKnightE4OcuppiedBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.WHITE);
		Knight testKnight2 = new Knight(board, Color.WHITE);
		Knight testKnight3 = new Knight(board, Color.WHITE);
		Knight testKnight4 = new Knight(board, Color.BLACK);
		Knight testKnight5 = new Knight(board, Color.BLACK);
		
		board.placePiece(testKnight1, "e4");
		board.placePiece(testKnight2, "b4");
		board.placePiece(testKnight3, "g4");
		board.placePiece(testKnight4, "e3");
		board.placePiece(testKnight5, "e7");
		moves = testKnight1.legalMoves();
		
		assertTrue(moves == null);	
		
	}
	
	@Test
	void testKnightF6OcuppiedBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		
		Knight testKnight1 = new Knight(board, Color.BLACK);
		Knight testKnight2 = new Knight(board, Color.WHITE);
		Knight testKnight3 = new Knight(board, Color.WHITE);
		Knight testKnight4 = new Knight(board, Color.BLACK);
		Knight testKnight5 = new Knight(board, Color.BLACK);
		
		board.placePiece(testKnight1, "f6");
		board.placePiece(testKnight2, "f8");
		board.placePiece(testKnight3, "c6");
		board.placePiece(testKnight4, "f3");
		board.placePiece(testKnight5, "g6");
		moves = testKnight1.legalMoves();
		
		assertTrue(moves == null);	
		
	}
	
	/*
	 * Test move rook to enemy piece location
	 */
	@Test
	void testKnightSetPositionToTakePieceWhite() {
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.WHITE);
		Knight testKnight2 = new Knight(board, Color.BLACK);
		
		board.placePiece(testKnight1, "b2");
		board.placePiece(testKnight2, "b2");			
			
		assertEquals("b2" ,testKnight1.getPosition(),  "No position should have been set");
		
		board.placePiece(testKnight1,"b3");
				
		assertEquals("b3" ,testKnight1.getPosition());
	}
	
	@Test
	void testKnightSetPositionToTakePieceBlack() {
		board = new ChessBoard();
		Knight testKnight1 = new Knight(board, Color.BLACK);
		Knight testKnight2 = new Knight(board, Color.WHITE);
		
		
			board.placePiece(testKnight1,"e5");
			board.placePiece(testKnight2,"g5");
		
		assertEquals("e5" ,testKnight1.getPosition(),  "No position should have been set");		
		
			board.placePiece(testKnight1,"g5");
			
		assertEquals("g5" ,testKnight1.getPosition());
	}

}
