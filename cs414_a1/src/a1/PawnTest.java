package a1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import a1.ChessPiece.Color;

class PawnTest {

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
	 * Test to see if the Pawn can be created as a white and as a black piece
	 * Test to see if the getColor function works.
	 */
		
	@Test
	void testCreateWhitePawn() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertTrue( testPawn1 != null, "White Pawn is null");
		assertTrue(testPawn1.getClass() == Pawn.class, "Piece is not a Pawn");
		assertTrue(testPawn1.getColor() == Color.WHITE, "Pawn is the wrong color");		
	}
	
	@Test
	void testCreateBlackPawn() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertTrue(testPawn1 != null, "White Pawn is null");
		assertTrue(testPawn1.getClass() == Pawn.class, "Piece is not a Pawn");
		assertTrue(testPawn1.getColor() == Color.BLACK, "Pawn is the wrong color");
	}
	
	/*
	 * test for when the Pawn is created with no color or no board
	 */
	
	@Test
	void testNoBoard() {
		Pawn testPawn1 = new Pawn(null, Color.BLACK);
		assertTrue(testPawn1 != null, "White Pawn is null");
		assertTrue(testPawn1.getClass() == Pawn.class, "Piece is not a Pawn");
		assertTrue(testPawn1.getColor() == Color.BLACK, "Pawn is the wrong color");
	}
	
	@Test
	void testNoColor() {
		Pawn testPawn1 = new Pawn(board, null);
		assertTrue(testPawn1 != null, "White Pawn is null");
		assertTrue(testPawn1.getClass() == Pawn.class, "Piece is not a Pawn");
		assertTrue(testPawn1.getColor() == null, "Pawn color is not null");
	}
	
	/*
	 * Test the toString method for the Pawn
	 */
	
	@Test
	void testWhitePawnToString() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertEquals(testPawn1.toString(), "\u2659", "White Pawn has wrong string");
	}
	
	@Test
	void testBlackPawnToString() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertEquals(testPawn1.toString(), "\u265F", "Black Pawn has wrong string");		
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
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		
		try{
			testPawn1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testPawn1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		
		try{
			testPawn1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		
		try{
			testPawn1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		
		try{
			testPawn1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		
		try{
			testPawn1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
		
	@Test
	void testSetPositionA1Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		
		try{
			testPawn1.setPosition("a1");
		}catch (Exception e){
			
		}		
		assertEquals("a1" ,testPawn1.getPosition(),  "No position should have been set");
		
	}
	
	@Test
	void testSetPositionA8Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		
		try{
			testPawn1.setPosition("a8");
		}catch (Exception e){
			
		}		
		assertEquals("a8" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH1Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		
		try{
			testPawn1.setPosition("h1");
		}catch (Exception e){
			
		}		
		assertEquals("h1" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionH8Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		
		try{
			testPawn1.setPosition("h8");
		}catch (Exception e){
			
		}		
		assertEquals("h8" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	@Test
	void testSetPositionD5Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		
		try{
			testPawn1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testPawn1.getPosition(),  "No position should have been set");
	}
	
	/*
	 * Test Position can be moved
	 */
	@Test
	void testSetPositionD5toD8Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		
		try{
			testPawn1.setPosition("d5");
		}catch (Exception e){
			
		}		
		assertEquals("d5" ,testPawn1.getPosition(),  "No position should have been set");
		
		try{
			testPawn1.setPosition("d8");
		}catch (Exception e){
			
		}		
		assertEquals("d8" ,testPawn1.getPosition());
	}
	
	
	
	
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDWhite() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5White() {
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDBlack() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5Black() {
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		assertThrows(IllegalPositionException.class, () -> {testPawn1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testPawn1.getPosition() == null, "No position should have been set");
	}
	
	
	/*
	 * Test the Pawn for the list of legal moves on an open board 
	 */
	
	
	@Test
	void testPawnA1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "a1");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("a2"));		
	}
	
	@Test
	void testPawnA2OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "a2");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 2);
		assertTrue(moves.contains("a3"));
		assertTrue(moves.contains("a4"));
	}
	
	@Test
	void testPawnA8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "a8");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 0);				
		
	}
	
	@Test
	void testPawnH1OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "h1");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("h2"));	
	}
	
	@Test
	void testPawnH2OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "h2");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 2);
		assertTrue(moves.contains("h3"));
		assertTrue(moves.contains("h4"));
		
	}
	
	@Test
	void testPawnH8OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "h8");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 0);
	
	}
	
	@Test
	void testPawnE5OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "e5");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("e6"));
	
	}
	
	@Test
	void testPawnC7OpenBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		board.placePiece(testPawn1, "c7");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("c8"));
	
	}
	
	
	
	@Test
	void testPawnA1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "a1");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 0);
		
	}
	
	@Test
	void testPawnA8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "a8");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("a7"));

	}
	
	@Test
	void testPawnA7OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "a7");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 2);
		assertTrue(moves.contains("a6"));
		assertTrue(moves.contains("a5"));

	}
	
	@Test
	void testPawnH1OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "h1");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 0);

		
	}
	
	@Test
	void testPawnH8OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "h8");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("h7"));
		
	}
	
	@Test
	void testPawnH7OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "h7");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 2);
		assertTrue(moves.contains("h6"));
		assertTrue(moves.contains("h5"));
	}
	
	@Test
	void testPawnb3OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "b3");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("b2"));
		
	}
	
	@Test
	void testPawnE2OpenBoardMovesBlack(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		board.placePiece(testPawn1, "e2");
		moves = testPawn1.legalMoves();
		assertFalse(moves == null);
		assertTrue(moves.size() == 1);
		assertTrue(moves.contains("e1"));
		
	}
	
	
	/*
	 * Test to see if the Pawn will return the correct set of legal move on an occupied board.
	 */
	
	
	//Test with enemy pieces around
	@Test
	void testPawnC2OcuppiedBoardMovesWhite(){
		ArrayList<String> moves;
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		Pawn testPawn2 = new Pawn(board, Color.BLACK);
		Pawn testPawn3 = new Pawn(board, Color.BLACK);	
		Pawn testPawn4 = new Pawn(board, Color.BLACK);
		
		board.placePiece(testPawn1, "c2");
		board.placePiece(testPawn2, "b3");
		board.placePiece(testPawn3, "d3");
		board.placePiece(testPawn4, "c4");

		moves = testPawn1.legalMoves();
		
		assertFalse(moves == null);
		assertTrue(moves.size() == 3);		
		assertTrue(moves.contains("b3"));
		assertTrue(moves.contains("c3"));
		assertTrue(moves.contains("d3"));
		
	}
	
	//Test with friendly pieces around
		@Test
		void testPawnE4OcuppiedBoardMovesWhite(){
			ArrayList<String> moves;
			board = new ChessBoard();
			Pawn testPawn1 = new Pawn(board, Color.WHITE);
			Pawn testPawn2 = new Pawn(board, Color.WHITE);
			Pawn testPawn3 = new Pawn(board, Color.WHITE);
			Pawn testPawn4 = new Pawn(board, Color.WHITE);
			
			board.placePiece(testPawn1, "e4");
			board.placePiece(testPawn2, "d5");
			board.placePiece(testPawn3, "e5");
			board.placePiece(testPawn4, "f5");

			moves = testPawn1.legalMoves();
			
			assertFalse(moves == null);
			assertTrue(moves.size() == 0);		

			
		}
	
	
		//Test with enemy pieces around
		@Test
		void testPawnF6OcuppiedBoardMovesBlack(){
			ArrayList<String> moves;
			board = new ChessBoard();
			Pawn testPawn1 = new Pawn(board, Color.BLACK);
			Pawn testPawn2 = new Pawn(board, Color.WHITE);
			Pawn testPawn3 = new Pawn(board, Color.WHITE);	
			Pawn testPawn4 = new Pawn(board, Color.WHITE);
			
			board.placePiece(testPawn1, "f6");
			board.placePiece(testPawn2, "e5");
			board.placePiece(testPawn3, "f5");
			board.placePiece(testPawn4, "g5");

			moves = testPawn1.legalMoves();
			
			assertFalse(moves == null);
			assertTrue(moves.size() == 2);		
			assertTrue(moves.contains("e5"));
			assertTrue(moves.contains("g5"));
			
		}
		
		//Test with friendly pieces around
			@Test
			void testPawnE4OcuppiedBoardMovesBlack(){
				ArrayList<String> moves;
				board = new ChessBoard();
				Pawn testPawn1 = new Pawn(board, Color.BLACK);
				Pawn testPawn2 = new Pawn(board, Color.BLACK);
				Pawn testPawn3 = new Pawn(board, Color.BLACK);
				Pawn testPawn4 = new Pawn(board, Color.BLACK);
				
				board.placePiece(testPawn1, "e4");
				board.placePiece(testPawn2, "d3");
				board.placePiece(testPawn3, "e3");
				board.placePiece(testPawn4, "f3");

				moves = testPawn1.legalMoves();
				
				assertFalse(moves == null);
				assertTrue(moves.size() == 0);		

				
			}
	
	/*
	 * Test move rook to enemy piece location
	 */
	@Test
	void testPawnSetPositionToTakePieceWhite() {
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.WHITE);
		Pawn testPawn2 = new Pawn(board, Color.BLACK);
		
		board.placePiece(testPawn1, "b2");
		board.placePiece(testPawn2, "b2");			
			
		assertEquals("b2" ,testPawn1.getPosition(),  "No position should have been set");
		
		board.placePiece(testPawn1,"b3");
				
		assertEquals("b3" ,testPawn1.getPosition());
	}
	
	@Test
	void testPawnSetPositionToTakePieceBlack() {
		board = new ChessBoard();
		Pawn testPawn1 = new Pawn(board, Color.BLACK);
		Pawn testPawn2 = new Pawn(board, Color.WHITE);
		
		
			board.placePiece(testPawn1,"e5");
			board.placePiece(testPawn2,"g5");
		
		assertEquals("e5" ,testPawn1.getPosition(),  "No position should have been set");		
		
			board.placePiece(testPawn1,"g5");
			
		assertEquals("g5" ,testPawn1.getPosition());
	}

}
