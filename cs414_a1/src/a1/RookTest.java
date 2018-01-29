package a1;

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
	void testSetPositionA1() {
		fail();
	}
	
	@Test
	void testSetPositionA8() {
		fail();
	}
	
	@Test
	void testSetPositionH1() {
		fail();
	}
	
	@Test
	void testSetPositionH8() {
		fail();
	}
	
	@Test
	void testSetPositionD5() {
		fail();
	}
	
	/*
	 * Invalid Position Tests
	 */
	
	@Test //(expected = IllegalPositionException.class)
	void testSetPositionA0() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("a0");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionA9() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("a9");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPosition_1() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("`1");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionI8() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("i8");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionD() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("d");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	@Test
	void testSetPositionDD5() {
		Rook testRook1 = new Rook(board, Color.WHITE);
		assertThrows(IllegalPositionException.class, () -> {testRook1.setPosition("dd5");}, "Invalid posision did not throw an error");
		assertTrue(testRook1.getPosition() == null, "No position should have been set");
	}
	
	

}
